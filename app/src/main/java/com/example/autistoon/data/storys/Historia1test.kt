package com.example.autistoon.data.storys

import com.example.autistoon.R
import com.example.autistoon.data.d
import com.example.autistoon.data.page
import com.example.autistoon.data.pageRecs
import com.example.autistoon.data.rec
import com.example.autistoon.data.sBottom
import com.example.autistoon.data.sTop
import com.example.autistoon.data.staticText
import com.example.autistoon.data.t

val pagAmiscop_2 = listOf(
    page(
        base = R.drawable.amiscop_2__1_,
        staticTexts = listOf(sTop("Vanesa realiza una crítica sobre la presentación de Diego."),
            sBottom("Al escuchar críticas, una persona puede experimentar dudas o inseguridad.")
        ),
        d("Tu presentación estuvo buena, pero hablaste muy rápido. Si pausas más, se entenderá mejor", 10, 240, 400, 200),
        t("¿Me lo dice porque le caigo mal… o de verdad quiere ayudarme?", 560, 250, 380, 200)
    ),
    page(
        base = R.drawable.amiscop_2__2_,
        staticTexts = listOf(sTop("Diego está confundido y un poco enojado por los comentarios de su compañera. "),
            sBottom("Cuando una persona recibe críticas puede reaccionar de diversas maneras.")
        ),
        t("¡Siempre me critican! Seguro que es porque les caigo mal.", 50, 240, 400, 200),
        t("Tal vez tiene razón… Si me expreso más despacio, me entenderán mejor", 560, 240, 400, 200)
    ),
    page(
        base = R.drawable.amiscop_2__3_,
        staticTexts = listOf(sTop("Diego conversó sobre lo ocurrido con su profesor. El docente le explicó que una critica constructiva tiene como propósito orientar y favorecer la mejora. \n"),
            sBottom("Cuando es difícil comprender una situación, conversar con un adulto, puede ayudar a interpretar los mensajes.")
        ),
        d("No todas las críticas son un ataque. Algunas son para aprender.", 10, 240, 400, 200),
        t("Quizás,esta vez es una crítica constructiva", 560, 240, 380, 200)
    ),
    page(
        base = R.drawable.amiscop_2__4_,
        staticTexts = listOf(sTop("Diego comprende que ha recibido una crítica constructiva de parte de su amiga."),
            sBottom("Responder con calma y respeto facilita recibir una crítica.")
        ),
        d("Gracias por lo que me dijiste. Practicaré para expresarme con mayor calma. ¿Me puedes decir si lo hago mejor la próxima vez?", 300, 240, 390, 200),
        d("¡Claro que sí! Te saldrá excelente", 530, 780, 300, 200)
    ),
    page(
        base = R.drawable.amiscop_2__5_,
        staticTexts = listOf(sTop("Cuando Diego recibe críticas constructivas, se siente más seguro al comprender que no buscan dañarlo, sino ayudarlo a mejorar.\n"),
            sBottom("Valorar las críticas constructivas, permite mejorar en las tareas y las acciones que se realizan.")
        ),
        t("Las críticas no siempre son malas… Si las escucho con calma, puedo mejorar y crecer.", 50, 240, 300, 200)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.amiscop_2__4_, "Escucha activa y respetuosa:\nEs importante escuchar sin interrumpir, para lograrlo permite que la otra persona termine de hablar antes de responder."),
            rec(R.drawable.amiscop_2__2_, "Identificar posibles alternativas:\nAntes de responder, evalúa si la intención de la otra persona es ayudar o simplemente está expresando su malestar."),
            rec(R.drawable.amiscop_2__3_, "Buscar apoyo de un adulto o persona de confianza:\nLa conversación con un adulto permite una perspectiva diferente de la situación y te orientará en la comprensión de mensajes."),
            rec(R.drawable.amiscop_2__1_, "Mantener la calma y el respeto al comunicar una idea:\nUsa un tono de voz tranquilo y lenguaje cortés, esta actitud te ayuda a mantener el autocontrol y evita que la conversación escale a una discusión."),
            rec(R.drawable.amiscop_2__5_, "Enfocar la crítica como oportunidad de aprendizaje:\nConsidera los comentarios desafiantes como una herramienta valiosa y adopta una mentalidad orientada a los aprendizajes, lo que permite identificar áreas que requieren mejora.")
        )
    )
)
val pagAmiscop_1 = listOf(
    page(
        base = R.drawable.amiscop_1__1_,
        staticTexts = listOf(sTop("Diego y Javier son amigos y se preparan para disputar un partido final de las alianzas. La tensión y la competitividad se percibe entre ambos."),
            sBottom("La tensión y la presión por ganar pueden aumentar las emociones intensas entre amigos.")
        ),
        d("¡Vamos equipo, a ganar!", 10, 240, 300, 200),
        d("¡Eso, quítale el balón!", 560, 240, 300, 200)
    ),
    page(
        base = R.drawable.amiscop_1__2_,
        staticTexts = listOf(sTop("Diego empuja a Javier, lo que provoca un conflicto. Algunos compañeros apoyan la pelea, mientras que otros se muestran preocupados."),
            sBottom("Identificar las emociones en el momento permite recordar que el conflicto es pasajero y que no es conveniente colocar en riesgo una amistad por una competencia.")
        ),
        d("¡Me empujaste apropósito para quedarte con el balón!", 60, 240, 320, 200),
        d("Eso no es cierto. ¡Damelo es mi turno!", 400, 280, 320, 200)
    ),
    page(
        base = R.drawable.amiscop_1__3_,
        staticTexts = listOf(sTop("Después del partido, Javier se encuentra con la psicóloga del colegio y le comenta lo ocurrido. La psicóloga plantea estrategias para enfrentar la situación. "),
            sBottom("Buscar apoyo en un adulto de confianza constituye una opción recomendable.")
        ),
        d("Señorita Ana, necesito su ayuda, Diego me empujó durante el partido y no sé que hacer, estoy muy molesto.", 560, 280, 420, 200),
        d("Podría conversar con él, pero si estas calmado y te animas es mejor  que tú mismo le digas cómo te sentiste.", 50, 580, 420, 200),
    ),
    page(
        base = R.drawable.amiscop_1__4_,
        staticTexts = listOf(sTop("Durante el recreo, Javier decide conversar con Diego y expresar sus sentimientos, utilizando las recomendaciones entregadas por la psicóloga."),
            sBottom("Usar expresiones como “Yo sentí…” o “Yo pensé…” permite explicar el propio punto de vista sin atacar a la otra persona.")
        ),
        d("Me sentí mal con lo que pasó; me imagino tú también. Espero sigamos jugando", 40, 240, 320, 200),
        d("Lo siento... me deje llevar por las emociones del momento", 560, 280, 320, 200)
    ),
    page(
        base = R.drawable.amiscop_1__5_,
        staticTexts = listOf(sTop("Ambos amigos se escuchan con calma, respetan sus turnos para conversar y buscan alternativas para que el problema no se repita."),
            sBottom("Proponer soluciones justas ayuda a reparar el conflicto y evita que vuelva a ocurrir. ")
        ),
        d("Para el próximo partido, intentaré disfrutar más y ser menos competitivo.", 560, 280, 320, 200)
    ),
    page(
        base = R.drawable.amiscop_1__6_,
        staticTexts = listOf(sTop("Después de conversar, Diego y Javier se reconcilian, agradecen el diálogo y continúan fortaleciendo su amistad. "),
            sBottom("Reconocer el esfuerzo de ambas partes y agradecer el diálogo permite restaurar la relación y fortalecer la amistad.")
        ),
        d("Gracias por escucharme.", 60, 280, 300, 200),
        d("Gracias por decirme cómo te sentías.", 560, 580, 320, 200)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.amiscop_1__1_, "Identifica cuando surge un conflicto:\nEspera un momento y respira antes de actuar. Conseguir calma permite evitar palabras o acciones impulsivas que puedan dañar una relación."),
            rec(R.drawable.amiscop_1__3_n, "Expresa tus sentimientos con respecto:\nUtiliza frases en primera persona, como: 'Yo me sentí...' o 'Yo pensé...'. Así, comunicas tu experiencia sin culpar."),
            rec(R.drawable.amiscop_1__5_, "Escucha a la otra persona:\nComprender la versión de la otra persona permite descubrir malentendidos y buscar soluciones."),
            rec(R.drawable.amiscop_1__6_, "Realiza un gesto de amistar:\nUn agradecimiento, una sonrisa o un abrazo permite que la situación se olvide."),
        )
    )
)

