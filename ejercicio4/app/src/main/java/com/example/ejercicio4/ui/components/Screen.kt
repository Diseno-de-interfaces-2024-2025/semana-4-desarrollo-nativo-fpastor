package com.example.ejercicio4.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.ejercicio4.R

@Composable
fun Screen() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().padding(96.dp, 32.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.gc_logo_flag),
                contentDescription = "Game Collector Flag Logo",
            )
        }

        Row(Modifier
            .horizontalScroll(rememberScrollState())
            .shadow(elevation = 4.dp, shape = RectangleShape)
            .background(Color.DarkGray)
            .padding(16.dp)
            .zIndex(1f),
            horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Bubble(resourceId = R.drawable.playstation, description = "PlayStation")
            Bubble(resourceId = R.drawable.xbox, description = "Xbox")
            Bubble(resourceId = R.drawable.atari, description = "ATARI")
            Bubble(resourceId = R.drawable.neogeo, description = "NeoGeo")
            Bubble(resourceId = R.drawable.nintendo_switch, description = "Nintendo Switch")
            Bubble(resourceId = R.drawable.playstation, description = "PlayStation")
            Bubble(resourceId = R.drawable.xbox, description = "Xbox")
            Bubble(resourceId = R.drawable.atari, description = "ATARI")
            Bubble(resourceId = R.drawable.neogeo, description = "NeoGeo")
            Bubble(resourceId = R.drawable.nintendo_switch, description = "Nintendo Switch")
        }

        Row(Modifier
            .fillMaxSize()
            .weight(0.75f)
            .background(Color.White)) {
            Box(Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(16.dp)) {
                Box(Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(20.dp))
                    .border(1.dp, Color.hsl(229f, 0.43f, 0.67f))
                    .background(Color.hsl(229f, 0.59f, 0.76f))
                    .padding(16.dp)) {
                    Text(text = "Hola", color = Color.White)
                }
            }
            Box(Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(0.dp, 16.dp, 16.dp, 16.dp)
                .verticalScroll(rememberScrollState())
            ) { Text(
                text = "Lorem fistrum diodenoo ese pedazo de llevame al sircoo ese que llega" +
                        "no te digo trigo por no llamarte Rodrigor de la pradera diodeno a wan" +
                        "no te digo trigo por no llamarte Rodrigor. Qué dise usteer diodenoo" +
                        "está la cosa muy malar hasta luego Lucas pupita. Ese hombree de la" +
                        "pradera condemor llevame al sircoo se calle ustée tiene musho" +
                        "peligro pecador sexuarl amatomaa a peich. Te voy a borrar el cerito" +
                        "se calle ustée ese pedazo de llevame al sircoo sexuarl. Amatomaa" +
                        "apetecan amatomaa jarl está la cosa muy malar." +
                        "Pupita amatomaa a wan papaar papaar de la pradera sexuarl sexuarl" +
                        "mamaar quietooor va usté muy cargadoo.",
                color = Color.DarkGray,
                fontSize = 14.sp,
                lineHeight = 18.sp)
            }
        }

        Row(Modifier.fillMaxSize().weight(1.25f).background(Color.White)) {
            Box(Modifier.fillMaxSize().background(Color.LightGray).weight(1f).padding(10.dp)) {
                Text(text = "GAME COLLECTOR")
            }

            Spacer(Modifier.width(10.dp))

            Box(Modifier.fillMaxSize().weight(1f).padding(10.dp)) {
                Text(text = "GAME COLLECTOR")
            }
        }

    }
}