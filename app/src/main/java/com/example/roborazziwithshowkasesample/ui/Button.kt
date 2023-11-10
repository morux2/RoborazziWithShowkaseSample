package com.example.roborazziwithshowkasesample.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MyButton() {
    Button(onClick = {}) {
        Text(text = "Hello")
    }
}

@MyUIPreview
@Composable
fun ButtonPreview() {
    MyButton()
}