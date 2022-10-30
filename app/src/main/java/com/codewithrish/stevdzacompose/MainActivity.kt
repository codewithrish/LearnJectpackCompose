package com.codewithrish.stevdzacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.codewithrish.stevdzacompose.navigation.nav_graph.SetupNavGraph
import com.codewithrish.stevdzacompose.ui.theme.StevdzaComposeTheme


class MainActivity: ComponentActivity() {
    
    lateinit var navController: NavHostController
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaComposeTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}