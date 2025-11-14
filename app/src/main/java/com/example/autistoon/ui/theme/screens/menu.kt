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
fun Menupreview() {
    Struct(rememberNavController())
}


@Composable
fun Struct(navController: NavController) {
    //  Comics= listOf(Comics(icon = R.drawable.ej1, titulo = 1),Comics(icon = R.drawable.ej2, titulo = 2), Comics(icon = R.drawable.ej3, titulo = 3), Comics(icon = R.drawable.ej4, titulo = 4))
    Scaffold(
        topBar = { Topbar() },
        content = { paddingValues -> Content1(paddingValues = paddingValues, navController) }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar() {
    TopAppBar(
        title = {
            Text(
                "Bienvenido ${SharedData.sharedText}!", modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                color = Color(0xff0D1C41),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                softWrap = true,
                fontSize = 54.sp
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
fun Content1(paddingValues: PaddingValues, navController: NavController) {
    val comicNum = listOf(
        R.drawable.tristeza to "Tristeza",
        R.drawable.frustraci_n to "Frustración",
        R.drawable.ansiedad to "Ansiedad",
        R.drawable.enojo to "Enojo",
        R.drawable.sorpresa to "Sorpresa"
    )
    Text(text="Categoría 1", modifier = Modifier
        .fillMaxWidth()
        .padding(top = 130.dp)
        ,
        color = Color(0xff0D1C41),
        textAlign = TextAlign.Start,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        softWrap = true,
        fontSize = 30.sp)
    LazyRow (
        modifier = Modifier
            .padding(top = 170.dp, bottom = 500.dp)
            .fillMaxWidth()
            //.height(1000.dp)
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

        items(comicNum) { (drawable, name) ->
            Maincard(drawable = drawable, name = name, navController = navController)
        }
    }
}

@Composable
fun Maincard(@DrawableRes drawable: Int, name: String, navController: NavController) {
    OutlinedCard(
        colors = CardDefaults.outlinedCardColors(
            containerColor = Color.White
            //contentColor = Color(0x273149)
        ),
        shape = RoundedCornerShape(30.dp),
        modifier = Modifier
           // .offset(y = 70.dp)
            .padding(vertical = 0.dp)
            .padding(15.dp)
            .fillMaxWidth()
            .clickable(onClick = {
                if (name == "Tristeza") {
                    navController.navigate(NavigationItem.Display1.route)
                }
                if (name == "Frustración") {
                    navController.navigate(NavigationItem.Display2.route)
                }
                if (name == "Ansiedad") {
                    navController.navigate(NavigationItem.Display3.route)
                }
                if (name == "Enojo") {
                    navController.navigate(NavigationItem.Display4.route)
                }
                if (name == "Sorpresa"){
                    navController.navigate(NavigationItem.Display5.route)
                }
            })
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Tarjeta(drawable = drawable)
            Text(
                text = " $name",
                fontSize = 44.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                color = Color(0xff0D1C41),
                modifier = Modifier.padding(bottom = 40.dp)
            )
        }
    }
}

@Composable
fun Tarjeta(@DrawableRes drawable: Int) {
    OutlinedCard(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .padding(2.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = drawable),
            contentDescription = null,
            modifier = Modifier
                //.size(600.dp)
                .fillMaxSize()
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
    }
}












