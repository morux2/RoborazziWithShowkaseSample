package com.example.roborazziwithshowkasesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import com.example.roborazziwithshowkasesample.ui.MyButton
import com.example.roborazziwithshowkasesample.ui.MyScreenPreview
import com.example.roborazziwithshowkasesample.ui.MyWidget

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(
                windowWidthSize = calculateWindowSizeClass(activity = this).widthSizeClass
            )
        }
    }
}

@Composable
fun MainScreen(windowWidthSize: WindowWidthSizeClass) {
    Column(modifier = Modifier.fillMaxSize()) {
        MyWidget(windowWidthSize = windowWidthSize)
        MyButton()
    }
}

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@MyScreenPreview
@Composable
fun MainScreenPreview() {
    BoxWithConstraints {
        MainScreen(
            windowWidthSize = WindowSizeClass.calculateFromSize(
                size = DpSize(maxWidth, maxHeight)
            ).widthSizeClass
        )
    }
}