val pagAsertyest_1 = listOf(
    page(
        base = R.drawable.asertyest_1___1_,
        staticTexts = listOf(sTop("La profesora pide a cada estudiante identificar una fortaleza en el trabajo realizado durante la clase. Martín no logra reconocer algo positivo."),
            sBottom("A veces, resulta difícil reconocer las propias fortalezas porque se tiende a prestar más atención a aquello que no ha salido bien.")
        ),
        d("La próxima clase, todos deben traer una fortaleza de su trabajo.", 530, 280, 320, 200),
        t("Solo puedo encontrar debilidades, ¿cómo encontraré una fortaleza?.", 60, 280, 320, 180)
    ),
    page(
        base = R.drawable.asertyest_1___2_,
        staticTexts = listOf(sTop("Una compañera que también tiene dificultad para encontrar sus fortalezas se acerca a conversar con Martín."),
            sBottom("Dialogar con otras personas puede ayudar a reconocer aspectos positivos que no advertimos en nosotros mismos.")
        ),
        d("¿Encontraste tus fortalezas? A mí me resulta muy difícil.", 10, 240, 380, 160),
        d("No, solo encuentro debilidades.", 300, 730, 380, 140)
    ),
    page(
        base = R.drawable.asertyest_1___3_,
        staticTexts = listOf(sTop("La profesora escucha la conversación y se acerca a ofrecer orientación y acompañar la reflexión."),
            sBottom("Escuchar las orientaciones de un adulto o de un docente puede ayudar a reconocer y potenciar tus fortalezas.")
        ),
        d("Me cuesta resolver los ejercicios que contienen números.", 40, 240, 380, 200),
        d("¡Pero Martín, tu resumiste toda la información! Esa es una muy buena fortaleza.", 530, 280, 380, 150)
    ),
    page(
        base = R.drawable.asertyest_1___4_,
        staticTexts = listOf(sTop("La profesora explica que reconocer las fortalezas puede ser más sencillo si las relacionamos con actividades que nos resultan más fáciles."),
            sBottom("Vincular las fortalezas con los intereses personales fortalece la autoestima y la motivación.")
        ),
        d("Puedes buscar tus fortalezas en tus intereses o en aquello que se te facilita.", 550, 300, 330, 190)
    ),
    page(
        base = R.drawable.asertyest_1___5_,
        staticTexts = listOf(sTop("Martín recuerda momentos en los que logró completar tareas con éxito y reconoce habilidades que antes no había considerado."),
            sBottom("Al recordar experiencias positivas, la persona toma conciencia de sus capacidades y logros.")
        ),
        d("¡Es cierto!, una de mis fortalezas es que soy bueno resumiendo información.", 80, 230, 330, 180)
    ),
    page(
        base = R.drawable.asertyest_1___6_,
        staticTexts = listOf(sTop("Martín expone su fortaleza y se manifiesta orgulloso de haberla identificado."),
            sBottom("Reconocer y expresar fortalezas favorece la confianza y promueve el desarrollo personal.")
        ),
        d("¡Excelente martín!.", 480, 280, 300, 130)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.asertyest_1___3_, "Conversa con un compañero o un adulto de confianza:\nSi te resulta difícil reconocer fortalezas, a veces, los demás identifican cualidades que no has observado en ti."),
            rec(R.drawable.asertyest_1___4_, "Piensa en actividades que realizas con facilidad:\nRecuerda momentos en los que lograste algo con esfuerzo o piensa en lo que obtienes con naturalidad."),
            rec(R.drawable.asertyest_1___5_, "Comparte tus fortalezas con los demás:\nMuestra orgullo por reconocerlas y expresarlas. Esta acción fortalece la autoestima y ayuda a recuperar tu confianza.")
        )
    )

)

