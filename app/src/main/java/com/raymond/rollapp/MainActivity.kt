package com.raymond.rollapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.raymond.rollapp.navigation.AppNavHost
import com.raymond.rollapp.ui.theme.RollAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RollAPPTheme {
                AppNavHost()
            }
        }
    }
}
