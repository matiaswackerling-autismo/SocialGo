package com.example.autistoon.data

import androidx.annotation.DrawableRes
import com.example.autistoon.R

data class OnboardingItem(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val onboardingItems = listOf(
    OnboardingItem(title = "¡Hola! Qué bueno tenerte aquí.", description = "Hoy es un gran momento para aprender algo nuevo.", image = R.drawable.new_logo_socialgo),
    OnboardingItem(title = "SocialGo te acompaña a desarrollar habilidades importantes.", description = "Aquí encontrarás lecturas prácticas para aprender y mejorar en diferentes situaciones diarias.", image = R.drawable.boarding_2),
    OnboardingItem(title = "Encuentra la lectura perfecta para ti.", description = "Navega por las Categorías temáticas. En ellas, descubrirás historias que te ayudarán en tu día a día.", image = R.drawable.boarding_3),
    OnboardingItem(title = "Sigue el diálogo fácilmente.", description = "¡Lee comodamente! Los diálogos apareceran automáticamente al presionar, espera y cuando se terminen, una luz verde te mostrará cuando continuar.", image = R.drawable.amiscomp_page2),
    OnboardingItem(title = "Diálogo o... ¿Pensamiento?", description = "¡No todas las viñetas significan lo mismo! ¡Las que tienen forma de nube son Pensamientos! Tenlo en mente cuando leas", image = R.drawable.boarding5),
    OnboardingItem(title = "Avanza a tu propio ritmo.", description = "Usa lo que te sirva en tu rutina y comienza a mejorar, paso a paso. ¿Iniciamos?", image = R.drawable.new_logo_socialgo)
)