val pagAsertyest_2 = listOf(
    page(
        base = R.drawable.asertyest_2___1_,
        staticTexts = listOf(sTop("En la sala de clases, la profesora expone las instrucciones de la tarea. Julieta comienza a experimentar nerviosismo, dado que le resulta incómodo hablar frente al curso."),
            sBottom("Es natural experimentar nervios ante situaciones que resultan incómodas. En esos momentos, puedes acudir a una persona de confianza para recibir orientación y sentir mayor tranquilidad. ")
        ),
        d("Mañana cada uno deberá exponer su tema frente al curso.", 560, 240, 420, 200),
        t("¡Nooo! Hablar frente a todos me da mucho miedo. Me voy a equivocar.", 10, 380, 380, 200)
    ),
    page(
        base = R.drawable.asertyest_2___2_,
        staticTexts = listOf(sTop("En casa, Julieta está preocupada y acude a conversar con sus padres, para comentar la situación. "),
            sBottom("Cuando una persona enfrenta dificultades o situaciones incómodas es importante acudir a personas de confianza, como padres o profesores. ")
        ),
        d("Hoy, la profesora mencionó que debemos exponer frente a la clase. Me siento muy nerviosa y preocupada.", 360, 240, 420, 200),
        d("Te entiendo hija, para mí también es difícil hablar en público. Te ayudaremos a preparar la presentación para que estés más segura.", 60, 710, 380, 200)
    ),
    page(
        base = R.drawable.asertyest_2___3_,
        staticTexts = listOf(sTop("Sus padres la contienen con un abrazo y recomiendan diversas estrategias para mantener la calma, como respirar profundamente, mantener pensamientos positivos y preparar su exposición con anticipación."),
            sBottom("Compartir la emoción que se está experimentando con personas de confianza, brinda compañía y seguridad. ")
        ),
        d("Lo estás haciendo muy bien. Respira profundo y habla despacio. Yo confío en ti, ¡tú puedes!", 560, 240, 420, 200),
        d("Quizás sí puedo… solo debo confiar más en mí.", 350, 780, 380, 200)

    ),
    page(
        base = R.drawable.asertyest_2___4_,
        staticTexts = listOf(sTop("En su habitación, Julieta ordena sus tarjetas, practica su presentación y realiza respiraciones pausadas para mantener la calma."),
            sBottom("Emplear técnicas de respiración, practicar con anticipación y planificar posibles situaciones ayuda a controlar los nervios. ")
        ),
        t("Si me siento nerviosa antes de exponer, respiraré profundo para calmarme.", 110, 300, 330, 210)
    ),
    page(
        base = R.drawable.asertyest_2___5_,
        staticTexts = listOf(sTop("El día de la exposición Julieta coloca en práctica los consejos que le dieron sus padres, esto otorga mayor seguridad y confianza durante la presentación. "),
            sBottom("Recordar y aplicar las estrategias adquiridas contribuye a mantener la calma en momentos difíciles.")
        ),
        d("Y así es como podemos cuidar nuestras plantas para que crezcan fuertes y sanas...", 450, 240, 420, 200),
        t("¡Lo está haciendo súper bien!", 360, 750, 320, 200)
    ),
    page(
        base = R.drawable.asertyest_2___6_,
        staticTexts = listOf(sTop("La profesora felicita a Julieta por la manera en que logró enfrentar este momento desafiante.  "),
            sBottom("Con confianza y apoyo, los desafíos pueden convertirse en oportunidades de crecimiento.")
        ),
        t("Lo logré… cuando creo en mí, puedo enfrentar cualquier desafío.", 550, 300, 300, 200),
        d("¡Muy bien! hablaste con claridad y seguridad.", 50, 280, 320, 200),
        d("¡Muchas gracias!", 350, 700, 320, 100)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.asertyest_2___3_, "Conversar con una persona de confianza:\nAcude a alguien cercano para recibir apoyo, comprensión y la orientación necesaria."),
            rec(R.drawable.asertyest_2_rec_1, "Aplicar técnicas de respiración:\nUtiliza técnicas de respiración que te permitan volver a la calma, como la respiración 3-5. Para esto, inhala lentamente por la nariz contando hasta 3, mantén unos segundos y luego exhala despacio por la boca contando hasta 5. Repite 5 veces o hasta que sientas tranquilidad."),
            rec(R.drawable.asertyest_2_rec_2, "Pensar positivo:\nSustituye los pensamientos de miedo por ideas que refuercen tu confianza, usando frases como: 'Puedo hacerlo', 'He logrado cosas similares' o 'Voy a intentarlo paso a paso."),
            rec(R.drawable.asertyest_2_rec_3, "Planificar y practicar la acción:\nPrepárate antes de enfrentar el desafío, define los pasos que se requieren para concretar una acción, también puedes practicar en tu mente o en voz alta lo que vas a decir o hacer.")
        )
    )
)
val pagComyexp_1 = listOf(
    page(
        base = R.drawable.comyexp_1___1_,
        staticTexts = listOf(sTop("Durante el recreo, Rocío observa que su compañera Génesis está sola dibujando. A Rocío no le interesa mucho dibujar, pero tiene curiosidad."),
            sBottom("Al interactuar con otros, la persona puede conversar aunque no comparta los mismos intereses.")
        ),

        t("A mí no me gusta dibujar, pero podría ir a hablar con ella un rato.", 560, 280, 380, 200)
    ),
    page(
        base = R.drawable.comyexp_1___2_,
        staticTexts = listOf(sTop("Rocío respira profundo y se acerca a Génesis con una sonrisa y le realiza una pregunta para iniciar la conversación."),
            sBottom("Un saludo y un comentario amable es un buen comienzo para establecer diálogo.")
        ),
        d("¡Hola, Génesis! Ese dibujo se ve genial, ¿de qué es?", 430, 280, 330, 180),
        d("Es un dragón. Me encanta dibujar animales fantásticos.", 60, 380, 380, 200)
    ),
    page(
        base = R.drawable.comyexp_1___3_,
        staticTexts = listOf(sTop("Rocío quiere continuar la conversación y piensa en una pregunta para hacer a la compañera."),
            sBottom("Hacer preguntas mantiene la conversación activa y muestra interés de manera natural.")
        ),
        d("¡Qué genial! ¿Cuánto tiempo destinas para hacer un dibujo así?", 300, 280, 380, 200),
        d("Depende, a veces media hora o más si lo pinto.", 60, 580, 380, 200)
    ),
    page(
        base = R.drawable.comyexp_1___4_,
        staticTexts = listOf(sTop("Rocío comenta sobre la situación y decide compartirlo."),
            sBottom("Compartir algo personal y ofrecer un cumplido puede generar una conexión más cercana.")
        ),
        d("Yo no dibujo, pero me gusta mirar cómo otros lo hacen. Se ve que tienes talento.", 300, 300, 420, 200),
        d("Muchas gracias, si quieres podemos dibujar juntas en el próximo recreo…", 160, 580, 380, 200)
    ),
    page(
        base = R.drawable.comyexp_1___5_,
        staticTexts = listOf(sTop("El timbre del recreo suena, Rocío acepta la invitación y se despide con amabilidad."),
            sBottom("Las conversaciones agradables pueden abrir nuevas oportunidades para conocer a nuevas personas y fortalecer vínculos.")
        ),
        d("Me encantaría. ¡Nos vemos luego!", 10, 340, 420, 200),
        d("Nos vemos. Recuerda traer un cuaderno.", 510, 340, 420, 200),
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.comyexp_1___1_, "Empieza una conversación:\nAnímate y comienza con una frase amable o un cumplido."),
            rec(R.drawable.comyexp_1___2_, "Haz preguntas o comentarios:\nEstos comentarios o preguntas deben ser apropiados considerando la actividad que se está realizando y los intereses de la otra persona."),
            rec(R.drawable.comyexp_1___3_, "Escucha a la otra persona:\nAprende de las experiencias de las otras personas.")
        )
    )
)

val pagComyexp_2 = listOf(
    page(
        base = R.drawable.comyexp_2___1_,
        staticTexts = listOf(sTop("Javier está compartiendo con sus amigos en el recreo. Entre ellos se ríen y bromean, pero en algunas ocasiones Javier no comprende del todo."),
            sBottom("Cuando una persona no comprende por qué se ríen los demás, se sugiere observar la situación y posteriormente, preguntar a qué se refieren. ")
        ),
        t("No sé si debería reírme o no...", 10, 240, 420, 150)
    ),
    page(
        base = R.drawable.comyexp_2___2_,
        staticTexts = listOf(sTop("Los compañeros de Javier se alejan corriendo sin explicar con claridad lo que van a hacer. Ante esta situación, Javier piensa que quizás ya no desean compartir con él, lo que provoca confusión y tristeza."),
            sBottom("Cuando una persona no comprende por qué alguien se va, puede preguntar “¿Volverás después?” para aclarar la situación.")
        ),
        t("Se fueron corriendo, quizás se enojaron conmigo", 10, 240, 420, 150),
        d("¡Chao! ¡Después te alcanzamos!", 550, 260, 380, 150)
    ),
    page(
        base = R.drawable.comyexp_2___3_,
        staticTexts = listOf(sTop("Javier llega a su casa y su tía percibe que está más callado y serio de lo habitual. Le pregunta si se encuentra bien, pero Javier tiene dificultades para expresar lo que siente, pues no encuentra las palabras adecuadas."),
            sBottom("Si a una persona le resulta difícil expresar lo que siente, una estrategia útil es comenzar describiendo lo ocurrido y, posteriormente, explicar cómo le hizo sentir.")
        ),
        d("Te siento preocupado, ¿te pasó algo en el colegio?", 300, 240, 380, 150),
        d("No sé… creo que mis amigos ya no quieren estar conmigo.", 60, 720, 350, 150)
    ),
    page(
        base = R.drawable.comyexp_2___4_,
        staticTexts = listOf(sTop("Para ayudar a Javier a comunicar sus emociones, su tía le muestra imágenes para reconocer lo que siente."),
            sBottom("Cuando expresar emociones de manera verbal se vuelve difícil, es posible recurrir a dibujos o imágenes para comunicar lo que se siente.")
        ),
        d("Me sentí así, me sentí triste.", 80, 280, 380, 150),
        d("Es normal sentirse así. Mañana conversa con ellos y aclaren las cosas.", 540, 780, 380, 180)
    ),
    page(
        base = R.drawable.comyexp_2___5_,
        staticTexts = listOf(sTop("Al día siguiente, Javier se acerca a sus compañeros, un poco nervioso, pero decidido a conversar."),
            sBottom("Para expresar sentimientos se puede utilizar frases simples como: “Ayer me sentí triste cuando se fueron sin mí”")
        ),
        d("Ayer me sentí triste cuando se fueron. Pensé que estaban enojados", 20, 240, 380, 180),
        d("¡No! Fuimos a buscar la pelota. Perdón por no avisarte.", 430, 240, 380, 130),
        d("Perdón, no queríamos que te sintieras así.", 500, 380, 380, 130)
    ),
    page(
        base = R.drawable.comyexp_2___6_,
        staticTexts = listOf(sTop("Javier se siente más tranquilo después de haber expresado lo que ocurrió. Sus compañeros comprenden que él necesita que las situaciones se expliquen con claridad y lo invitan a participar de los juegos del patio del colegio. "),
            sBottom("Cuando las emociones se expresan con claridad, las personas pueden comprender mejor los sentimientos involucrados. ")
        ),
        t("Que bueno que pude expresar como me sentía.", 10, 240, 380, 180),
        t("Ahora, tendré presente que debo ser claro cuando hablo con Javier.", 540, 350, 380, 180)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.comyexp_2___1_, "Pedir aclaración si algo no se entiende:\nSi una broma o comentario te confunde, está bien pedir amablemente que te expliquen la situación. Esto evita malentendidos y frustraciones."),
            rec(R.drawable.comyexp_2___3_, "Identificar emociones mediante la conversación:\nCuando tengas dudas sobre lo que sientes, conversa con otras personas sobre la situación. Al verbalizar lo ocurrido, será más fácil para ti y para los demás comprender las emociones."),
            rec(R.drawable.comyexp_2___4_, "Usar apoyos visuales o escritos para expresarse:\nSi te resulta complejo expresar tus emociones con palabras, utiliza dibujos, notas o escritos. De esta forma, se facilita la comunicación."),
            rec(R.drawable.comyexp_2___6_, "Comunicar las emociones con calma:\nUna vez que logras identificar lo que sientes, elige un momento y un tono de voz tranquilo para expresarlo. Esto facilita que los demás escuchen y comprendan.")
        )
    )
)

