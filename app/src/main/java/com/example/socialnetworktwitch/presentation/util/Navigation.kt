package com.example.socialnetworktwitch.presentation.util

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.socialnetworktwitch.presentation.login.LoginScreen
import com.example.socialnetworktwitch.presentation.splash.SplashScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
      composable(Screen.SplashScreen.route){
            SplashScreen(navController = navController)
      }
        composable(Screen.LoginScreen.route){
            LoginScreen(navController = navController)
        }
    }
}