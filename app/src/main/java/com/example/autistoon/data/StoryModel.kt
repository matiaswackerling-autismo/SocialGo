package com.example.autistoon.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color


enum class BubbleType {
    DIALOGUE, // Viñeta normal
    THOUGHT // Viñeta de nube
}
enum class StaticPosition {
    TOP, BOTTOM
}
data class Recomendacion(
    val imageRes: Int,
    val text: String
)

data class StoryPageData(
    val baseImage: Int,
    val panels: List<Panel> = emptyList(),
    val staticTexts: List<StaticText> = emptyList(),
    val recomendaciones: List<Recomendacion> = emptyList()
)

data class StaticText(
    val text: String,
    val position: StaticPosition,
    val backgroundColor: Color = Color.Transparent
)

class Panel(
    val text: String,
    val xProportion: Int,
    val yProportion: Int,
    val widthProportion: Int,
    val heightProportion: Int,
    val type: BubbleType,
    initialVisibility: Boolean = false
){
    var isVisible by mutableStateOf(initialVisibility)
}

fun page(
    base: Int,
    staticTexts: List<StaticText> = emptyList(),
    vararg panels: Panel
): StoryPageData {
    return StoryPageData(
        baseImage = base,
        panels = panels.toList(),
        staticTexts = staticTexts,
        recomendaciones = emptyList()
    )
}
fun pageRecs(
    recomendaciones: List<Recomendacion>
): StoryPageData {
    return StoryPageData(
        baseImage = 0,
        panels = emptyList(),
        staticTexts = emptyList(),
        recomendaciones = recomendaciones
    )
}
fun p(
    text: String,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    type: BubbleType
) = Panel(text, x, y, width, height, type )

fun d(
    text: String,
    x: Int,
    y: Int,
    width: Int,
    height: Int
) = p(text, x, y, width, height, BubbleType.DIALOGUE)

fun t(
    text: String,
    x: Int,
    y: Int,
    width: Int,
    height: Int
) = p(text, x, y, width, height, BubbleType.THOUGHT)

fun sTop(text: String) = StaticText(text, StaticPosition.TOP)
fun sBottom(text: String) = StaticText(text, StaticPosition.BOTTOM)
fun rec(img: Int, txt: String) = Recomendacion(img, txt)