val pagEmo_2 = listOf(
    page(
        base = R.drawable.emo_1___1_,
        staticTexts = listOf(sTop("En la sala de clases, la profesora entrega las pruebas a los estudiantes y Benjamín obtuvo una calificación baja."),
            sBottom("Cuando alguien obtiene una baja calificación, es normal mostrar tristeza.\n")
        ),
        d("Aquí tienes tu prueba. Te debes seguir esforzando, sé que puedes mejorar.", 80, 240, 380, 150),
        t("¡Un 3,5! Estudié mucho… siento que no sirvo para esto.", 490, 580, 380, 170)
    ),
    page(
        base = R.drawable.emo_1___2_,
        staticTexts = listOf(sTop("El curso comienza a comentar sus propias calificaciones."),
            sBottom("Cuando una persona se siente frustrada, puede perder la motivación para seguir intentándolo.")
        ),
        t("Siempre me va mal… mejor dejo de intentarlo.", 430, 480, 380, 150)
    ),
    page(
        base = R.drawable.emo_1___3_,
        staticTexts = listOf(sTop("El estudiante, triste y frustrado, se inclina sobre su mesa. A su lado, un compañero percibe su malestar, se aproxima y decide entablar una conversación con él."),
            sBottom("Conversar con una persona de confianza y compartir experiencias permite sentirse acompañado y comprendido.\n")
        ),
        d("No te preocupes. A mí también me pasó. Entiendo cómo te sientes y siempre podemos intentarlo otra vez.", 380, 240, 390, 180),
        d("Tal vez tienes razón… No soy el único que se equivoca. Podría intentarlo otra vez.", 460, 780, 380, 180)
    ),
    page(
        base = R.drawable.emo_1___4_,
        staticTexts = listOf(sTop("El estudiante respira profundamente y adopta una postura erguida en la silla para continuar con la conversación.\n"),
            sBottom("El uso de estrategias como la respiración consciente y el pensamiento positivo puede contribuir a disminuir la tensión corporal.\n")
        ),
        d("¡Tú puedes! Cuando me siento frustrado, hago ejercicios de respiración y eso me ayuda a sentirme mejor.", 430, 240, 370, 180),
        d("Muchas gracias por tu apoyo. Voy a intentarlo para ver si me funciona también.", 430, 800, 380, 170)
    ),
    page(
        base = R.drawable.emo_1___5_,
        staticTexts = listOf(sTop("En su hogar, el estudiante revisa la prueba, identifica los errores más relevantes y abre su cuaderno para prepararse de manera adecuada para la siguiente evaluación."),
            sBottom("Al identificar los propios errores, es posible corregirlos y realizar las acciones de manera distinta en futuras ocasiones.")
        ),
        t("En la próxima prueba quiero hacerlo mejor. Voy a estudiar estos ejercicios con calma.", 560, 300, 330, 180)
    ),
    page(
        base = R.drawable.emo_1___6_,
        staticTexts = listOf(sTop("Dos semanas después, la profesora entrega los resultados de una nueva prueba. El estudiante observa su calificación y experimenta satisfacción.\n"),
            sBottom("Observar los resultados del esfuerzo y la dedicación suele generar sentimientos de felicidad y orgullo.\n")
        ),
        t("¡Valió la pena no rendirme! Mejoré gracias a mi esfuerzo.", 100, 300, 300, 180)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.emo_1_rec_1, "Reconocer y nombrar la emoción:\nIdentifica la sensación de malestar, enojo o desánimo y acepta tu emoción nombrándola con claridad, por ejemplo: 'Me siento frustrado' o 'Siento rabia'."),
            rec(R.drawable.emo_1___4_, "Buscar apoyo en alguien de confianza:\nBusca o acepta el apoyo de alguien de confianza para conversar. Al expresar tus emociones, alivias la carga emocional."),
            rec(R.drawable.emo_1_rec_3, "Practicar la respiración consciente:\nRealiza una respiración intencional para recuperar la calma. Inhala 3 segundos, mantén 4 segundos y exhala 6 segundos. Repite hasta sentir tranquilidad."),
            rec(R.drawable.emo_1_rec_4, "Reemplazar la autocrítica por aprendizaje:\nSustituye tus pensamientos internos negativos, como 'No soy bueno para esto', por una visión de crecimiento diciendo: 'Puedo revisar mis errores y hacerlo mejor la próxima vez'."),
            rec(R.drawable.emo_1___5_, "Revisar los errores para volver a intentarlo:\nAnaliza tus errores. Resuelve interrogantes y vuelve a repasar la acción aprendida.")
        )
    )
)

