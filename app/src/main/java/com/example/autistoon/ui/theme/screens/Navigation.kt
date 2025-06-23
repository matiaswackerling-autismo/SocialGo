package com.example.autistoon.ui.theme.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.navArgument


@Composable
fun AppNavHost(
    modifier:  Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.FT.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(route = NavigationItem.FT.route)
        {
            FS(navController)

        }
        composable(route = NavigationItem.FtName.route)
        {
            FirstTime(navController)
        }
        composable(route = NavigationItem.Menu.route)
        {
            Struct(navController)
        }
        composable(route = NavigationItem.Display1.route)
        {
            Display1(navController)
        }
        composable(route = NavigationItem.Display2.route)
        {
            Display2(navController)
        }
        composable(route = NavigationItem.Display3.route)
        {
            Display3(navController)
        }
        composable(route = NavigationItem.Display4.route)
        {
            Display4(navController)
        }
        composable(route = NavigationItem.Display5.route)
        {
            Display5(navController)
        }


    }
}