package com.example.autistoon.ui.theme.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.autistoon.R
import com.example.autistoon.data.Historia
import com.example.autistoon.data.StoryPage
import com.example.autistoon.data.StoryPageData
import com.example.autistoon.data.StoryViewModel
import com.example.autistoon.ui.theme.LocalScreenWidth

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import kotlinx.coroutines.Job

@Composable
fun EdgeGlowIndicator(isVisible: Boolean, color: Color = colorResource(id = R.color.Accent_Green)) {

    val DELAY_MS = 500
    // La animación de entrada/salida será más suave si usamos AnimatedVisibility
    AnimatedVisibility(
        visible = isVisible,
        enter = fadeIn(
            animationSpec = tween(
                durationMillis = 1500,  // Duración de la aparición (rápida)
                delayMillis = DELAY_MS // Tiempo que espera antes de empezar
            )
        ) + slideInHorizontally(
            initialOffsetX = { fullWidth -> fullWidth / 4 },
            animationSpec = tween(
                durationMillis = 1500,
                delayMillis = DELAY_MS
            )
        ),
        exit = fadeOut(tween(500))
    ) {
        // Usamos Box para ocupar el espacio y aplicar el gradiente
        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawWithContent {
                    val brush = Brush.linearGradient(
                        // Va de transparente a semi-transparente del centro a la derecha
                        colors = listOf(
                            Color.Transparent, // Extremo izquierdo (90%)
                            color.copy(alpha = 0.01f), // Zona de transición (95%)
                            color.copy(alpha = 0.8f) // Extremo derecho (100%)
                        ),
                        start = Offset(size.width * 0.95f, 0f), // Empieza al 90% del ancho
                        end = Offset(size.width, 0f), // Termina al 100%
                        tileMode = TileMode.Clamp
                    )

                    // Dibuja el gradiente vertical sobre el contenido
                    drawRect(brush = brush, size = size)
                }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun StoryReaderAdvancedScreen(
    historia: Historia,
    storyVM: StoryViewModel,
    navController: NavController
) {
    val screenWidth = LocalScreenWidth.current
    val isTablet = screenWidth.value >= 600
    val pages = storyVM.pages
    val scope = rememberCoroutineScope()

    // Configuración del Pager (Slide)
    // initialPage = 0 por defecto
    val pagerState = rememberPagerState(pageCount = { pages.size })

    var currentRevealJob by remember { mutableStateOf<kotlinx.coroutines.Job?>(null) }

    val isAutoRevealStarted = remember(pagerState.currentPage) {
        mutableStateOf(false)
    }

    LaunchedEffect(Unit) {
        storyVM.resetStoryState()
    }

    LaunchedEffect(pagerState.currentPage) {
        currentRevealJob?.cancel()
        currentRevealJob = null
    }

    // Manejo de caso vacío
    if (pages.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Esta historia no tiene páginas.", color = Color.Gray)
            Button(onClick = { navController.popBackStack() }) { Text("Volver") }
        }
        return
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    // Mostramos título y el indicador de página actual (ej: 1/5)
                    Column {
                        Text(historia.storyTitle, color = colorResource(id = R.color.blue_font), fontSize = if (isTablet) 20.sp else 18.sp )
                        Text(
                            text = "${pagerState.currentPage + 1} / ${pages.size}",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Gray
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_arrow),
                            contentDescription = "Volver",
                            tint = colorResource(id = R.color.blue_font)
                        )
                    }
                }
            )
        }
    ) { padding ->

        Box(modifier = Modifier.fillMaxSize().padding(padding). background(colorResource(id = R.color.background1))) {

            // COMPONENTE PRINCIPAL DE SLIDE (PAGER)
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) { pageIndex ->

                val pageData = pages[pageIndex]

                val allPanelsRevealed = pageData.panels.all { it.isVisible }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        // Detectar TAP para revelar viñetas en la página actual
                        .pointerInput(pageIndex)
                        {
                            detectTapGestures (
                                onTap = {
                                    if (currentRevealJob?.isActive != true) {

                                        currentRevealJob = scope.launch {
                                            // 2. Iniciar el proceso: Muestra el primer panel y activa el bucle.
                                            startAutoReveal(
                                                vm = storyVM,
                                                pageIndex = pageIndex,
                                                onStarted = { isAutoRevealStarted.value = true }
                                            )
                                        }
                                    }
                                }
                            )
                        }
                ) {
                    // 1. Imagen base de la página actual
                    StoryPage(page = pageData)
                    EdgeGlowIndicator(isVisible = allPanelsRevealed, color = colorResource(id = R.color.Light_Accent_Green))
                }
            }

            // BOTÓN FINAL - Solo aparece en la última página
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 16.dp)
            ) {
                AnimatedVisibility(
                    visible = pagerState.currentPage == pages.size - 1, // Solo en la última página
                    enter = scaleIn(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy, // Efecto rebote (Pop)
                            stiffness = Spring.StiffnessLow
                        )
                    ) + fadeIn(),
                    exit = scaleOut() + fadeOut()
                ) {
                    Button(
                        onClick = { navController.navigate(NavigationItem.Menu.route) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.mint_det)
                        )
                    ) {
                        Text("Finalizar Historia y Volver")
                    }
                }
            }
        }
    }
}

// La función suspendida se mantiene igual, solo asegúrate de que el ViewModel actualice el estado
private val AUTO_REVEAL_DELAY = 3.seconds.inWholeMilliseconds // 4000 ms

suspend fun startAutoReveal(
    vm: StoryViewModel,
    pageIndex: Int,
    onStarted: () -> Unit
) {
    val pages = vm.pages
    if (pageIndex !in pages.indices) return

    val page = pages[pageIndex]

    // 1. Primer Panel (Tap inicial)
    var nextPanelIndex = page.panels.indexOfFirst { !it.isVisible }

    if (nextPanelIndex != -1) {
        // Revela el primer panel
        vm.revealPanel(pageIndex, nextPanelIndex)

        // Notificamos que el proceso ha comenzado
        onStarted()

        // 2. Bucle para revelación automática (solo si quedan más paneles)
        while (true) {
            // Buscamos el siguiente panel *después* de la revelación
            nextPanelIndex = page.panels.indexOfFirst { !it.isVisible }

            if (nextPanelIndex == -1) {
                // Si no hay más paneles, salimos del bucle
                break
            }

            // Esperar 4 segundos antes de revelar el siguiente
            delay(AUTO_REVEAL_DELAY)

            // Revelar el siguiente panel
            vm.revealPanel(pageIndex, nextPanelIndex)
        }
    }
}
