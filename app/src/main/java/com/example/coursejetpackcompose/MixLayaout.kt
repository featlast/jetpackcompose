package com.example.coursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun MyComplexLayout() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Box(
            Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .weight(1f), contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Text 1",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        MySpacerVertical(size = 30)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .background(Color.Red)
                    .fillMaxHeight(), contentAlignment = Alignment.Center
            ) {
                Text(text = "Text 2", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            }
            MySpacerHorizontal(size = 30)
            Box(
                Modifier
                    .weight(1f)
                    .background(Color.Green)
                    .fillMaxHeight(), contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola", fontSize = (30.sp), fontWeight = FontWeight.Bold)
            }
        }
        MySpacerVertical(size = 30)
        Box(
            Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .weight(1f), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Text 4", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        }
    }
}
@Composable
fun MySpacerVertical(size:Int){
 Spacer(modifier = Modifier.height(size.dp))
}

@Composable
fun MySpacerHorizontal(size:Int){
    Spacer(modifier = Modifier.width(size.dp))
}