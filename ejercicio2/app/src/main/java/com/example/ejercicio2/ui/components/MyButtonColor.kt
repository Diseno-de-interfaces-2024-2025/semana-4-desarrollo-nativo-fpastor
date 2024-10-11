package com.example.ejercicio2.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonColor(string1: String, string2: String, color: Color) {
    var click by remember { mutableStateOf(false) }
    Button(
        onClick = { click = !click },
        colors = ButtonDefaults.buttonColors(containerColor = if (click) color else Color.DarkGray),
        border = if(click) BorderStroke(3.dp, Color.Black) else BorderStroke(1.dp,Color.Black),
        shape = if (click) RoundedCornerShape(4.dp) else RoundedCornerShape(20.dp)
    ) {
        if (click) {
            Text(string2, color = Color.Black)
        } else {
            Text(string1, color = Color.White)
        }
    }
}
