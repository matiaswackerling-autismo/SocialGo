package com.example.autistoon.ui.theme.screens

import android.icu.text.CaseMap


enum class Screen {
    FT,
    FtName,
    Menu,

}

sealed class NavigationItem(val route: String)
{
    object FT: NavigationItem(Screen.FT.name)
    object FtName: NavigationItem(Screen.FtName.name)
    object Menu: NavigationItem(Screen.Menu.name)

}