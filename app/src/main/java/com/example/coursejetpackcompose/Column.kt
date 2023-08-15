package com.example.coursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyColumn( ){
    Column(
        Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {


        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .height(100.dp))
        Text(text = "Text 1",modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .height(100.dp))
        Text(text = "Text 1",modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .height(100.dp))
        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(100.dp))
        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .height(100.dp))
        Text(text = "Text 1",modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .height(100.dp))
        Text(text = "Text 1",modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .height(100.dp))
        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(100.dp))
        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .height(100.dp))
        Text(text = "Text 1",modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .height(100.dp))
        Text(text = "Text 1",modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .height(100.dp))
        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(100.dp))
        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(100.dp))
        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .height(100.dp))
        Text(text = "Text 1",modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .height(100.dp))
        Text(text = "Text 1",modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .height(100.dp))
        Text(text = "Text 1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(100.dp))
    }
}