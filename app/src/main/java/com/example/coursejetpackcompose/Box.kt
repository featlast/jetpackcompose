package com.example.coursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyBox() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray), contentAlignment = Alignment.BottomCenter){
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
            .clip(RoundedCornerShape(topEnd = 120.dp))
            .background(Color(0xFFFF5722))
            ,contentAlignment = Alignment.Center ){
            Text(text = "Sign In", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        }
    }
}