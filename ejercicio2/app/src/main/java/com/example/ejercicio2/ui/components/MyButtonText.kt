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
    var myButtonString by remember { mutableStateOf("Press here")}
    Button(onClick = { myButtonString = "Button pressed" }) {
        Text(myButtonString)
    }
}