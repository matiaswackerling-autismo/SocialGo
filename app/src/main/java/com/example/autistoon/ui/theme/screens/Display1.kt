package com.example.autistoon.ui.theme.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.getDrawable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.autistoon.R
import com.google.accompanist.drawablepainter.rememberDrawablePainter


@Preview(showBackground = true)
@Composable
fun Pbb() {
    BackBtn(rememberNavController())
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BackBtn(navController: NavController) {
    TopAppBar(
        title = { Text("ola", color = Color(0x00ffffff)) },
        navigationIcon = {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 700.dp),
                onClick = { navController.navigate(NavigationItem.Menu.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0x000D1C41))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_arrow),
                    contentDescription = null,
                    tint = Color(0xFF0D1C41),
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(120.dp)
                )
            }

        },
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xffd0d7ee)
        )
    )

}


@Composable
fun Carousel(paddingValues: PaddingValues) {
    val hist = listOf(
        R.drawable.testia1,
        R.drawable.image2,
        R.drawable.ansiedad3,
        R.drawable.ansiedad4,
        R.drawable.ansiedad5,
        R.drawable.ansiedad6,
        R.drawable.ansiedad7,
        R.drawable.image8,
        R.drawable.ansiedad9,
    )
    LazyRow(
        modifier = Modifier
            .padding(top = 90.dp)
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xffd0d7ee),
                        Color.Transparent
                    )
                )
            ),
        state = rememberLazyListState()
    ) {
        items(hist) { drawable ->
            Maincard(drawable = drawable)
        }
    }
}

@Composable
fun Maincard(@DrawableRes drawable: Int) {
    OutlinedCard(
        colors = CardDefaults.outlinedCardColors(
            containerColor = Color.White
            //contentColor = Color(0x273149)
        ),
        shape = RoundedCornerShape(80.dp),
        modifier = Modifier
            // .offset(y = 70.dp)
            .padding(top = 100.dp)
            .padding(20.dp)
            .size(750.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Tarjet(drawable = drawable)

        }
    }
}

@Composable
fun Tarjet(@DrawableRes drawable: Int) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,  // Centra horizontalmente
        verticalArrangement = Arrangement.Center) {
        OutlinedCard(
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .padding(40.dp)
                .fillMaxHeight()


            ) {
            Image(
                painter = painterResource(id = drawable),
                contentDescription = null,
                modifier = Modifier
                    //.size(600.dp)
                    .fillMaxHeight(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun Perrochill() {
    OutlinedCard(
        shape = RoundedCornerShape(40.dp),
        modifier = Modifier
            .padding(40.dp)
            .fillMaxWidth()
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .scale(1.5f)
                .padding(start = 85.dp, top = 40.dp),

            painter = rememberDrawablePainter(drawable = getDrawable(LocalContext.current, R.drawable.perrochillgif)),

            contentDescription = "GIF animado",

            contentScale = ContentScale.Crop
        )


    }
}

@Composable
fun Perrocard(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xffd0d7ee),
                        Color.Transparent
                    )
                )
            )
    ) {
        OutlinedCard(
            colors = CardDefaults.outlinedCardColors(
                containerColor = Color.White
                //contentColor = Color(0x273149)
            ),
            shape = RoundedCornerShape(80.dp),
            modifier = Modifier
                // .offset(y = 70.dp)
                .padding(top = 100.dp)
                .padding(20.dp)
                .size(750.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Perrochill()

            }
        }
    }

}


@Composable
fun Display1(navController: NavController) {
    Scaffold(topBar = { BackBtn(navController) },
        content = { paddingValues -> Carousel(paddingValues = paddingValues) })
}


@Composable
fun Display2(navController: NavController) {
    Scaffold(topBar = { BackBtn(navController) },
        content = { paddingValues -> Carousel(paddingValues = paddingValues) })
}


@Composable
fun Display3(navController: NavController) {
    Scaffold(topBar = { BackBtn(navController) },
        content = { paddingValues -> Carousel(paddingValues = paddingValues) })
}


@Composable
fun Display4(navController: NavController) {
    Scaffold(topBar = { BackBtn(navController) },
        content = { paddingValues -> Carousel(paddingValues = paddingValues) })
}

@Composable
fun Display5(navController: NavController) {
    Scaffold(topBar = { BackBtn(navController) },
        content = { paddingValues -> Perrocard(paddingValues = paddingValues) })
}

