val pagEmo_1 = listOf(
    page(
        base = R.drawable.emo_2___1_,
        staticTexts = listOf(sTop("Javiera falla el penal final de un partido de fútbol y su equipo es eliminado."),
            sBottom("Cuando algo no sale como se esperaba, es normal sentir emociones intensas que a veces no logramos identificar.")
        ),
        t("¡No puede ser, es mi culpa!", 560, 280, 380, 200)
    ),
    page(
        base = R.drawable.emo_2___2_,
        staticTexts = listOf(sTop("Javiera aprieta los puños, respira con rapidez y evita mirar a su equipo."),
            sBottom("Tomar distancia por un momento puede ayudar a evitar reacciones impulsivas.\n")
        ),
        t("Estoy muy molesta… mejor me alejo un poco.", 560, 280, 380, 200)
    ),
    page(
        base = R.drawable.emo_2___3_,
        staticTexts = listOf(sTop("Javiera se aparta del equipo para identificar lo que está sintiendo e intentar calmarse."),
            sBottom("Reconocer las emociones es el primer paso para recuperar la calma.")
        ),
        t("Siento el pecho apretado... necesito buscar apoyo.", 560, 280, 380, 200)
    ),
    page(
        base = R.drawable.emo_2___4_,
        staticTexts = listOf(sTop("Javiera observa al profesor y se acerca un poco dudosa para pedir ayuda."),
            sBottom("Conversar con un adulto de confianza puede contribuir a organizar las propias emociones a través de su orientación.")
        ),
        d("Profesor… ¿puedo conversar con usted?", 60, 280, 300, 150),
        d("Sí, claro… ¿Qué paso?", 460, 280, 300, 150)
    ),
    page(
        base = R.drawable.emo_2___5_,
        staticTexts = listOf(sTop("Javiera expresa lo que siente y el profesor la escucha con atención."),
            sBottom("Cuando disminuye la intensidad de la emoción, es más fácil pensar con claridad y ver lo positivo.")
        ),
        d("Estoy enojada, es mi culpa.", 50, 280, 330, 150),
        d("Jugaste muy bien. El equipo no te culpa por lo sucedido. Le podría haber pasado a cualquiera.", 560, 280, 330, 220)
    ),
    page(
        base = R.drawable.emo_2___6_,
        staticTexts = listOf(sTop("Javiera respira más tranquila y reflexiona sobre lo sucedido."),
            sBottom("Al experimentar frustración, es recomendable que la persona haga una pausa, respire y busque apoyo cuando le resulte difícil continuar.")
        ),
        t("Es verdad, solo debo intentarlo otra vez o entrenar más para la próxima. Lo importante es que jugar fue divertido.", 560, 280, 380, 200)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.emo_2___1_, "Identifica lo que estás sintiendo:\nEs posible observar cambios en el cuerpo o en el ánimo. Por ello, conviene prestar atención a señales como respiración acelerada, tensión muscular o deseos de llorar."),
            rec(R.drawable.emo_2___3_, "Identifica la emoción:\nUna emoción intensa puede mantenerse alrededor de 90 segundos, luego las expresiones son consecuencias de esta emoción y debes utilizar estrategias para sobrellevarlas."),
            rec(R.drawable.emo_2___5_, "Tómate un momento:\nHacer una pausa, respirar profundo o alejarte un instante permite evitar reacciones impulsivas y pensar con claridad."),
            rec(R.drawable.emo_2___6_, "Puedes buscar apoyo en una persona significativa:\nConversar con una persona de confianza (una amistad cercana, un familiar, un profesor o un entrenador) te ayuda a ordenar tus emociones y sentirte acompañado."),

        )
    )
)

val pagEscyaca_1 = listOf(
    page(
        base = R.drawable.escyaca_1___1_,
        staticTexts = listOf(sTop("En el curso de Andrés han entregado las calificaciones de una prueba de química. Florencia se muestra triste y preocupada porque su resultado no fue el esperado. "),
            sBottom("En ocasiones, Andrés no logra comprender por qué un compañero experimenta tanta angustia ante situaciones que, para él, no representan mayor impacto.    ")
        ),
        d("¡Un 4.0! Que mal, mis papás se van a enojar mucho.", 60, 280, 330, 160),
        t("Solo es una nota, no es para tanto.", 560, 280, 380, 150)
    ),
    page(
        base = R.drawable.escyaca_1___2_,
        staticTexts = listOf(sTop("Florencia observa su examen con tristeza, mientras Andrés no comprende su malestar."),
            sBottom("Al no comprender las emociones de los demás, es necesario observar cómo se sienten las personas antes de emitir comentarios, para así responder de manera adecuada.")
        ),
        d("Pero ¿por qué te preocupa tanto? No es tan terrible.", 500, 240, 330, 180),
        d("No me entiendes. Para mí es muy malo tener esta calificación.", 260, 780, 380, 180)
    ),
    page(
        base = R.drawable.escyaca_1___3_,
        staticTexts = listOf(sTop("Felipe, un compañero de clase que ha escuchado la conversación, se acerca a ellos, pues percibe que Florencia puede sentirse incomprendida cuando Andrés no reconoce la magnitud de su preocupación. "),
            sBottom("Dado que las emociones varían de una persona a otra, se debe reflexionar sobre la mejor manera de ayudar a quienes nos rodean.")
        ),
        d("Andrés, puede ser que para ti no sea tan importante una calificación, pero a Florencia sí le afecta y necesita nuestro apoyo.", 40, 240, 350, 210),
        t("Pero... ¿Qué le debo decir?", 560, 280, 380, 150)
    ),
    page(
        base = R.drawable.escyaca_1___4_,
        staticTexts = listOf(sTop("Felipe consuela a Florencia y la abraza mientras Andrés los mira con una expresión triste y confusa."),
            sBottom("Puedes elegir una frase que demuestre comprensión, aunque la emoción no sea la misma. Utilizando frases como: “Entiendo que te preocupe”, “Debe ser difícil”, o “¿Quieres hablar?”")
        ),
        d("Tranquila, Florencia. Debe ser complicado tener papás muy exigentes.", 60, 300, 330, 150),
        d("Muchas gracias.", 300, 780, 330, 130),
        t("Ahora sé que Florencia se siente mal. Le diré algo para que se sienta mejor.", 530, 280, 330, 180)
    ),
    page(
        base = R.drawable.escyaca_1___5_,
        staticTexts = listOf(sTop("Andrés se acerca a Florencia entendiendo que necesita su apoyo y contención."),
            sBottom("Utilizar frases que validen los sentimientos de las personas cuando están preocupadas permite que se sientan comprendidas")
        ),
        d("Entiendo que te preocupe el 4,0… Debió ser difícil si esperabas una calificación mejor.", 510, 280, 330, 180),
        d("Sí, estoy triste y preocupada porque a mis papás no les va a gustar.", 220, 780, 330, 180)
    ),
    page(
        base = R.drawable.escyaca_1___6_,
        staticTexts = listOf(sTop("Andrés identificó que su amiga necesitaba apoyo y le mencionó algunas palabras que la ayudaron a sentirse mejor. "),
            sBottom("Mostrar empatía ayuda a mejorar la comunicación y fortalece las amistades.")
        ),
        d("Para el próximo examen, yo te puedo ayudar a estudiar.", 510, 240, 330, 180),
        d("Muchas gracias, eso me ayudaría mucho", 220, 780, 330, 150)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.escyaca_1_rec_1, "Observar las emociones ajenas:\nPresta atención a las señales no verbales de la otra persona, como su expresión, tono y postura. Esto te ayudará a reconocer rápidamente el estado emocional de la otra persona y responder con empatía."),
            rec(R.drawable.escyaca_1_rec_2, "Validar los sentimientos con frases de apoyo:\nEvita minimizar la preocupación de la otra persona. Utiliza frases como: 'Entiendo que te preocupe' o 'Debe haber sido difícil'."),
            rec(R.drawable.escyaca_1_rec_3, "Ofrecer apoyo específico y concreto:\nPlantea frases, como '¿Quieres conversar un momento?' o '¿Te ayudo con esa tarea?', esto demuestra que valoras y respetas las situaciones personales y sentimientos de la otra persona."),
            rec(R.drawable.escyaca_1_rec_4, "Reconocer la diferencia de perspectivas:\nComprende que dos personas pueden experimentar una misma situación de manera distinta; por ello, evita juzgar a las personas y valida las emociones de los demás."),

            )
    )
)
val pagEscyaca_2 = listOf(
    page(
        base = R.drawable.escyaca_2___1_,
        staticTexts = listOf(sTop("Ángela y su curso deben determinar el menú para la convivencia de fin de año. En este contexto, Ángela levanta la mano y expresa su opinión ante el grupo."),
            sBottom("En la sala de clases se presentan situaciones que requieren la toma de decisiones colectivas, para lo cual es indispensable que todos los integrantes del grupo se escuchen entre sí.")
        ),
        d("Podríamos comer sándwich para la convivencia.", 270, 340, 330, 150)
    ),
    page(
        base = R.drawable.escyaca_2___2_,
        staticTexts = listOf(sTop("Ángela expresó su opinión, sin embargo, uno de sus compañeros manifestó su desacuerdo. "),
            sBottom("En estas situaciones, las personas pueden tener pensamientos distintos y presentar propuestas diversas, pero es fundamental mantener siempre el respeto.")
        ),
        d("¿Sándwich? Mejor pidamos pizza, es más rico. ", 530, 350, 330, 150)
    ),
    page(
        base = R.drawable.escyaca_2___3_,
        staticTexts = listOf(sTop("Surgieron diversas ideas y opiniones. Algunos estudiantes conversaban simultáneamente, mientras exhibían expresiones de duda o desacuerdo."),
            sBottom("Aceptar las opiniones de otras personas y alcanzar acuerdos puede resultar complejo, por lo que en muchas ocasiones se requiere la orientación de un adulto.")
        ),
        d("¡Por favor! Opinen uno a la vez.", 450, 340, 330, 150)
    ),
    page(
        base = R.drawable.escyaca_2___4_,
        staticTexts = listOf(sTop("Los estudiantes solicitan la ayuda de la profesora que acaba de ingresar a la sala y ella les pide que expliquen la situación con el fin de orientarlos adecuadamente."),
            sBottom("Recibir la orientación de un adulto puede facilitar la escucha de opiniones diversas y favorecer la comprensión de los demás.")
        ),
        d("Profe, necesitamos su ayuda. No sabemos como tomar la decisión para elegir lo que comeremos en la convivencia. ", 480, 260, 360, 190),
        d("Lo que podemos hacer es tener en cuenta todas las ideas que han comentado y votar. ", 130, 380, 330, 190)
    ),
    page(
        base = R.drawable.escyaca_2___5_,
        staticTexts = listOf(sTop("La profesora propuso realizar una votación a mano alzada para definir una única opción de comida para la convivencia, asegurando que todos los estudiantes expresen su opinión."),
            sBottom("Al realizar acciones que permitan la expresión de todos, se pueden encontrar soluciones que generen bienestar colectivo.")
        ),
        d("Para hacer la votación necesito que levanten su mano cuando nombre la opción que ustedes quieren.  ", 430, 240, 380, 180)
    ),
    page(
        base = R.drawable.escyaca_2___6_,
        staticTexts = listOf(sTop("El curso de Julieta llevó a cabo la votación de las distintas opciones, resultando ganadora la pizza y todos los estudiantes decidieron aceptar que esa sería la comida de la convivencia."),
            sBottom("En muchas ocasiones, resulta difícil comprender las opiniones de todos; Sin embargo, al escuchar con respeto es posible llegar a acuerdos y alcanzar soluciones que beneficien a todas y todos.")
        ),
        d("Perfecto, estudiantes. Tendremos pizza para nuestra convivencia. ", 430, 250, 380, 180)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.escyaca_2_rec_1, "Expresar tu opinión con respeto:\nComunica tu punto de vista de manera asertiva. Utiliza palabras respetuosas y evita críticas."),
            rec(R.drawable.escyaca_2_rec_2, "Escuchar atentamente para comprender:\nEscucha atentamente los comentarios de las otras personas antes de dar tu opinión. Comprender el mensaje del otro es clave para solucionar el problema."),
            rec(R.drawable.escyaca_2_rec_3, "Respetar los turnos de diálogo:\nEspera tu momento para hablar. Evita interrumpir o exponer al mismo tiempo que otra persona. De esta forma aseguras un diálogo ordenado."),
            rec(R.drawable.escyaca_2___5_, "Solicitar la mediación de un adulto:\nPide ayuda a un adulto, como un profesor, tutor o familiar si el desacuerdo es difícil de resolver. La mediación permitirá apoyar a ambas partes y llegar a un acuerdo para solucionar las diferencias.")
            )
    )
)

