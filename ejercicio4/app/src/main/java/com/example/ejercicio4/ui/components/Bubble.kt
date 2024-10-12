package com.example.ejercicio4.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Bubble(@DrawableRes resourceId: Int, description: String) {
    Box(
        modifier = Modifier
            .size(72.dp)
            .shadow(elevation = 4.dp, shape = CircleShape)
            .clip(CircleShape)
            .background(Color.LightGray)
    ) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = description,
        )
    }
}