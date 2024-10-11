package com.example.ejercicio1.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit

@Composable
fun MyText(string: String, fontSize: TextUnit, color: Color ) {
    Text(
        text = string,
        fontSize = fontSize,
        color = color
    )
}