val pagSs_1 = listOf(
    page(
        base = R.drawable.ss_1___1_,
        staticTexts = listOf(sTop("En la sala destinada al encuentro de cómics, Camilo llega con anticipación. Solo hay una persona presente, por lo que decide conversar con ella."),
            sBottom("Cuando no conoces a la persona, es recomendable mantener una distancia prudente al acercarte y emplear una frase neutral.")
        ),
        t("Parece que le gustan los cómics, podría hablarle...", 160, 280, 330, 130)
    ),
    page(
        base = R.drawable.ss_1___2_,
        staticTexts = listOf(sTop("Camilo se acerca con calma, manteniendo distancia y tono amable."),
            sBottom("A veces la otra persona puede responder de manera brusca. Mantén la calma y sigue mostrando respeto.")
        ),
        d("Hola, que buen dibujo, ¿Es de algún cómics?", 310, 240, 330, 150),
        d("Sí, pero no me gusta que me miren mientras dibujo.", 560, 330, 330, 150)
    ),
    page(
        base = R.drawable.ss_1___3_,
        staticTexts = listOf(sTop("Camilo respira profundamente y decide no entrar en una discusión. Mantiene una actitud serena y conversa con tranquilidad."),
            sBottom("Responder con respeto ayuda a disminuir la tensión y demuestra madurez emocional.")
        ),
        d("Perdón. no quise molestar solo me parecio llamativo el estilo", 300, 240, 330, 150),
        d("Bueno", 560, 330, 280, 130)
    ),
    page(
        base = R.drawable.ss_1___4_,
        staticTexts = listOf(sTop("La chica guarda su cuaderno, y nota que Camilo tiene una revista de cómic que le llama la atención."),
            sBottom("Buscar un tema en común puede ayudar a facilitar la reconexión y contribuye a mantener una conversación positiva.")
        ),
        d("Guau, ¿Esa es la última versión de SPACE RAIDERS? Me encanta ", 560, 280, 330, 180),
        d("Sí, es buena, aunque hay una nueva fuerza maligna atacando.", 60, 480, 330, 180)
    ),
    page(
        base = R.drawable.ss_1___5_,
        staticTexts = listOf(sTop("Después de hablar un tiempo, la chica se despide sin mucho entusiasmo. Camilo siente incomodidad con la situación."),
            sBottom("Si la interacción es incómoda, reconoce la sensación y considera qué alternativas de respuesta podrías aplicar en futuras situaciones semejantes.")
        ),
        d("Mmmm... Viene el expositor, anda a tu puesto.", 560, 300, 300, 150),
        d("Sí, ya voy.", 60, 300, 280, 170)
    ),
    page(
        base = R.drawable.ss_1___6_,
        staticTexts = listOf(sTop("Camilo se retira de la conversación con una sensación de incomodidad e insatisfacción y se dirige hacia su amigo, que acaba de llegar."),
            sBottom("Es normal sentirse incómodo cuando una situación no es agradable, pero no lo tomes como algo personal; cada persona puede reaccionar de manera diferente.")
        ),
        d("Nunca más le hablo a personas que no conozco.", 300, 270, 330, 180),
        d("Creo que fui muy dura", 550, 360, 330, 150)
    ),
    page(
        base = R.drawable.ss_1___7_,
        staticTexts = listOf(sTop("Camilo se reúne con su amigo y le explica lo ocurrido porque la situación le generó incomodidad y siente la necesidad de conversarlo."),
            sBottom("Conversar con un amigo o persona cercana puede contribuir  a comprender las propias emociones y orientar la manera de actuar.")
        ),
        d("¿Qué pasó?,¿por qué tienes esa cara?", 500, 270, 330, 180),
        d("Me siento algo triste, porque conversé con una chica y fue fastidiosa conmigo.", 50, 460, 330, 150)
    ),
    page(
        base = R.drawable.ss_1___8_,
        staticTexts = listOf(sTop("Al conversar con su amigo, Camilo comprende que quizá no era el momento más adecuado para acercarse a la joven y que ella podría haber tenido un mal día."),
            sBottom("No debes culparte por una interacción que no salió bien. Aprende de lo ocurrido, observa mejor la situación la próxima vez y sigue intentándolo.")
        ),
        d("Tranquilo, tal vez se pone nerviosa con desconocidos y por eso actúa así.", 500, 270, 330, 180),
        d(" A veces, se me dificulta entender a las personas, pero tienes razón.", 550, 360, 330, 150)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.ss_1___1_, "Observar si la persona está disponible y si el momento es oportuno:\nSi una persona parece ocupada, concentrada o con prisa, no es buen momento. Comienza con un saludo y evalúa su respuesta."),
            rec(R.drawable.ss_1___3_, "Haz preguntas neutras:\nUna buena estrategia para mostrar interés es hacer preguntas. Si no ves interés, puedes decidir terminar la conversación con respeto."),
            rec(R.drawable.ss_1___8_, "Reflexionar y no culparse:\nSi la situación fue incómoda, reflexiona si el momento fue oportuno o si la persona simplemente no quiso entablar una conversación y aprende de lo aprendido.")
        )
    )
)
val pagSs_2 = listOf(
    page(
        base = R.drawable.ss_2___1_,
        staticTexts = listOf(sTop("En el pasillo del colegio, Tomás se acerca a Valentina para conversar."),
            sBottom("En la clase anterior, Valentina y sus compañeros discutieron mientras realizaban un trabajo grupal.")
        ),
        d("¡Valentina! ¿Viste el video que te envié anoche?", 250, 240, 330, 150),
        t("¡Qué rabia! ¡Quiero estar sola!", 540, 480, 330, 180)
    ),
    page(
        base = R.drawable.ss_2___2_,
        staticTexts = listOf(sTop("Tomás no advierte el malestar de Valentina y continua dirigiéndose a ella con naturalidad."),
            sBottom("Valentina ignora a Tomás porque se siente enojada y quiere estar sola.")
        ),
        d("¡Te va a encantar! Es sobre el juego que nos gusta.", 150, 600, 300, 150)
    ),
    page(
        base = R.drawable.ss_2___3_,
        staticTexts = listOf(sTop("Tomás se siente confundido y no comprende el malestar de Valentina."),
            sBottom("Cuando una persona está enojada, puede necesitar estar sola un momento.")
        ),
        d("¿Estás bien?, ¿por qué no me respondes?", 250, 240, 330, 130),
        d("¡Déjame en paz, quiero estar sola!", 560, 380, 330, 130)
    ),
    page(
        base = R.drawable.ss_2___4_,
        staticTexts = listOf(sTop("Cuando una persona está enojada, su cara y su cuerpo cambian. Puede fruncir el ceño, cruzar los brazos o hacer uso de un tono de voz elevado."),
            sBottom("Para comprender mejor a las personas, es necesario observar sus expresiones y su postura; así es posible identificar su malestar.\n")
        ),
        t("Se ve tensa y su cara está seria. Creo que algo no está bien.", 300, 280, 330, 180)
    ),
    page(
        base = R.drawable.ss_2___5_,
        staticTexts = listOf(sTop("Tomás respira profundamente y aunque no comprende por completo lo que ocurre, opta por proporcionar espacio a Valentina y esperar que ella esté más tranquila para retomar la conversación. "),
            sBottom("Al identificar que alguien está enojado, se debe esperar y facilitar un momento a solas.")
        ),
        d("Si quieres, podemos hablar después, cuando te sientas mejor.", 10, 600, 330, 180),
        d("Gracias, lo tendré en cuenta.", 530, 800, 330, 150)  ),
    page(
        base = R.drawable.ss_2___6_,
        staticTexts = listOf(sTop("Durante el almuerzo, Valentina se muestra más animada y decide sentarse junto a Tomás para conversar sobre lo ocurrido."),
            sBottom("Comprender los sentimientos de las personas ayuda a evitar discusiones y mantener relaciones saludables.")
        ),
        d("En la mañana, discutí con mi grupo de trabajo y me enojé. Perdón por cómo te hablé.", 400, 340, 330, 180),
        d("Está bien, no te preocupes. Me alegra que me lo hayas contado.", 50, 780, 330, 180)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.ss_2___4_, "Percibir señales no verbales:\nIdentifica las señales corporales prestando atención a las expresiones faciales, la postura y el tono de voz. Esto permitirá comprender mejor lo que los demás no expresan con palabras."),
            rec(R.drawable.ss_2_rec_2, "Respetar el espacio personal:\nOtorga el espacio y tiempo necesario, en muchas ocasiones las personas necesitan un tiempo a solas antes de expresar lo que sienten o piensan."),
            rec(R.drawable.ss_2_rec_3, "Respirar profundo y tomar tiempo a solas:\nRespira profundo para mantenerte calmado antes de responder frente a una situación tensa."),
            rec(R.drawable.ss_2___5_, "Comunicarse con calma y claridad:\nUtiliza un tono tranquilo y amable. Usa palabras respetuosas y clara, de esta forma tu mensaje será bien entendido."),
            rec(R.drawable.ss_2___6_, "Reflexionar y aprender de la experiencia:\nDedica un momento para pensar con claridad lo que sucedió, y de esta forma identificar qué hiciste bien y qué podrías hacer diferente la próxima vez.")
        )
    )
)

