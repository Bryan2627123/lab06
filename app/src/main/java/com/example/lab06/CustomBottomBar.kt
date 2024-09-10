package com.example.lab06

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Delete
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CustomBottomBar(navController: NavController) {
    BottomAppBar {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = { navController.navigate("build") }) {
                Icon(Icons.Filled.Build, contentDescription = "Build description")
            }
            IconButton(onClick = { navController.navigate("menu") }) {
                Icon(Icons.Filled.Menu, contentDescription = "Menu description")
            }
            IconButton(onClick = { navController.navigate("favorite") }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Favorite description")
            }
            IconButton(onClick = { navController.navigate("delete") }) {
                Icon(Icons.Filled.Delete, contentDescription = "Delete description")
            }
        }
    }
}
