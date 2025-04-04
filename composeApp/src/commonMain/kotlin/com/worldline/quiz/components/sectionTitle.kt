package com.worldline.quiz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

@Composable
fun sectionTitle(text: String){
    Text(
        text,
        fontSize = 18.sp,
        color = Color.White,
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .background(Color(0xFF84A98C))
    )
}