package com.example.coursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout



@Composable
fun ConstraintExample() {
    ConstraintLayout (modifier = Modifier.fillMaxSize()){

        val(boxRed,boxBlue,boxYellow,boxGray,boxGreen, boxMagenta, boxBlack)=createRefs()

        Box (modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
                bottom.linkTo(parent.bottom)
            }){

        }
        Box (modifier = Modifier
            .size(125.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                bottom.linkTo(boxRed.top)
                start.linkTo(boxRed.end)
            }){

        }
        Box (modifier = Modifier
            .size(125.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                bottom.linkTo(boxRed.top)
                end.linkTo(boxRed.start)
            }){

        }
        Box (modifier = Modifier
            .size(125.dp)
            .background(Color.Gray)
            .constrainAs(boxGray) {
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            }){

        }
        Box (modifier = Modifier
            .size(125.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                top.linkTo(boxRed.bottom)
                end.linkTo(boxRed.start)
            }){

        }

        Box (modifier = Modifier.size(125.dp).background(Color.Magenta).constrainAs(boxMagenta){
            top.linkTo(boxGreen.bottom)
            end.linkTo(boxGray.start)
        }){

        }
        Box (modifier = Modifier.size(125.dp).background(Color.Black).constrainAs(boxBlack){
            bottom.linkTo(boxBlue.top)
            start.linkTo(boxBlue.end)
        }){

        }
    }
}