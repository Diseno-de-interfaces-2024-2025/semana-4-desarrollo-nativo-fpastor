package com.example.ejercicio2.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun MyButtonText() {
    var click by remember { mutableStateOf(false) }
    Button(onClick = { click=!click }) {
        if(click) {
            Text("Botón pulsado")
        } else {
            Text("Pulsa aquí")
        }
    }
}