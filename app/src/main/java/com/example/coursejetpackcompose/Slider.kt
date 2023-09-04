package com.example.coursejetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BasicSlider() {
    Column(
        modifier = Modifier.padding(vertical = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var sliderPosition by remember {
            mutableStateOf(0f)
        }
        Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
        Text(text = sliderPosition.toString())
    }

}

@Composable
fun AdvacendSlider() {
    Column(
        modifier = Modifier.padding(vertical = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var sliderPosition by remember {
            mutableStateOf(0f)
        }
        var completeValue by remember {
            mutableStateOf("")
        }

        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..10f,
            steps = 9,
            onValueChangeFinished = { completeValue = sliderPosition.toString() }
        )
        Text(text = completeValue)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyRangeSlider() {
    Column(
        modifier = Modifier.padding(vertical = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var currentRange by remember {
            mutableStateOf(0f..10f)
        }
        RangeSlider(
            value = currentRange,
            onValueChange = { currentRange = it },
            valueRange = 0f..40f,
            steps = 9
        )
        Text(text = "Position Initial => ${currentRange.start}")
        Text(text = "Position Final => ${currentRange.endInclusive}")

    }

}