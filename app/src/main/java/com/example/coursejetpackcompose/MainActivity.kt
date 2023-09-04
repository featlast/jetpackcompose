package com.example.coursejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import com.example.coursejetpackcompose.ui.theme.CourseJetPackComposeTheme
import com.example.coursejetpackcompose.ui.theme.MyTextFieldAdvanced

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            CourseJetPackComposeTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
//                    MyDropDownMenu()
//                        MyCard()


//                    Greeting("Android")
//                    MyBox()
//                    MyColumn()
//                    MyRow()
//                    MyComplexLayout()
//                    ConstraintExample()
//                    RenderFunction()
//                    MyStateSimple()
//                MyText()
//                    MyTextField()
//                    MyTextFieldAdvanced()
                    //State Hoisting
//                    var myText by remember { mutableStateOf("") }
//                    MyTextFieldOutlined(myText){myText=it}
//                    MyButton()
//                    MyImageAdvance()
//                    MyProgressBar()
//                    MyProgressAdvanced()
//                    MySwitch()
//                    MyCheckBox()

//                    var state by rememberSaveable {
//                        mutableStateOf(false)
//                    }
//                    val checkInfo = CheckInfo(
//                        title = "Ejemplo Completo",
//                        selected = state,
//                        onCheckedChange = { newState -> state = newState }
////                        onCheckedChange ={state={it}}
//                    )
//                    val myOptions = getOptions(listOf("Jose", "Caro", "Toby", "Bruno"))
//                    Column(Modifier.padding(vertical = 30.dp)) {
//                        myOptions.forEach{
//                            option -> MyCheckBockWithTextCompleted(option)
//                    }
//                        myOptions.forEach{
//                            MyCheckBockWithTextCompleted(it)
//                        }

//                        MyCheckBockWithText()
                    }

//                    MyTriStatusCheckBox()
//                    MyRadioButton()
                }
            }
        }
    }


//@Composable
//fun getOptions(titles: List<String>): List<CheckInfo> {
//    return titles.map {
//        var state by rememberSaveable {
//            mutableStateOf(false)
//        }
//        CheckInfo(
//            title = it,
//            selected = state,
//            onCheckedChange = { newState -> state = newState }
////                        onCheckedChange ={state={it}}
//        )
//
//    }
//}




//@Preview(
//    name="Preview",
//    device = Devices.NEXUS_5,
//    apiLevel = 29,
//    showSystemUi = true,
//)
//@Composable
//fun RenderFunction() {
////    ConstraintExample()
//    ConstrainExampleGuide()
//}




