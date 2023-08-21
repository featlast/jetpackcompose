package com.example.coursejetpackcompose.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldAdvanced() {
    var myText by remember { mutableStateOf("") }
    TextField(value = myText, onValueChange ={
    myText = if(it.contains("a")){
        it.replace("a","*")
    }else{
        it
    }
    },Modifier.padding(vertical = 20.dp), label = { Text(text = "Ingresa Tu Nombre")} )
}