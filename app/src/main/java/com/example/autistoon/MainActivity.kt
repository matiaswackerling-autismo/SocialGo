package com.example.autistoon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.autistoon.ui.theme.AutistoonTheme
import com.example.autistoon.ui.theme.screens.AppNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContent {
            AutistoonTheme {

                    AppNavHost(navController = rememberNavController())
            }




        }
    }
}
