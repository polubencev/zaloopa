package com.example.tmoon.navigation

sealed class NavRoutes (val route: String){
    object Home: NavRoutes("home")
    object Register: NavRoutes("registration")
    object Login: NavRoutes("login")
}