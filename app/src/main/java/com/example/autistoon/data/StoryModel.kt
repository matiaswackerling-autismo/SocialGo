package com.example.autistoon.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color


enum class BubbleType {
    DIALOGUE, // Viñeta rectangular normal
    THOUGHT // Viñeta de nube (ThoughtBubbleShape)
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
    val staticTexts: List<staticText> = emptyList(),
    val recomendaciones: List<Recomendacion> = emptyList()
)

data class staticText(
    val text: String,
    val position: StaticPosition,
    val backgroundColor: Color = Color.Transparent // Por defecto transparente para que luzca integrado
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
    // Esta línea es la magia que conecta tu ViewModel con la Animación
    var isVisible by mutableStateOf(initialVisibility)
}

fun page(
    base: Int,
    staticTexts: List<staticText> = emptyList(),
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
        baseImage = 0, // Sin fondo
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

// Función para crear un Panel de DIÁLOGO (Rectangular)
fun d(
    text: String,
    x: Int,
    y: Int,
    width: Int,
    height: Int
) = p(text, x, y, width, height, BubbleType.DIALOGUE)

// Función para crear un Panel de PENSAMIENTO (Nube)
fun t(
    text: String,
    x: Int,
    y: Int,
    width: Int,
    height: Int
) = p(text, x, y, width, height, BubbleType.THOUGHT)

fun sTop(text: String) = staticText(text, StaticPosition.TOP)
fun sBottom(text: String) = staticText(text, StaticPosition.BOTTOM)
fun rec(img: Int, txt: String) = Recomendacion(img, txt)