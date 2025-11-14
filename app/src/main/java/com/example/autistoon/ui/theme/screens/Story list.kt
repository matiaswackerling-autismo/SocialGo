package com.example.autistoon.ui.theme.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.autistoon.R
import com.example.autistoon.data.SharedData

@Preview(showBackground = true)
@Composable
fun storyListPreview(){
    struct2(rememberNavController())
}


@Composable
fun struct2(navController: NavController){
    //  Comics= listOf(Comics(icon = R.drawable.ej1, titulo = 1),Comics(icon = R.drawable.ej2, titulo = 2), Comics(icon = R.drawable.ej3, titulo = 3), Comics(icon = R.drawable.ej4, titulo = 4))
    Scaffold(
        topBar = { Topbar2() },
        content = { paddingValues -> CarouselList(paddingValues = paddingValues, navController) }
    )
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar2() {
    TopAppBar(
        title = {
            Text(
                "Título categoría!", modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                color = Color(0xff0D1C41),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                softWrap = true,
                fontSize = 30.sp
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        // .padding(bottom = 15.dp),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(
                0xffd0d7ee
            )
        )
    )

}

@Composable
fun CarouselList(paddingValues: PaddingValues, navController: NavController) {
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

    Text("Categoría 1", modifier = Modifier
        .padding(top = 120.dp, start = 20.dp)
        .fillMaxWidth(),
            color = Color(0xff0D1C41),
        textAlign = TextAlign.Left,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        softWrap = true,
        fontSize = 30.sp
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











