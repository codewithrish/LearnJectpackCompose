package com.codewithrish.stevdzacompose.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"
const val AUTHENTICATION_ROUTE = "authentication"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen?id={id}&name={name}") {
        fun passNameAndId(
            id: Int = 0,
            name: String = "Rishabh Kumar"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}
