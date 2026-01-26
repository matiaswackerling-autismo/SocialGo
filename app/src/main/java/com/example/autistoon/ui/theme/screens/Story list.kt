package com.example.autistoon.ui.theme.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.autistoon.R
import com.example.autistoon.data.Categoria
import com.example.autistoon.data.Historia
import com.example.autistoon.data.MenuViewModel
import  androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.autistoon.data.SharedData
import com.example.autistoon.ui.theme.LocalScreenHeight
import com.example.autistoon.ui.theme.LocalScreenWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import com.example.autistoon.data.cargarDescripcion


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuTopBar() {
    val configuration = LocalConfiguration.current
    val isTablet = configuration.screenWidthDp >= 600 // CAMBIO

    val lineColor = colorResource(id = R.color.SocialGoTitle)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 70.dp, max = if (isTablet) 96.dp else 86.dp) // CAMBIO
    ) {
        TopAppBar(
            title = {
                Text(
                    "¿Qué quieres leer hoy?",
                    Modifier.padding(top = 5.dp),
                    fontSize = if (isTablet) 26.sp else 20.sp, // CAMBIO
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.SocialGoTitle)
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = colorResource(id = R.color.background1)
            ),
            modifier = Modifier.fillMaxSize()
        )

        Canvas(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(1.dp)
        ) {
            drawRect(color = lineColor, size = Size(size.width, 1.dp.toPx()))
        }
    }
}

@Composable
fun menuScreen(navController: NavController) {
    BackHandler {
        navController.navigate(Screen.Menu.name) {
            popUpTo(Screen.Menu.name) { inclusive = true }
        }
    }

    Scaffold(
        topBar = { MenuTopBar() },
        content = { paddingValues ->
            ContentScreen(paddingValues, viewModel(), navController)
        }
    )
}

@Composable
fun ContentScreen(
    paddingValues: PaddingValues,
    viewModel: MenuViewModel = viewModel(),
    navController: NavController
) {
    val configuration = LocalConfiguration.current
    val isTablet = configuration.screenWidthDp >= 600 // CAMBIO

    val columns = if (isTablet) 3 else 2 // CAMBIO

    var expandedCategoryTitle by remember { mutableStateOf<String?>(null) }

    val allCategories = viewModel.categorias
    val expandedCategory = allCategories.firstOrNull { it.titulo == expandedCategoryTitle }
    val collapsedCategories = allCategories.filter { it.titulo != expandedCategoryTitle }

    val gridRows = collapsedCategories.chunked(columns) // CAMBIO

    val listState = rememberLazyListState()
    LaunchedEffect(expandedCategoryTitle) {
        if (expandedCategoryTitle != null) {
            listState.animateScrollToItem(0)
        }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(colorResource(id = R.color.white)),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        state = listState
    ) {
        expandedCategory?.let { cat ->
            item {
                CategoryCardExpandable(
                    categoria = cat,
                    cardWidth = Dp.Unspecified, // CAMBIO
                    navController = navController,
                    isExpanded = true,
                    onToggleExpand = { expanded ->
                        expandedCategoryTitle = if (expanded) cat.titulo else null
                    }
                )
            }
        }

        items(gridRows) { row ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(
                    10.dp,
                    Alignment.CenterHorizontally
                )
            ) {
                row.forEach { categoria ->
                    CategoryCardExpandable(
                        categoria = categoria,
                        cardWidth = if (isTablet) 220.dp else 160.dp, // CAMBIO
                        navController = navController,
                        isExpanded = false,
                        onToggleExpand = { expanded ->
                            expandedCategoryTitle =
                                if (expanded) categoria.titulo else null
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun CategoryCardExpandable(
    categoria: Categoria,
    cardWidth: Dp,
    navController: NavController,
    onToggleExpand: (Boolean) -> Unit,
    isExpanded: Boolean
) {
    val configuration = LocalConfiguration.current
    val isTablet = configuration.screenWidthDp >= 600 // CAMBIO

    val coverAspectRatio = 1.3f

    val coverHeight = if (isExpanded) {
        if (isTablet) 260.dp else 200.dp // CAMBIO
    } else {
        if (isTablet) 180.dp else 140.dp // CAMBIO
    }

    val coverWidth = coverHeight * coverAspectRatio

    val cardModifier = if (isExpanded) {
        Modifier
            .fillMaxWidth()
            .widthIn(max = 640.dp) // CAMBIO
    } else {
        Modifier.width(cardWidth)
    }

    val contexto = LocalContext.current
    val descripcioncat = remember(categoria.titulo) {
        cargarDescripcion(
            contexto,
            categoria.descripcionCat,
            nombreUsuario = SharedData.sharedText
        )
    }

    Card(
        modifier = cardModifier
            .animateContentSize()
            .wrapContentHeight(),
        onClick = { onToggleExpand(!isExpanded) },
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.background1)
        )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(coverWidth)
                    .height(coverHeight),
                shape = RoundedCornerShape(12.dp),
                elevation = CardDefaults.cardElevation(2.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.Light_Accent_Green)
                )
            ) {
                Image(
                    painter = painterResource(id = categoria.coverCat),
                    contentDescription = categoria.titulo,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            AnimatedVisibility(visible = !isExpanded) {
                Text(
                    text = categoria.titulo,
                    fontWeight = FontWeight.Bold,
                    fontSize = if (isTablet) 16.sp else 14.sp, // CAMBIO
                    color = colorResource(id = R.color.blue_font),
                    modifier = Modifier.padding(8.dp),
                    textAlign = TextAlign.Center
                )
            }

            AnimatedVisibility(visible = isExpanded) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    shape = RoundedCornerShape(15.dp),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = categoria.titulo,
                            fontWeight = FontWeight.Bold,
                            fontSize = if (isTablet) 22.sp else 18.sp // CAMBIO
                        )

                        Text(
                            text = descripcioncat,
                            fontSize = if (isTablet) 16.sp else 14.sp, // CAMBIO
                            color = Color.DarkGray,
                            modifier = Modifier.padding(vertical = 12.dp)
                        )

                        Text(
                            text = "Historias disponibles:",
                            fontWeight = FontWeight.Medium,
                            fontSize = if (isTablet) 18.sp else 16.sp // CAMBIO
                        )

                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            contentPadding = PaddingValues(vertical = 8.dp)
                        ) {
                            items(categoria.items) { item ->
                                ItemCardSmall(
                                    item = item,
                                    onClick = {
                                        navController.navigate("detalle/${item.storyTitle}")
                                    }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ItemCardSmall(item: Historia, onClick: () -> Unit = {}) {
    val configuration = LocalConfiguration.current
    val isTablet = configuration.screenWidthDp >= 600 // CAMBIO

    val cardWidth = if (isTablet) 180.dp else 140.dp // CAMBIO
    val cardHeight = if (isTablet) 240.dp else 180.dp // CAMBIO

    Card(
        modifier = Modifier
            .width(cardWidth)
            .height(cardHeight),
        elevation = CardDefaults.cardElevation(2.dp),
        onClick = onClick,
        shape = RoundedCornerShape(8.dp)
    ) {
        Image(
            painter = painterResource(id = item.cover),
            contentDescription = item.storyTitle,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}


