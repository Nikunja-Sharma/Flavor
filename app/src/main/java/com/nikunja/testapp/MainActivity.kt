package com.nikunja.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.nikunja.testapp.ui.navigation.NavGraph
import com.nikunja.testapp.ui.theme.FlavorTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlavorTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}
