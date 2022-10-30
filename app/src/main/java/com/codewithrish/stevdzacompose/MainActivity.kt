package com.codewithrish.stevdzacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.codewithrish.stevdzacompose.ui.theme.StevdzaComposeTheme


class MainActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaComposeTheme {
                MainScreen()
            }
        }
    }
}