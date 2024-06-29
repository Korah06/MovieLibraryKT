package com.korah.movielibrarykt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.korah.movielibrarykt.ui.theme.MovieLibraryKTTheme
import com.korah.movielibrarykt.ui.navigation.DetailScreen
import com.korah.movielibrarykt.ui.navigation.MainScreen
import com.korah.movielibrarykt.ui.views.MovieLibraryKT

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieLibraryKTTheme {
                MovieLibraryKT()
            }
        }
    }
}

