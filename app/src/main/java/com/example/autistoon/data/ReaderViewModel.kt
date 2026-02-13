package com.example.autistoon.data

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel


class StoryViewModel : ViewModel() {
    private val _pages = mutableStateListOf<StoryPageData>()
    val pages: List<StoryPageData> get() = _pages

    fun loadStory(newPages: List<StoryPageData>) {
        _pages.clear()
        val cleanPages = newPages.map { page ->
            page.copy(panels = page.panels.map { p ->
                Panel(p.text, p.xProportion, p.yProportion, p.widthProportion, p.heightProportion, p.type, false)
            })
        }
        _pages.addAll(cleanPages)
    }

    fun resetStoryState() {
        _pages.forEach { page ->
            page.panels.forEach { it.isVisible = false }
        }
    }

    fun revealPanel(pageIndex: Int, panelIndex: Int) {
        if (pageIndex in _pages.indices) {
            val panels = _pages[pageIndex].panels
            if (panelIndex in panels.indices) {
                panels[panelIndex].isVisible = true

                val tempPage = _pages[pageIndex]
                _pages[pageIndex] = tempPage.copy()
            }
        }
    }
}