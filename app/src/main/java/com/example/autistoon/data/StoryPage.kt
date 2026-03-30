package com.example.autistoon.data

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.Alignment
import androidx.compose.runtime.key
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.autistoon.R

private val MASTER_THOUGHT_PATH = Path().apply {
    val br = 15f

    addRoundRect(
        androidx.compose.ui.geometry.RoundRect(
            rect = Rect(15f, 15f, 85f, 85f),
            cornerRadius = CornerRadius(15f, 15f)
        )
    )

    // Burbujas Superiores
    addOval(Rect(12f, 17f - br, 37f, 15f + br/2))
    addOval(Rect(32f, 15f - br, 59f, 15f + br/2))
    addOval(Rect(52f, 15f - br, 85f, 15f + br/2))

    // Burbujas Inferiores
    addOval(Rect(13f, 75f - br/2, 40f, 80f + br))
    addOval(Rect(38f, 85f - br/2, 68f, 80f + br))
    addOval(Rect(65f, 85f - br/2, 90f, 80f + br))

    // Burbujas Laterales
    addOval(Rect(20f - br, 11f, 15f + br/2, 47f))
    addOval(Rect(18f - br, 40f, 15f + br/2, 85f))
    addOval(Rect(85f - br/2, 10f, 85f + br, 53f))
    addOval(Rect(85f - br/2, 40f, 85f + br, 85f))

    close()
}

@Composable
fun PanelBubble(panel: Panel, width: Dp, height: Dp) {
    val bubbleColor = Color.White
    val maxDevWidth = LocalConfiguration.current
    val isTablet = maxDevWidth.screenWidthDp >= 600             //Umbral para cambio tablet-celular
    val calculatedFontSize = if (isTablet) 16.sp else 10.sp     //Tamaño de fuente para viñetas. Modificar en caso de que no entren los textos


    Box(
        modifier = Modifier
            .requiredSize(width, height)
            .graphicsLayer {
                clip = false
                compositingStrategy = CompositingStrategy.ModulateAlpha
            }
            .drawBehind {
                if (panel.type == BubbleType.DIALOGUE) {
                    drawRoundRect(
                        color = bubbleColor,
                        cornerRadius = CornerRadius(18.dp.toPx())
                    )
                } else {
                    val scaleX = size.width / 100f
                    val scaleY = size.height / 100f

                    withTransform({
                        scale(scaleX, scaleY, Offset.Zero)
                    }) {
                        drawPath(path = MASTER_THOUGHT_PATH, color = bubbleColor)
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = panel.text,
            fontSize = calculatedFontSize,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(vertical = 8.dp),
            softWrap = true,
            lineHeight = calculatedFontSize * 1.1f     //En caso de demasiada separación entre lineas, modificar: >1 agranda - <1 achica.
        )
    }
}
@Composable
private fun AnimatedPanelContainer(
    panel: Panel,
    x: Dp,
    y: Dp,
    width: Dp,
    height: Dp
) {
    Box(modifier = Modifier.fillMaxSize()) {
        AnimatedVisibility(
            visible = panel.isVisible,
            enter = fadeIn(tween(1000)) + scaleIn(initialScale = 0.8f, animationSpec = tween(1000)),
            modifier = Modifier.offset(x = x, y = y)
        ) {
            PanelBubble(
                panel = panel,
                width = width,
                height = height
            )
        }
    }
}

@Composable
fun StoryPage(page: StoryPageData) {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {

        val isTablet = maxWidth >= 600.dp            //umbral tablet-celular

        val maxWidthPx = maxWidth
        val screenHeight = maxHeight
        val scaleFactor = maxWidthPx.value / 1000.0f
        val heightFactor = if(isTablet) 1f else 1.1f
        val widthFactor = if(isTablet) 1f else 1f
        val positionFactor = if (isTablet) 1f else 1.55f        //Modificar los else en caso de que algo no se vea bien.

        val titleScale = if (isTablet) 0.03f else 0.024f
        val bodyScale = if (isTablet) 16.sp else 12.sp
        val staticTextScale = if (isTablet) 0.032f else 0.036f

        val horizontalPadding = if (isTablet) 32.dp else 20.dp
        val verticalPadding = if (isTablet) 46.dp else 18.dp
        val itemSpacing = if (isTablet) 14.dp else 12.dp

        if (page.baseImage == 0) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF5F5F5))
            )
        } else {
            Image(
                painter = painterResource(page.baseImage),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxHeight(if (isTablet) 0.7f else 0.6f)              //Tamaño imagen en panel.
                    .align(Alignment.Center),
                contentScale = ContentScale.Crop
            )
        }

        if (page.recomendaciones.isNotEmpty()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = horizontalPadding,
                        vertical = verticalPadding
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Recomendaciones",
                    color = colorResource(id = R.color.blue_font),
                    fontSize = (screenHeight.value * titleScale).sp,         //tamaño letra recomendaciones: Titulo.
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = itemSpacing)
                )

                Column(
                    verticalArrangement = Arrangement.spacedBy(itemSpacing),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    page.recomendaciones.forEach { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White, RoundedCornerShape(12.dp))
                                .padding(if (isTablet) 16.dp else 12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            val imageSize =
                                if (isTablet) screenHeight * 0.12f
                                else screenHeight * 0.10f

                            Image(
                                painter = painterResource(id = item.imageRes),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(imageSize)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Fit
                            )

                            Spacer(modifier = Modifier.width(if (isTablet) 20.dp else 8.dp))

                            Text(
                                text = item.text,
                                color = Color.Black,
                                fontSize =  bodyScale,         //Tamaño descripciones recomendaciones
                                lineHeight = if (isTablet) 20.sp else 14.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.weight(1f),
                                textAlign = TextAlign.Start
                            )
                        }
                    }
                }
            }
        }


        page.staticTexts.forEach { staticText ->

            val alignment =
                if (staticText.position == StaticPosition.TOP)
                    Alignment.TopCenter
                else
                    Alignment.BottomCenter

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment)
                    .background(staticText.backgroundColor)
                    .padding(
                        horizontal = if (isTablet) 24.dp else 12.dp,
                        vertical = if (isTablet) 36.dp else 36.dp
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = staticText.text,
                    color = Color.Black,
                    fontSize = (maxWidthPx.value * staticTextScale).sp,            //Tamaño de letras oraciones
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(1f, 1f)
                        )
                    ),
                    lineHeight = (maxWidthPx.value * staticTextScale * 1.2f).sp
                )
            }
        }

        page.panels.forEachIndexed { index, panel ->
            key("${page.baseImage}_${index}") {

                val w = (panel.widthProportion * scaleFactor * widthFactor).dp
                val h = (panel.heightProportion * scaleFactor * heightFactor).dp
                val x = (panel.xProportion * scaleFactor).dp
                val y = (panel.yProportion * scaleFactor * positionFactor).dp

                if (w > 0.dp && h > 0.dp) {
                    AnimatedPanelContainer(
                        panel = panel,
                        x = x,
                        y = y,
                        width = w,
                        height = h
                    )
                }
            }
        }
    }
}
