package com.codewithrish.stevdzacompose

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen?id={id}") { // & for multiple optional arguments
        fun passId(id: Int = 0): String {
            return "detail_screen?id=$id"
        }
    }

    // Optional Arguments



    // object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}")

    // Required Arguments
    /*object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
//        fun passId(id: Int): String {
//            // return "detail_screen/$id"
//            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//        }
        fun passNameAndId(
            id: Int,
            name: String
        ): String {
            return "detail_screen/$id/$name"
        }
    }*/
}
