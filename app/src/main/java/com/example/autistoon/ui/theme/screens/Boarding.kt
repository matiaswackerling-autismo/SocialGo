package com.example.autistoon.ui.theme.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import androidx.navigation.NavController
import com.example.autistoon.R
import com.example.autistoon.data.OnboardingItem
import com.example.autistoon.data.onboardingItems
import kotlinx.coroutines.launch


@Composable
fun OnboardingIndicator(
    pageCount: Int,
    currentPage: Int,
    onIndicatorClick: (Int) -> Unit
) {
    val smallSize = 10.dp
    val largeSize = 14.dp

    LazyRow(
        modifier = Modifier.padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(pageCount) { index ->
            val color =
                if (index == currentPage) colorResource(id = R.color.SocialGoTitle)
                else Color.LightGray

            val size = if (index == currentPage) largeSize else smallSize

            Box(
                modifier = Modifier
                    .size(size)
                    .clip(CircleShape)
                    .background(color)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(bounded = false),
                        onClick = { onIndicatorClick(index) }
                    )
            )
        }
    }
}

/* ---------------------------------------------------
   PÁGINA DE ONBOARDING
--------------------------------------------------- */

@Composable
fun OnboardingPage(
    item: OnboardingItem,
    isLastPage: Boolean,
    onFinish: () -> Unit
) {
    val configuration = LocalConfiguration.current
    val isTablet = configuration.screenWidthDp >= 600 // CAMBIO

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = item.image),
            contentDescription = item.title,
            modifier = Modifier
                .fillMaxWidth(0.85f)                // CAMBIO
                .aspectRatio(1f)
                .heightIn(                          // CAMBIO
                    min = 180.dp,
                    max = if (isTablet) 420.dp else 260.dp
                )
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = item.title,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            fontSize = if (isTablet) 26.sp else 20.sp,   // CAMBIO
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.SocialGoTitle)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = item.description,
            style = MaterialTheme.typography.bodyLarge,
            fontSize = if (isTablet) 18.sp else 14.sp,   // CAMBIO
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.gray_font),
            lineHeight = if (isTablet) 22.sp else 18.sp  // CAMBIO
        )

        Spacer(modifier = Modifier.height(48.dp))

        if (isLastPage) {
            Button(
                onClick = onFinish,
                modifier = Modifier
                    .fillMaxWidth(0.4f)                 // CAMBIO
                    .widthIn(max = 200.dp)              // CAMBIO
                    .height(48.dp),                     // CAMBIO
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.Accent_Green)
                )
            ) {
                Text(
                    "Comenzar",
                    fontSize = if (isTablet) 18.sp else 14.sp // CAMBIO
                )
            }
        }
    }
}

/* ---------------------------------------------------
   SCREEN PRINCIPAL
--------------------------------------------------- */

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(navController: NavController) {

    val pageCount = onboardingItems.size
    val pagerState = rememberPagerState(pageCount = { pageCount })
    val coroutineScope = rememberCoroutineScope()

    val onFinish = {
        navController.navigate(Screen.Menu.name) {
            popUpTo("onboarding") { inclusive = true }
        }
    }

    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 64.dp, max = 96.dp) // CAMBIO
                    .padding(bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OnboardingIndicator(
                    pageCount = pageCount,
                    currentPage = pagerState.currentPage,
                    onIndicatorClick = { page ->
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(page)
                        }
                    }
                )
            }
        }
    ) { paddingValues ->

        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) { page ->
            OnboardingPage(
                item = onboardingItems[page],
                isLastPage = page == pageCount - 1,
                onFinish = onFinish
            )
        }

        if (pagerState.currentPage < pageCount - 1) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = paddingValues.calculateTopPadding() + 8.dp,
                        end = 16.dp
                    )
            ) {
                TextButton(
                    onClick = onFinish,
                    modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Text(
                        "Saltar",
                        color = colorResource(id = R.color.Light_Accent_Green)
                    )
                }
            }
        }
    }
}