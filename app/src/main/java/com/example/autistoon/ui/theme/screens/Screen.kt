package com.example.autistoon.ui.theme.screens



enum class Screen {
    FT,
    Menu,

}

sealed class NavigationItem(val route: String)
{
    object FT: NavigationItem(Screen.FT.name)
    object Menu: NavigationItem(Screen.Menu.name)

}