package com.example.ejercicio2.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonColor(string1: String, string2: String, color: Color) {
    var myButtonString by remember { mutableStateOf(string1) }
    var myButtonTextColor by remember { mutableStateOf(Color.White) }
    var myButtonContainerColor by remember { mutableStateOf(Color.DarkGray)}
    var myButtonBorderStroke by remember { mutableStateOf(BorderStroke(1.dp,Color.Black)) }
    var myButtonShape by remember { mutableStateOf(RoundedCornerShape(20.dp)) }
    Button(
        onClick = {
            myButtonString = string2
            myButtonTextColor = Color.Black
            myButtonContainerColor = color
            myButtonBorderStroke = BorderStroke(3.dp,Color.Black)
            myButtonShape = RoundedCornerShape(4.dp) },
        colors = ButtonDefaults.buttonColors(myButtonContainerColor),
        border = myButtonBorderStroke,
        shape = myButtonShape) {
        Text(myButtonString, color = myButtonTextColor)
    }
}
