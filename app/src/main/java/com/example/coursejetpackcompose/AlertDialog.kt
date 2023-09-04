package com.example.coursejetpackcompose

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun MyDialog(show: Boolean, onDismiss: () -> Unit, onConfirm: () -> Unit) {
    if (show) {
        AlertDialog(
            onDismissRequest = {},
            title = { Text(text = "Título") },
            text = { Text(text = "Descripción") },
            confirmButton = {
                TextButton(onClick = { onConfirm() }) {
                    Text(text = "Confirm Button")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text(text = "DismissButton")
                }
            }
        )
    }

}

@Composable
fun MySimpleCustomDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(
            onDismissRequest = { onDismiss() },
            properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        ) {
            Column(
                Modifier
                    .background(Color.DarkGray)
                    .padding(24.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Ejemplo")
                Text(text = "Ejemplo")
                Text(text = "Ejemplo")

            }
        }
    }

}

@Composable
fun CustomDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(onDismissRequest = { onDismiss() }) {
            Column(
                Modifier
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
                    .padding(24.dp)
                    .fillMaxWidth()
                    ) {
                TitleDialog(text = "Set Backup account")
                AccountItem("ejemplo1@gmail.com", R.drawable.userimg )
                AccountItem("ejemplo2@gmail.com", R.drawable.userimg )
                AccountItem("Añadir nueva Cuenta", R.drawable.addimg )

            }
        }
    }
}

@Composable
fun TitleDialog(text: String, modifier:Modifier = Modifier.padding(bottom = 12.dp)) {
    Text(
        text = text,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        modifier = modifier
    )
}

@Composable
fun AccountItem(email:String, @DrawableRes drawable:Int) {
    Row (verticalAlignment = Alignment.CenterVertically){
        Image(painter = painterResource(id = drawable), contentDescription = "avatar",
            modifier = Modifier
                .padding(8.dp)
                .size(40.dp)
                .clip(CircleShape))
        Text(text = email, fontSize = 14.sp, color = Color.Gray, modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun MyConfirmationDialog(show: Boolean, onDismiss: () -> Unit) {
    if(show){
        Dialog(onDismissRequest = {}) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(16.dp))) {
                TitleDialog(text = "Phone ringtone", modifier = Modifier.padding(24.dp))
                Divider(Modifier.fillMaxWidth(), color = Color.LightGray)
                Row (Modifier.align(Alignment.End).padding(8.dp)){
                    TextButton(onClick = {  }) {
                        Text(text = "Cancel")
                    }
                    TextButton(onClick = {  }) {
                        Text(text = "Ok")
                    }
                }

            }
        }

    }
}





