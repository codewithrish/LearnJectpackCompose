package com.codewithrish.stevdzacompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaComposeTheme {

                val sections = listOf("A", "B", "C", "D", "E", "F", "G")

                LazyColumn(
                    contentPadding = PaddingValues(all = 12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    sections.forEach { section ->
                        stickyHeader {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.LightGray)
                                    .padding(12.dp),
                                text = "Section $section"
                            )
                        }
                        items(10) {
                            Text(
                                modifier = Modifier.padding(12.dp),
                                text = "Item $it from the section $section"
                            )
                        }
                    }
                }
//                val personRepository = PersonRepository()
//                val getAllData = personRepository.getAllData()
//
//                LazyColumn(
//                    contentPadding = PaddingValues(all = 12.dp),
//                    verticalArrangement = Arrangement.spacedBy(12.dp)
//                ) {
////                    items(items = getAllData) { person ->
////                        CustomItem(person = person)
////                    }
//                    itemsIndexed(
//                        items = getAllData,
//                        key = { _, person ->
//                            person.id
//                        }
//                    ) { index, person ->
//                        Log.d("MainActivity", index.toString())
//                        CustomItem(person = person)
//                    }
//                }
            }
        }
    }
}