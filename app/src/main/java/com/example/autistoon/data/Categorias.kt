package com.example.autistoon.data

data class Categoria(val titulo: String, val descripcionCat: Int, val coverCat: Int, val items: List<Historia>)

data class Historia(val storyTitle: String, val cover: Int, val banner: Int, val descripcionRaw: Int, val pages: List<StoryPageData>)