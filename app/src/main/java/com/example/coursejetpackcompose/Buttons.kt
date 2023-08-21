package com.example.coursejetpackcompose

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButton() {
    var enabled by rememberSaveable {
         mutableStateOf(true)
    }
    Column(
        Modifier
            .padding(30.dp)
            .fillMaxSize()) {
        Button(onClick = { enabled=false },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan, contentColor = Color.Red),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                hoveredElevation = 10.dp
            ),
            border = BorderStroke(5.dp, color = Color.Blue),
            enabled = enabled,
        ) {
            Text(text = "Print")
        }
        
        OutlinedButton(onClick = {}, modifier = Modifier.padding(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan, contentColor = Color.Red),
            ) {
            Text(text = "OutLined")
        }
        TextButton(onClick = {  }) {
            Text(text = "TextBtns")
        }
        
        Text(text = "Text Clickeable",Modifier.clickable {  })
    }
}