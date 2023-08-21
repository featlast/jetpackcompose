package com.example.coursejetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Hola")
        Text(text = "Ejemplo", color = Color.Green)
        Text(text = "Ejemplo", fontWeight = FontWeight.Bold)
        Text(text = "Ejemplo", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(text = "Ejemplo", style = TextStyle(textDecoration = TextDecoration.LineThrough))



    }
}