val pagTyrrss_1 = listOf(
    page(
        base = R.drawable.tyrrss_1___1_,
        staticTexts = listOf(sTop("Juan está con su compañera de curso Sofía y deben entregar un trabajo por correo. Juan dudoso, piensa en como comenzar."),
            sBottom("Si no sabes cómo redactar un correo formal, escribe de manera amable y respetuosa.")
        ),
        t("La profe Ana pidió que le enviáramos el trabajo por correo, pero… nunca he mandado un correo a un profesor", 150, 300, 330, 200)
    ),
    page(
        base = R.drawable.tyrrss_1___1_2,
        staticTexts = listOf(sTop("Sofía se acerca y le sugiere escribir de forma rápida y sin preocuparse demasiado."),
            sBottom("Antes de enviar un mensaje, es fundamental considerar a quién va dirigido. No es lo mismo escribir a un amigo que al dirigirse a una profesora.")
        ),
        d("Escribe algo corto como: “Profe, ahí va mi trabajo, chao”.", 50, 280, 330, 160),
        d("¿Así nada más? No sé si está muy informal…", 560, 280, 330, 180)
    ),
    page(
        base = R.drawable.tyrrss_1___2_,
        staticTexts = listOf(sTop("Juan escribe un mensaje sin signos de puntuación ni mayúsculas, utilizando un estilo informal como si conversara por chat con un amigo."),
            sBottom("Cuando se evita escribir con prisa y se utilizan adecuadamente los signos y las mayúsculas, es más probable que las ideas se comprendan con claridad.")
        ),
        d("Hola, aquí envio mi trabajo con mi compañera. Chau", 150, 600, 250, 160)
    ),
    page(
        base = R.drawable.tyrrss_1___3_,
        staticTexts = listOf(sTop("Sofía le señala que no importa, que igual se entiende."),
            sBottom("No basta que el mensaje sea comprensible, se requiere que también refleje respeto y cuidado.")
        ),
        d("Sofi, creo que lo redacté, ¿mal, me ayudas?.", 50, 280, 330, 150),
        d("Yo creo que está súper", 560, 280, 330, 140)
    ),
    page(
        base = R.drawable.tyrrss_1___4_,
        staticTexts = listOf(sTop("Juan recuerda una clase de la profesora Ana sobre cómo usar signos de puntación y estructurar en los mensajes."),
            sBottom("Usar puntuación y orden demuestra respeto por quien te lee y mejora la claridad de tu comunicación.")
        ),
        t("Ahora recuerdo que la profesora subió un archivo de la clase sobre cómo redactar bien un mensaje. Lo leeré.", 150, 300, 330, 190)

    ),
    page(
        base = R.drawable.tyrrss_1___5_,
        staticTexts = listOf(sTop(" Juan borra el mensaje y comienza a escribir uno nuevo, aplicando lo señalado por la profesora."),
            sBottom("Siempre es posible corregir y mejorar un mensaje antes de enviarlo. La revisión constituye una parte fundamental de la escritura adecuada.")
        ),
        d("Estimada profesora:\n" +
                "Junto con saludar, adjunto mi trabajo, quedo atento a sus comentarios. \n" +
                "Atte,\n" +
                "Juan  Rivas Oñate\n" +
                "Sofía Lobos Ulloa", 150, 300, 330, 300)
    ),
    page(
        base = R.drawable.tyrrss_1___6_,
        staticTexts = listOf(sTop("Juan redacta un correo que incluye un saludo, un cuerpo del mensaje y una despedida, usando una puntuación adecuada y tono cordial."),
            sBottom("Cuando la persona organiza sus ideas con un saludo, un mensaje claro y una despedida amable, es más fácil comunicarse de manera eficaz.")
        ),
        d("Sofi, ahora si lo redacte bien. Mira, así se hace:\n" +
                "Saludo, cuerpo (mensaje), me despido y dejo mi nombre. Utilizando puntos y comas para marcar las pausas ", 10, 280, 330, 280),
        d("Tienes razón, se ve mucho mejor", 560, 280, 300, 220)
    ),
    page(
        base = R.drawable.tyrrss_1___7_,
        staticTexts = listOf(sTop("Juan envía el correo con satisfacción. Sofía observa el proceso  y adquiere nuevos aprendizajes."),
            sBottom("Cada mensaje que envías comunica algo de ti. Escribir con respeto constituye una forma de reflejar tu identidad.")
        ),
        d("Ahora, escribiré así todos mis correos.", 510, 280, 330, 280),
        d("Recuerda que dependerá del destinatario, a veces podemos ser más relajados.", 60, 380, 300, 220)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.tyrrss_1___3_, "Al escribir un mensaje considera el destinatario:\nSi es una persona adulta, procura estructurar el mensaje con estilo y escritura formal."),
            rec(R.drawable.tyrrss_1___5_, "En el asunto del mensaje:\nEste debe ser claro, reflejando el propósito del mensaje. Por ejemplo, 'Solicitud de información sobre proyecto'."),
            rec(R.drawable.tyrrss_1___6_, "Comienza con un saludo apropiado:\nEn un contexto formal, utiliza 'Estimado/a [Nombre]'. En un contexto más informal, puedes utilizar 'Hola [Nombre]'."),
            rec(R.drawable.tyrrss_1___7_, "Termina con una frase que indique la acción que esperas del destinatario:\nPor ejemplo: 'Espero su respuesta' o 'Quedo atento/a a sus comentarios'. Y despídete con 'Atentamente' o 'Saludos cordiales', seguido de tu nombre.")
        )
    )
)

