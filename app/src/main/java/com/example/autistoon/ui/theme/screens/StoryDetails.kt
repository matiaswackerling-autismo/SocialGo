package com.example.autistoon.ui.theme.screens



import androidx.compose.foundation.Image
import com.example.autistoon.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.autistoon.data.Historia
import com.example.autistoon.data.cargarDescripcion
import com.example.autistoon.ui.theme.LocalScreenWidth




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    historia: Historia,
    navController: NavController
) {
    val screenWidth = LocalScreenWidth.current

    val isTablet = screenWidth.value >= 600

    val contexto = LocalContext.current
    val descripcion = remember {
        cargarDescripcion(
            contexto,
            historia.descripcionRaw
        )
    }

    val padding = if (isTablet) 32.dp else 16.dp
    val bannerHeight = if (isTablet) 390.dp else 200.dp

    val titleFontSize = if (isTablet) 26.sp else 20.sp
    val descFontSize = if (isTablet) 16.sp else 14.sp

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Detalles",
                        fontSize = if (isTablet) 22.sp else 18.sp,
                        color = colorResource(id = R.color.blue_font)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            painter = painterResource(R.drawable.baseline_arrow),
                            contentDescription = "Volver",
                            modifier = Modifier.size(if (isTablet) 32.dp else 24.dp),
                            tint = colorResource(id = R.color.blue_font)
                        )
                    }
                }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(R.color.background1))
                .padding(paddingValues)
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Image(
                painter = painterResource(historia.banner),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = bannerHeight),
                contentScale = androidx.compose.ui.layout.ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(if (isTablet) 24.dp else 16.dp))


            Text(
                text = historia.storyTitle,
                fontSize = titleFontSize,
                fontWeight = FontWeight.Bold,
                lineHeight = (titleFontSize.value * 1.2f).sp,
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.blue_font)
            )

            Spacer(modifier = Modifier.height(if (isTablet) 24.dp else 16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(
                        Color(0x33000000),
                        RoundedCornerShape(if (isTablet) 20.dp else 14.dp)
                    )
                    .padding(if (isTablet) 20.dp else 14.dp)
            ) {
                Text(
                    text = descripcion,
                    fontSize = descFontSize,
                    textAlign = TextAlign.Start
                )
            }

            Spacer(modifier = Modifier.height(if (isTablet) 32.dp else 24.dp))

            Button(
                onClick = {
                    navController.navigate("leerHistoria/${historia.storyTitle}")
                },
                shape = CircleShape,
                modifier = Modifier
                    .height(if (isTablet) 64.dp else 52.dp)
                    .widthIn(min = 160.dp, max = 280.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.mint_det)
                )
            ) {
                Text(
                    text = "Leer historia",
                    fontSize = if (isTablet) 16.sp else 14.sp
                )
            }
        }
    }
}