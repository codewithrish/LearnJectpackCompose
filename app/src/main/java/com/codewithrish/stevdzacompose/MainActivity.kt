package com.codewithrish.stevdzacompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import com.codewithrish.stevdzacompose.ui.theme.StevdzaComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaComposeTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CoilImage()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalCoilApi::class)
@Composable
fun CoilImage() {
    Box(
        modifier = Modifier
            .width(250.dp)
            .height(250.dp),
        contentAlignment = Alignment.Center
    ){
        val painter = rememberImagePainter(
            data = "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?cs=srgb&dl=pexels-mike-b-170811.jpg&fm=jpg",
            builder = {
                placeholder(R.drawable.placeholder)
                error(R.drawable.ic_error)
                crossfade(1000)
                transformations(
                    GrayscaleTransformation(),
                    // CircleCropTransformation(),
                    BlurTransformation(LocalContext.current),
                    RoundedCornersTransformation(50f)
                )
            }
        )
        val painterState = painter.state
        Image(painter = painter, contentDescription = "Car Image")

//        if (painterState is ImagePainter.State.Loading) {
//            CircularProgressIndicator()
//        }

        // Text(text = "Rishabh", color = Color.White, style = MaterialTheme.typography.h1)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StevdzaComposeTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CoilImage()
        }
    }
}