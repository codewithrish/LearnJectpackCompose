package com.codewithrish.stevdzacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codewithrish.stevdzacompose.ui.theme.StevdzaComposeTheme
import com.codewithrish.stevdzacompose.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.Blue),
//                .width(100.dp)
//                .height(100.dp)
//                .verticalScroll(rememberScrollState())
        contentAlignment = Alignment.Center

        ) {
            Box(modifier = Modifier.width(50.dp).height(50.dp).background(Color.Green))
            Text(text = "I Love Android", fontSize = 40.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StevdzaComposeTheme {
        Greeting()
    }
}