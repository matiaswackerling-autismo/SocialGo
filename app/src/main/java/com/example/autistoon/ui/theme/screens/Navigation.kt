package com.example.autistoon.ui.theme.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.navArgument
import com.example.autistoon.data.MenuViewModel
import com.example.autistoon.data.StoryViewModel


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
            OnboardingScreen(navController)

        }
        composable(route = NavigationItem.Menu.route)
        {
            menuScreen(navController)
        }
        composable(route = "detalle/{storyTitle}",
            arguments = listOf(navArgument("storyTitle"){ type = NavType.StringType}))
        {
            backStackEntry ->
            val storyTitle = backStackEntry.arguments?.getString("storyTitle") ?: ""

            val viewModel: MenuViewModel = viewModel()
            val historia = viewModel.categorias
                .flatMap {it.items}
                .first{it.storyTitle == storyTitle}

            DetailScreen(historia = historia, navController)
        }
        composable(
            route = "leerHistoria/{storyTitle}",
            arguments = listOf(navArgument("storyTitle") { type = NavType.StringType })
        ) { backStackEntry ->

            val storyTitle = backStackEntry.arguments?.getString("storyTitle") ?: ""

            val viewModel: MenuViewModel = viewModel()
            val historia = viewModel.categorias
                .flatMap { it.items }
                .first { it.storyTitle == storyTitle }


            val storyVM: StoryViewModel = viewModel()

            LaunchedEffect(historia.storyTitle) {
                storyVM.loadStory(historia.pages)
            }

            StoryReaderAdvancedScreen(
                historia = historia,
                storyVM = storyVM,
                navController = navController
            )
        }


    }
}