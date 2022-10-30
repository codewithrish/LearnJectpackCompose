package com.codewithrish.stevdzacompose.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codewithrish.stevdzacompose.navigation.AUTHENTICATION_ROUTE
import com.codewithrish.stevdzacompose.navigation.Screen
import com.codewithrish.stevdzacompose.screens.LoginScreen
import com.codewithrish.stevdzacompose.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}