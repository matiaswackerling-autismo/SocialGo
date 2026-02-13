package com.example.autistoon.ui.theme.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.autistoon.R
import com.example.autistoon.data.Historia
import com.example.autistoon.data.StoryPage
import com.example.autistoon.data.StoryViewModel
import com.example.autistoon.ui.theme.LocalScreenWidth
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset

@Composable
fun EdgeGlowIndicator(isVisible: Boolean, color: Color = colorResource(id = R.color.Accent_Green)) {

    val delayMS = 500
    AnimatedVisibility(
        visible = isVisible,
        enter = fadeIn(
            animationSpec = tween(
                durationMillis = 1500,
                delayMillis = delayMS
            )
        ) + slideInHorizontally(
            initialOffsetX = { fullWidth -> fullWidth / 4 },
            animationSpec = tween(
                durationMillis = 1500,
                delayMillis = delayMS
            )
        ),
        exit = fadeOut(tween(500))
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawWithContent {
                    val brush = Brush.linearGradient(

                        colors = listOf(
                            Color.Transparent,
                            color.copy(alpha = 0.01f),
                            color.copy(alpha = 0.8f)
                        ),
                        start = Offset(size.width * 0.95f, 0f),
                        end = Offset(size.width, 0f),
                        tileMode = TileMode.Clamp
                    )

                    drawRect(brush = brush, size = size)
                }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun StoryReaderAdvancedScreen(
    historia: Historia,
    storyVM: StoryViewModel,
    navController: NavController
) {
    val screenWidth = LocalScreenWidth.current
    val isTablet = screenWidth.value >= 600
    val pages = storyVM.pages
    val scope = rememberCoroutineScope()

    val pagerState = rememberPagerState(pageCount = { pages.size })

    var currentRevealJob by remember { mutableStateOf<kotlinx.coroutines.Job?>(null) }

    val isAutoRevealStarted = remember(pagerState.currentPage) {
        mutableStateOf(false)
    }

    LaunchedEffect(Unit) {
        storyVM.resetStoryState()
    }

    LaunchedEffect(pagerState.currentPage) {
        currentRevealJob?.cancel()
        currentRevealJob = null
    }

    if (pages.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Esta historia no tiene páginas.", color = Color.Gray)
            Button(onClick = { navController.popBackStack() }) { Text("Volver") }
        }
        return
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(historia.storyTitle, color = colorResource(id = R.color.blue_font), fontSize = if (isTablet) 20.sp else 18.sp )
                        Text(
                            text = "${pagerState.currentPage + 1} / ${pages.size}",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Gray
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_arrow),
                            contentDescription = "Volver",
                            tint = colorResource(id = R.color.blue_font)
                        )
                    }
                }
            )
        }
    ) { padding ->

        Box(modifier = Modifier.fillMaxSize().padding(padding). background(colorResource(id = R.color.background1))) {

            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) { pageIndex ->

                val pageData = pages[pageIndex]

                val allPanelsRevealed = pageData.panels.all { it.isVisible }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .pointerInput(pageIndex)
                        {
                            detectTapGestures (
                                onTap = {
                                    if (currentRevealJob?.isActive != true) {

                                        currentRevealJob = scope.launch {
                                            startAutoReveal(
                                                vm = storyVM,
                                                pageIndex = pageIndex,
                                                onStarted = { isAutoRevealStarted.value = true }
                                            )
                                        }
                                    }
                                }
                            )
                        }
                ) {
                    StoryPage(page = pageData)
                    EdgeGlowIndicator(isVisible = allPanelsRevealed, color = colorResource(id = R.color.Light_Accent_Green))
                }
            }

            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 16.dp)
            ) {
                AnimatedVisibility(
                    visible = pagerState.currentPage == pages.size - 1,
                    enter = scaleIn(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessLow
                        )
                    ) + fadeIn(),
                    exit = scaleOut() + fadeOut()
                ) {
                    Button(
                        onClick = { navController.navigate(NavigationItem.Menu.route) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.mint_det)
                        )
                    ) {
                        Text("Finalizar Historia y Volver")
                    }
                }
            }
        }
    }
}

private val AUTO_REVEAL_DELAY = 3.seconds.inWholeMilliseconds

suspend fun startAutoReveal(
    vm: StoryViewModel,
    pageIndex: Int,
    onStarted: () -> Unit
) {
    val pages = vm.pages
    if (pageIndex !in pages.indices) return

    val page = pages[pageIndex]

    var nextPanelIndex = page.panels.indexOfFirst { !it.isVisible }

    if (nextPanelIndex != -1) {
        vm.revealPanel(pageIndex, nextPanelIndex)

        onStarted()

        while (true) {
            nextPanelIndex = page.panels.indexOfFirst { !it.isVisible }

            if (nextPanelIndex == -1) {
                break
            }

            delay(AUTO_REVEAL_DELAY)

            vm.revealPanel(pageIndex, nextPanelIndex)
        }
    }
}
