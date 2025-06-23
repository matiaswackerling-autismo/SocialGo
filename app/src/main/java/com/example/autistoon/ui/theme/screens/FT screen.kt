package com.example.autistoon.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.autistoon.R

@Preview(showBackground = true)
@Composable
fun FSpreview() {
    FS(rememberNavController())

}

@Composable
fun FS(navController: NavController) {
    Background()
    ImageEx()
    Name(navController)
}

@Composable
fun Name(navController: NavController) {

    Box(
        modifier = Modifier

            .fillMaxWidth()           //size(width = 330.dp, height = 60.dp)
            .padding(top = 500.dp)
            .fillMaxHeight(),
        contentAlignment = Alignment.Center


    ) {

        Button(
            onClick = { navController.navigate(NavigationItem.FtName.route) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff445e91)),
            modifier = Modifier.size(width = 350.dp, height = 110.dp)

        )
        {
            Text("Empecemos", fontSize = 32.sp, color = Color.White)


        }
    }
}

@Composable
fun ImageEx() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            //.background(Color.Black)
            .padding(top = 100.dp)
            .padding(20.dp),
        contentAlignment = Alignment.Center

    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_alpha),
            contentDescription = "logo",
            modifier = Modifier
                .size(700.dp)
                //.border(5.dp, Color.Gray, shape = RoundedCornerShape(200.dp))
                .padding(8.dp)
        )
    }

}

@Composable
fun Background() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFd0d7ee),
                        Color.Transparent
                    )
                )
            )


    )

}


