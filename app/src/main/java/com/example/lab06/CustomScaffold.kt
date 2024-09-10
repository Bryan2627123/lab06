package com.example.lab06

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*

@Composable
fun CustomScaffold(navController: NavController) {
    var clickCount by remember { mutableStateOf(0) }

    Scaffold(
        topBar = { CustomTopBar(navController) },
        bottomBar = { CustomBottomBar(navController) },
        floatingActionButton = {
            CustomFAB(onClick = { clickCount++ })
        },
        content = { padding ->
            CustomContent(padding = padding, clickCount = clickCount)
        }
    )
}
