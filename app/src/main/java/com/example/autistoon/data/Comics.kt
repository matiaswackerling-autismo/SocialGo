package com.example.autistoon.data

import androidx.annotation.DrawableRes

data class Comics(@DrawableRes val icon: Int, val titulo: Int)

object SharedData{
    var sharedText: String =""
}