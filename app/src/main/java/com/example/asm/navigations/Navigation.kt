package com.example.asm.navigations

import SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm.screens.LoginScreen
import com.example.asm.screens.RegisterScreen

@Composable
fun NavigationApp (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "SplashScreen") {
        composable("SplashScreen") { SplashScreen(onNavigateToLogin ={navController.navigate("LoginScreen")}) }
        composable("LoginScreen") { LoginScreen(onNavigateToRegister ={navController.navigate("Register")}) }
        composable("Register") { RegisterScreen()}
    }

}
