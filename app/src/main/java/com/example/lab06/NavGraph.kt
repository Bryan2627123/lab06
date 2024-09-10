package com.example.lab06

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            CustomScaffold(navController = navController)
        }
        composable("profile") { UserProfile(navController) }
        composable("build") { BuildScreen(navController) }
        composable("menu") { MenuScreen(navController) }
        composable("favorite") { FavoriteScreen(navController) }
        composable("delete") { DeleteScreen(navController) }
    }
}
