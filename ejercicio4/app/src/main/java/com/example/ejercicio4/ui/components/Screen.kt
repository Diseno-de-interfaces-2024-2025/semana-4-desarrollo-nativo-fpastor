package com.example.ejercicio4.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.ejercicio4.R

@Composable
fun Screen() {
    var fieldName by remember { mutableStateOf("") }
    var fieldEmail by remember { mutableStateOf("") }
    var fieldAddress by remember { mutableStateOf("") }
    var fieldCountry by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var country by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        //modifier = Modifier.fillMaxSize()
    ) {

        // App title box
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(96.dp, 32.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.gc_logo_flag),
                contentDescription = "Game Collector Flag Logo",
            )
        }

        // Bubbles' row with horizontal scroll
        Row(
            Modifier
                .horizontalScroll(rememberScrollState())
                .shadow(elevation = 16.dp, shape = RectangleShape)
                .background(Color.DarkGray)
                .padding(16.dp)
                .zIndex(1f),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Bubble(resourceId = R.drawable.atari, description = "ATARI")
            Bubble(resourceId = R.drawable.atlus, description = "ATLUS")
            Bubble(resourceId = R.drawable.neogeo, description = "NeoGeo")
            Bubble(resourceId = R.drawable.nintendo_switch, description = "Nintendo Switch")
            Bubble(resourceId = R.drawable.playstation, description = "PlayStation")
            Bubble(resourceId = R.drawable.rockstar, description = "RockStar Games")
            Bubble(resourceId = R.drawable.xbox, description = "Xbox")
        }

        // Row for game description, with photo and text with scroll
        Row(
            Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.White)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.boxart),
                    contentDescription = "Coverart",
                )
            }
            Box(
                Modifier
                    .weight(1f)
                    .padding(0.dp, 8.dp, 8.dp, 8.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
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
                    fontSize = 13.sp,
                    lineHeight = 16.sp
                )
            }
        }

        // Row for "Form" title
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Formulario", fontSize = 24.sp, fontWeight = FontWeight(800))
        }

        // Column for the form
        Column(modifier = Modifier.fillMaxSize().background(Color.White).padding(10.dp)) {
            Row(Modifier.background(Color.White).fillMaxWidth().weight(1f)) {
                OutlinedTextField(
                    value = fieldName,
                    onValueChange = { fieldName = it },
                    label = { Text("Name") },
                    singleLine = true,
                    modifier = Modifier.weight(1f)
                )
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f)) {
                    Text(text = name)
                }
            }
            Row(Modifier.background(Color.White).fillMaxWidth().weight(1f)) {
                OutlinedTextField(
                    value = fieldEmail,
                    onValueChange = { fieldEmail = it },
                    label = { Text("Email") },
                    singleLine = true,
                    modifier = Modifier.weight(1f)
                )
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f)) {
                    Text(text = email)
                }
            }
            Row(Modifier.background(Color.White).fillMaxWidth().weight(1f)) {
                OutlinedTextField(
                    value = fieldAddress,
                    onValueChange = { fieldAddress = it },
                    label = { Text("Address") },
                    singleLine = true,
                    modifier = Modifier.weight(1f)
                )
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f)) {
                    Text(text = address)
                }
            }
            Row(Modifier.background(Color.White).fillMaxWidth().weight(1f)) {
                OutlinedTextField(
                    value = fieldCountry,
                    onValueChange = { fieldCountry = it },
                    label = { Text("Country") },
                    singleLine = true,
                    modifier = Modifier.weight(1f)
                )
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f)) {
                    Text(text = country)
                }
            }
            Row(
                Modifier.fillMaxWidth()
                    .background(Color.White)
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    name = fieldName
                    email = fieldEmail
                    address = fieldAddress
                    country = fieldCountry
                }) {
                    Text(text = "Actualizar")
                }
            }
        }
    }
}
