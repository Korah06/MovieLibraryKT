package com.korah.movielibrarykt.ui.views

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.korah.movielibrarykt.ui.navigation.DetailScreen
import com.korah.movielibrarykt.ui.navigation.MainScreen

@Composable
fun MovieLibraryKT() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MainScreen) {
        composable<MainScreen> {
            MainScreen(navController)

        }

        composable<DetailScreen> {
            val args = it.toRoute<DetailScreen>()
            DetailScreen(args.id)
        }
    }
}