val pagTyrrss_2 = listOf(
    page(
        base = R.drawable.tyrrss_2___1_,
        staticTexts = listOf(sTop("Lucas está en su pieza jugando en línea después del colegio. Le gusta conversar con otras personas que disfrutan los mismos juegos que él."),
            sBottom("Cuando alguien comprende los gustos de otro o menciona algo amable, es posible sentir alegría y tranquilidad.")
        ),
        t("Me llegó un mensaje de un nuevo jugador. Quizás, quiere jugar conmigo.", 10, 240, 420, 200)
    ),
    page(
        base = R.drawable.tyrrss_2___2_,
        staticTexts = listOf(sTop("Lucas abre el mensaje y lo lee. Sin embargo, experimenta incomodidad al recibir preguntas de carácter personal y no tiene certeza si corresponde responder dichos mensajes. "),
            sBottom("Lucas manifiesta confusión y nerviosismo, dado que desconoce si esa persona es confiable. ")
        ),
        t("Que extraño este mensaje, dice:  “¡Estás en una liga muy alta! ¿Y si nos juntamos en tu casa?, ¿me das tu dirección?”", 530, 300, 330, 230)
    ),
    page(
        base = R.drawable.tyrrss_2___3_,
        staticTexts = listOf(sTop("Lucas presenta un estado de confusión y nerviosismo, pues no tiene claridad respecto de la confiabilidad de esa persona."),
            sBottom("Cuando una persona siente incomodidad, puede detenerse, respirar y pedir consejos a alguien de confianza.")
        ),
        t("Tiene muchos amigos, pero no sé si es correcto enviar mi dirección.", 50, 300, 300, 200)
    ),
    page(
        base = R.drawable.tyrrss_2___4_,
        staticTexts = listOf(sTop("Lucas, preocupado, decide acudir a su madre. Se dirige a su habitación y comenta con ella la situación que acaba de suceder. "),
            sBottom("Actuar con calma y pedir apoyo a un adulto de confianza, ayuda a mantener la seguridad en internet.")
        ),
        d("Mamá, ¡no sabes lo que me pasó! Un jugador que no conozco en persona, me pidió mi dirección. ", 50, 300, 300, 200),
        d("Tranquilo, yo te ayudo. Muéstrame el mensaje. ", 530, 600, 200, 200)
    ),
    page(
        base = R.drawable.tyrrss_2___5_,
        staticTexts = listOf(sTop("La madre revisa el mensaje, lo aconseja y le indica lo que debe hacer en estas situaciones."),
            sBottom("Recuerda que puedes bloquear y reportar a cualquier usuario que realice preguntas personales o incómodas.")
        ),
        d("Estos mensajes son extraños. Lo mejor es no responder y bloquear.", 550, 250, 240, 200),
        d("Gracias mamá. Hice bien en no responder y bloquear. Ahora, me siento más seguro.", 50, 600, 300, 200)
    ),
    page(
        base = R.drawable.tyrrss_2___6_,
        staticTexts = listOf(sTop("Lucas vuelve a jugar, ahora está más tranquilo y comprende lo que debe hacer frente a estas situaciones. "),
            sBottom("Los videojuegos son un espacio para divertirse y compartir con otras personas. Sin embargo, hay información personal que no se debe entregar. Es importante pedir ayuda ante cualquier situación incómoda.")
        ),
        t("Ahora, puedo seguir jugando tranquilo.", 450, 300, 230, 180)
    ),
    pageRecs(
        recomendaciones = listOf(
            rec(R.drawable.tyrrss_2_rec_1, "Respirar profundo y tomar un tiempo a solas:\nToma un momento para calmar la mente y el cuerpo antes de reaccionar frente a una situación difícil."),
            rec(R.drawable.tyrrss_2___5_, "Conversar con una persona de confianza:\nComparte lo que sientes con alguien cercano y comprensivo, expresa lo que ocurrió y de esta forma pide orientación o consejos."),
            rec(R.drawable.tyrrss_2_rec_3, "Sigue los consejos de una persona de confianza:\nLo preferible en situaciones de riesgo en internet es, no responder mensajes sospechosos, evitar compartir información personal y bloquear al usuario.")
        )
    )
)