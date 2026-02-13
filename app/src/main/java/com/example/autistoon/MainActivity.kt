package com.example.autistoon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.autistoon.ui.theme.AutistoonTheme
import com.example.autistoon.ui.theme.LocalScreenHeight
import com.example.autistoon.ui.theme.LocalScreenWidth
import com.example.autistoon.ui.theme.screens.AppNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContent {
            val config = LocalConfiguration.current
            CompositionLocalProvider(
                LocalScreenWidth provides config.screenWidthDp.dp,
                LocalScreenHeight provides config.screenHeightDp.dp,


            ){
            AutistoonTheme {

                AppNavHost(navController = rememberNavController())
            }
            }




        }
    }
}
