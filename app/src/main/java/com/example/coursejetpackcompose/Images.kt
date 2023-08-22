package com.example.coursejetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Ejemplo",
        alpha = 0.5f
    )
}

@Composable
fun MyImageAdvance() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Ejemplo",
        modifier = Modifier.clip(CircleShape)
    )

}

@Composable
fun MyIcon() {
    Icon(imageVector = Icons.Rounded.Star, contentDescription = "Icono", tint = Color.Magenta)
}

@Preview
@Composable
fun MyProgressBar() {
    var showLoading by rememberSaveable {
        mutableStateOf(false)
    }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading) {
            CircularProgressIndicator(color = Color.Red)
            LinearProgressIndicator(
                Modifier.padding(top = 24.dp),
                color = Color.Magenta,
                trackColor = Color.Blue
            )
        }
        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "Cargar Perfil")
        }

    }
}

@Composable
fun MyProgressAdvanced() {
    var stateProgress by rememberSaveable {
        mutableStateOf(0f)
    }
    stateProgress = stateProgress.coerceAtLeast(0f)
    println("=>, $stateProgress")
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LinearProgressIndicator(progress = stateProgress)
        Row(Modifier.fillMaxWidth()) {
            Button(onClick = {
                if (stateProgress < 1) {
                    stateProgress += 0.1f
                }
            }) {
                Text(text = "Incrementar")
            }
            Button(onClick = {
                if (stateProgress > 0) {
                    stateProgress -= 0.1f
                }
            }) {
                Text(text = "Disminuir")
            }
        }
    }
}

@Composable
fun MySwitch() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }
    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            checkedThumbColor = Color.Yellow,
            checkedTrackColor = Color.Cyan,
            uncheckedTrackColor = Color.Magenta
        )
    )
}

@Composable
fun MyCheckBox() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }
    Checkbox(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Red,
            uncheckedColor = Color.Black,
            checkmarkColor = Color.Blue
        )
    )
}

@Composable
fun MyCheckBockWithText() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }
    Row(
        Modifier.padding(8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(checked = state, onCheckedChange = { state = !state })
        Spacer(modifier = Modifier.width(2.dp))
        Text(text = "Ejemplo Sencillo")
    }
}

@Composable
fun MyCheckBockWithTextCompleted(checkInfo: CheckInfo) {
    Row(Modifier.padding(8.dp)) {

        Checkbox(checked = checkInfo.selected, onCheckedChange = {
            checkInfo.onCheckedChange(!checkInfo.selected)
        })
        Spacer(modifier = Modifier.width(2.dp))
        Text(
            text = checkInfo.title,
            modifier = Modifier.align(Alignment.CenterVertically)
        )

    }

}

@Composable
fun MyTriStatusCheckBox() {
    var status by rememberSaveable {
        mutableStateOf(ToggleableState.Off)
    }
    TriStateCheckbox(state = status, onClick = {
        status= when(status){
            ToggleableState.On -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })
}

@Composable
fun MyRadioButton() {
    var status by rememberSaveable {
        mutableStateOf("Jose")
    }
    RadioButton(selected = status == "Jose", onClick = { status= "Jose" })
}
