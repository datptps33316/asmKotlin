package com.example.asm


import SplashScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.asm.navigations.NavigationApp
import com.example.asm.screens.LoginScreen
import com.example.asm.screens.RegisterScreen
import com.example.asm.ui.theme.AsmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AsmTheme {
            NavigationApp()
            }
        }
    }
}

