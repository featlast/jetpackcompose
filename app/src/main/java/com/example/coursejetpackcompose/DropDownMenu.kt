package com.example.coursejetpackcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyDropDownMenu() {
    var selectText by remember {
        mutableStateOf("")
    }
    var expanded by remember {
        mutableStateOf(false)
    }
    val dessets= listOf("Helado","Chocolate","Café", "Fruta", "Pankakes")
    Column(Modifier.padding(30.dp)) {
        OutlinedTextField(
            value = selectText,
            onValueChange = { selectText = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded = true }
                .fillMaxWidth()
        )
        DropdownMenu(expanded =expanded , onDismissRequest = { expanded=false }, modifier = Modifier.fillMaxWidth()) {
            dessets.forEach{dessets->
                DropdownMenuItem(text = { Text(text = dessets) }, onClick = { expanded=false
                selectText=dessets})
            }
        }
    }
}