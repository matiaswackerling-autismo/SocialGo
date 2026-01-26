package com.example.autistoon.data

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class StoryViewModel : ViewModel() {
    private val _pages = mutableStateListOf<StoryPageData>()
    val pages: List<StoryPageData> get() = _pages

    fun loadStory(newPages: List<StoryPageData>) {
        _pages.clear()
        val cleanPages = newPages.map { page ->
            page.copy(panels = page.panels.map { p ->
                // Re-instanciamos cada panel para romper cualquier persistencia de la ejecución anterior
                Panel(p.text, p.xProportion, p.yProportion, p.widthProportion, p.heightProportion, p.type, false)
            })
        }
        _pages.addAll(cleanPages)
    }

    // Función crucial para "apagar las luces" antes de animar
    fun resetStoryState() {
        _pages.forEach { page ->
            page.panels.forEach { it.isVisible = false }
        }
    }

    private fun resetSpecificPages(list: List<StoryPageData>) {
        list.forEach { page ->
            page.panels.forEach { it.isVisible = false }
        }
    }

    fun revealPanel(pageIndex: Int, panelIndex: Int) {
        if (pageIndex in _pages.indices) {
            val panels = _pages[pageIndex].panels
            if (panelIndex in panels.indices) {
                // 1. Cambiamos el valor
                panels[panelIndex].isVisible = true

                // 2. TRUCO CRÍTICO: "Ensuciamos" la lista para forzar a Compose
                // a re-leer TODA la página. Esto despierta a las animaciones dormidas.
                val tempPage = _pages[pageIndex]
                _pages[pageIndex] = tempPage.copy()
            }
        }
    }
}