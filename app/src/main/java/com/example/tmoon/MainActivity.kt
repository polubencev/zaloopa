package com.example.tmoon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tmoon.navigation.NavRoutes
import com.example.tmoon.screens.Login
import com.example.tmoon.screens.Registration
import com.example.tmoon.ui.theme.TMoonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TMoonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    //color = colorResource(id = R.color.background_color)
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = NavRoutes.Login.route){
                        composable(NavRoutes.Login.route){
                            Login(navController = navController)
                        }
                        composable(NavRoutes.Register.route){
                            Registration(navController = navController)
                        }
                    }

                }
            }
        }
    }
}




