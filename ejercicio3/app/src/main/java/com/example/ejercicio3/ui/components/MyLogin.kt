package com.example.ejercicio3.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio3.R

@Composable
fun MyLogin() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var messageString by remember { mutableStateOf("")}
    var messageColor by remember { mutableStateOf(Color.White)}
    Column {
        Box(Modifier.padding(80.dp)) {
            Image(
                painter = painterResource(id = R.drawable.gc_logo_flag),
                contentDescription = "Descripción de la imagen"
            )
        }

        Box(Modifier.padding(bottom = 20.dp)) {
            Text("Enter your credentials\nto start session",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight(800),
                lineHeight = 20.sp,
                fontSize =  20.sp,
            )
        }

        Box(Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, end = 50.dp)) {
            Box(Modifier
                .fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(20.dp))
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
                .padding(30.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "Descripción de la imagen",
                        Modifier.padding(bottom = 10.dp)
                    )

                    OutlinedTextField(
                        modifier = Modifier.padding(bottom = 15.dp).fillMaxWidth(),
                        value = username,
                        onValueChange = { username = it },
                        label = { Text("Email") },
                        singleLine = true
                    )
                    OutlinedTextField(
                        modifier = Modifier.padding(bottom = 15.dp).fillMaxWidth(),
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation()
                    )

                    Text(messageString, Modifier.padding(bottom = 15.dp), messageColor)

                    Button(onClick = {
                        if (username.isBlank() || password.isBlank()) {
                            messageString = "Insert username and password"
                            messageColor = Color.Black
                        }
                        else if (username == "admin" && password == "12345") {
                            messageString = "User OK"
                            messageColor = Color.Green
                        }
                        else {
                            messageString = "User not OK"
                            messageColor = Color.Red
                        }
                    },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(20.dp),
                        colors = ButtonDefaults.buttonColors(Color.hsl(45f, 1f, 0.60f)),
                        border = BorderStroke(1.dp, Color.hsl(45f, 1f, 0.45f))
                    ) {
                        Text(
                            text = "LOGIN",
                            color = Color.DarkGray,
                            fontSize = 18.sp,
                            fontWeight = FontWeight(800))
                    }
                }
            }
        }
    }
}
