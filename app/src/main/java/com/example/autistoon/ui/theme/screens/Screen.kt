package com.example.autistoon.ui.theme.screens


enum class Screen {
    FT,
    FtName,
    Menu,
    Display1,
    Display2,
    Display3,
    Display4,
    Display5
}

sealed class NavigationItem(val route: String)
{
    object FT: NavigationItem(Screen.FT.name)
    object FtName: NavigationItem(Screen.FtName.name)
    object Menu: NavigationItem(Screen.Menu.name)
    object Display1: NavigationItem(Screen.Display1.name)
    object Display2: NavigationItem(Screen.Display2.name)
    object Display3: NavigationItem(Screen.Display3.name)
    object Display4: NavigationItem(Screen.Display4.name)
    object Display5: NavigationItem(Screen.Display5.name)

}