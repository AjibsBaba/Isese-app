package com.ajibsbaba.isese

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ajibsbaba.isese.ui.theme.IseseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IseseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IseseTheme {
                IseseApp()
            }
        }
    }
}

