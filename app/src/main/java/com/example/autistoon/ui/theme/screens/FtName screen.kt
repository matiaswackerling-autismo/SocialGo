package com.example.autistoon.ui.theme.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import  com.example.autistoon.R
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import com.example.autistoon.data.SharedData

@Preview(showBackground = true)
@Composable
fun FsNamepreview() {
    FirstTime(rememberNavController())

}

@Composable
fun FirstTime(navController: NavController) {
    var inname by rememberSaveable { mutableStateOf("") }
    Background()
    ImageEx()
    Text1()
    Nombre(inname, nameChange = {inname = it})
    Enter(navController, inname )
}

@Composable
fun Text1() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Me gustaría saber tu nombre!",
            fontSize = 45.sp,
            color = Color(0xFF445e91),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 610.dp)
                .padding(horizontal = 30.dp)
        )
    }
}


@Composable
fun Nombre(inname: String, nameChange: (String)-> Unit) {

    Box(modifier = Modifier.fillMaxWidth() , contentAlignment = Alignment.Center) {

        OutlinedTextField(
            value = inname,
            onValueChange = nameChange,
            singleLine = true,
            modifier = Modifier
                .padding(top = 720.dp)
                .size(width = 450.dp, height = 100.dp),
            label = { Text("Escribe tu nombre", fontSize = 28.sp) },
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color(0xff445e91),
                unfocusedContainerColor = Color(0xffffffff),
                unfocusedLabelColor = Color(0xff445e91)
            ),
            leadingIcon = {
                Icon(modifier = Modifier.size(40.dp),
                    painter = painterResource(id = R.drawable.baseline_person),
                    contentDescription = null,
                    tint = Color(0xff445e91)
                )
            }
        )
    }
}


@Composable
fun Enter(navController: NavController, inname: String ) {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Button(
            onClick = {
                if (inname.isNotEmpty()) {
                    SharedData.sharedText = inname
                    navController.navigate(NavigationItem.Menu.route)
                }
                else{
                    Toast.makeText(context, "Por favor ingresa tu nombre!", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.padding(top = 870.dp) .size(width = 250.dp, height = 90.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff445e91))
        )
        {
            Text(
                "Entrar", fontSize = 30.sp, color = Color.White
            )

        }
    }
}

