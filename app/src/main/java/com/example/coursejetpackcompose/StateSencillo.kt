package com.example.coursejetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyStateSimple() {
    var counter by rememberSaveable {
        mutableStateOf(0)
    }
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Box {
            Text(text = "Cantidad de Clicks ${counter} ")

        }
        Row ( verticalAlignment = Alignment.CenterVertically){
            Button(onClick = { counter +=1}) {
                Text(text = "+1")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { counter =0}) {
                Text(text = "0")
            }
        }

    }
}