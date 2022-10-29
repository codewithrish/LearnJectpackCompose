package com.codewithrish.stevdzacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.codewithrish.stevdzacompose.ui.theme.StevdzaComposeTheme


class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaComposeTheme {
                MyComposable()
            }
        }
    }
}

@Composable
fun MyComposable() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by remember {
            mutableStateOf("")
        }

        val maxChar = 10

        OutlinedTextField(
            value = name,
            onValueChange = {
                if (it.length <= maxChar) {
                    name = it
                }
            },
            label = {
                Text(text = "Name")
            },
            placeholder = {
                Text(text = "Enter your name")
            },
            maxLines = 1
        )
    }
}