package com.codewithrish.stevdzacompose.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.codewithrish.stevdzacompose.navigation.HOME_ROUTE
import com.codewithrish.stevdzacompose.navigation.ROOT_ROUTE
import com.codewithrish.stevdzacompose.navigation.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}