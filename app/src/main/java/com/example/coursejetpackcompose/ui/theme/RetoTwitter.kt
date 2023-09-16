package com.example.coursejetpackcompose.ui.theme

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursejetpackcompose.R

@Composable
fun RetoTwitter() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(23, 28, 38, 255))
            .padding(vertical = 40.dp, horizontal = 10.dp)

    ) {

        Row() {
            ImageAvatar()
            Spacer(modifier = Modifier.padding(horizontal = 10.dp))
            Column {
                Header()
                Body()
                ImageBody()
            }


        }
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.TopEnd)
                .padding(end = 20.dp)
        ) {
            IconRight()
        }
    }
}

@Composable
fun ImageBody() {
    Box (){
    Image(
        painterResource(id = R.drawable.profile),
        contentDescription = "BodyImage",
        modifier = Modifier.clip(RoundedCornerShape(16.dp)).height(250.dp)
    )

    }
}

@Composable
fun Body() {
    Column(modifier = Modifier.padding(vertical = 10.dp)) {
        repeat(5) {
            Text(
                text = "Description larga sobre texto  kotlin",
                fontSize = 16.sp,
                color = Color.White,
            )

        }
    }
}

@Composable
fun IconRight() {
    Image(
        painterResource(id = R.drawable.ic_dots),
        contentDescription = "dots",
        colorFilter = ColorFilter.tint(Color.White),
        modifier = Modifier.clickable { Log.i("Jose", "PressDots") })
}

@Composable
fun Header() {
    Row() {
        Text(text = "Aris", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text(
            text = "@AristiDevs",
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Text(text = "4h", fontSize = 14.sp, color = Color.White)
    }
}

@Composable
fun ImageAvatar() {
    Box(
        modifier = Modifier
            .size(65.dp)
            .clip(CircleShape)
    ) {
        Image(painterResource(id = R.drawable.profile), contentDescription = "Avatar")
    }
}
