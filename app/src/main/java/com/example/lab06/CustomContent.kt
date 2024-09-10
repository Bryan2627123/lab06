package com.example.lab06

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomContent(padding: PaddingValues, clickCount: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .padding(16.dp),
    ) {
        Text(text = "My app content")

        Text(
            text = "Has presionado el botón $clickCount veces",
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}
