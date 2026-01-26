package com.example.autistoon.data

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.autistoon.R
import com.example.autistoon.data.storys.pagAmiscop_1
import com.example.autistoon.data.storys.pagAmiscop_2
import com.example.autistoon.data.storys.pagAsertyest_1
import com.example.autistoon.data.storys.pagAsertyest_2
import com.example.autistoon.data.storys.pagComyexp_1
import com.example.autistoon.data.storys.pagComyexp_2
import com.example.autistoon.data.storys.pagEmo_1
import com.example.autistoon.data.storys.pagEmo_2
import com.example.autistoon.data.storys.pagEscyaca_1
import com.example.autistoon.data.storys.pagEscyaca_2
import com.example.autistoon.data.storys.pagSs_1
import com.example.autistoon.data.storys.pagSs_2
import com.example.autistoon.data.storys.pagTyrrss_1
import com.example.autistoon.data.storys.pagTyrrss_2

class MenuViewModel : ViewModel()
{
    val categorias = listOf(
        Categoria(titulo = "Amistad y Compañerismo", descripcionCat = R.raw.desc_amiscop, coverCat = R.drawable.amistad_y_compa_erismo,
            items = listOf(Historia("Aceptar criticas de manera constructiva", R.drawable.cover_amiscomp_2, banner =  R.drawable.amiscop_2_banner, R.raw.desc_amiscop_2, pages = pagAmiscop_2),
                Historia("Resolver conflictos con amigos y compañeros", R.drawable.cover_amiscomp_1, banner = R.drawable.amiscop_1_banner , R.raw.desc_amiscop_1, pages = pagAmiscop_1))),

        Categoria(titulo = "Asertividad y Autoestima", descripcionCat = R.raw.desc_asertyest, coverCat = R.drawable.autoestima,
            items = listOf(Historia("Enfrentar desafios con seguridad", R.drawable.cover_asertyest_2, banner = R.drawable.asertyest_2_banner, R.raw.desc_asertyest_2, pages = pagAsertyest_2),
                Historia("Reconocer y valorar fortalezas propias", R.drawable.cover_asertyest_1, banner = R.drawable.asertyest_1_banner , R.raw.desc_asertyest_1, pages = pagAsertyest_1))),

        Categoria(titulo = "Comunicación y Expresión", descripcionCat = R.raw.desc_comyexp, coverCat = R.drawable.comunicaci_n,
            items = listOf(Historia("Expresar opiniones y sentimientos de manera adecuada", R.drawable.cover_comyexp_2, banner = R.drawable.comyexp_2_banner, R.raw.desc_comyexp_2, pages = pagComyexp_2),
                Historia("Iniciar y mantener conversaciones", R.drawable.cover_comyexp_1, banner = R.drawable.comyexp_1_banner , R.raw.desc_comyexp_1, pages = pagComyexp_1))),

        Categoria(titulo = "Regulación Emocional", descripcionCat = R.raw.desc_emo, coverCat = R.drawable.regulacion_emocional,
            items = listOf(Historia("Tolerancia a la frustración", R.drawable.cover_emo_2, banner = R.drawable.emo_2_banner,   R.raw.desc_emo_2, pages = pagEmo_2),
                Historia("Identificación y manejo de emociones", R.drawable.cover_emo_1, banner = R.drawable.emo_1_banner  , R.raw.desc_emo_1, pages = pagEmo_1))),

        Categoria(titulo = "Entorno Escolar y Académico", descripcionCat = R.raw.desc_escyaca, coverCat = R.drawable.entorno_escolar,
            items = listOf(Historia("Aceptar opiniones diferentes", R.drawable.cover_escyaca_2, banner = R.drawable.escyaca_2_banner, R.raw.desc_escyaca_2, pages = pagEscyaca_2),
                Historia("Empatia", R.drawable.cover_escyaca_1, banner = R.drawable.escyaca_1_banner , R.raw.desc_escyaca_1, pages = pagEscyaca_1))),

        Categoria(titulo = "Relaciones Sociales", descripcionCat = R.raw.desc_ss, coverCat = R.drawable.relaciones_sociales,
            items = listOf(Historia("Interpretar señales sociales", R.drawable.cover_ss_2, banner = R.drawable.ss_2_banner, R.raw.desc_ss_2, pages = pagSs_2),
                Historia("Mostrar interes de manera respetuosa", R.drawable.cover_ss_1, banner = R.drawable.ss_1_banner , R.raw.desc_ss_1, pages = pagSs_1))),

        Categoria(titulo = "Tecnología y Redes Sociales", descripcionCat = R.raw.desc_tyrrss, coverCat = R.drawable.seguridad_en_internet,
            items = listOf(Historia("Identificar y actuar frente a situaciones de riesgo en internet", R.drawable.cover_tyrrss_2, banner = R.drawable.tyrrss_2_banner, R.raw.desc_tyrrss_2, pages = pagTyrrss_2),
                Historia("Interactuar de manera adecuada en redes sociales", R.drawable.cover_tyrrss_1, banner = R.drawable.tyrrss_1_banner , R.raw.desc_tyrrss_1, pages = pagTyrrss_1)))
    )
}

fun cargarDescripcion(context: Context, rawId: Int, nombreUsuario: String): String {
    val texto = context.resources.openRawResource(rawId)
        .bufferedReader()
        .use { it.readText() }

    return texto.replace("{usuario}", nombreUsuario)
}