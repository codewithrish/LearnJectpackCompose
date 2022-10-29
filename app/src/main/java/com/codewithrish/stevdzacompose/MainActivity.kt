package com.codewithrish.stevdzacompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import com.codewithrish.stevdzacompose.repository.PersonRepository
import com.codewithrish.stevdzacompose.ui.theme.StevdzaComposeTheme
import com.codewithrish.stevdzacompose.ui.theme.color1
import com.codewithrish.stevdzacompose.ui.theme.color2
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mainViewModel: MainViewModel = hiltViewModel()
            StevdzaComposeTheme {
                val result by mainViewModel.readAll.collectAsState(initial = emptyList())

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (result.isNotEmpty()) {
                        for (person in result) {
                            Text(
                                text = person.name,
                                fontSize = MaterialTheme.typography.h4.fontSize
                            )
                        }
                    } else {
                        Text(
                            text = "Empty Database",
                            fontSize = MaterialTheme.typography.h4.fontSize
                        )
                    }
                }
            }
        }
    }
}