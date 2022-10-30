package com.codewithrish.stevdzacompose.navigation.nav_graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.codewithrish.stevdzacompose.navigation.DETAIL_ARGUMENT_KEY
import com.codewithrish.stevdzacompose.navigation.DETAIL_ARGUMENT_KEY2
import com.codewithrish.stevdzacompose.navigation.HOME_ROUTE
import com.codewithrish.stevdzacompose.navigation.Screen
import com.codewithrish.stevdzacompose.screens.DetailScreen
import com.codewithrish.stevdzacompose.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.Home.route,
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(

                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                    defaultValue = "Rishabh Kumar"
                },
            )
        ) {
            DetailScreen(navController)
        }
    }
}