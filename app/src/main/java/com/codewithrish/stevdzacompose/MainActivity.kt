package com.codewithrish.stevdzacompose

import android.media.session.PlaybackState.CustomAction
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
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
                    CustomText()
                }
            }
        }
    }
}

@Composable
fun CustomText() {
    SelectionContainer {
        Column {
            Text(text = "Hello Rishabh!")
            DisableSelection {
                Text(text = "Hello Rishabh!")
                Text(text = "Hello Rishabh!")
            }
            Text(text = "Hello Rishabh!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StevdzaComposeTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            CustomText()
        }
    }
}