package ru.vld43.cryptocall.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import ru.vld43.cryptocall.presentation.ui.theme.CryptoCallTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoCallTheme {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}