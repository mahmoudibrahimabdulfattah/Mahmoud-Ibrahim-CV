package com.mif.mahmoudcv.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.mif.mahmoudcv.data.LocalSettingsManager
import com.mif.mahmoudcv.presentation.navigation.BottomNavBar
import com.mif.mahmoudcv.presentation.navigation.NavGraph
import com.mif.mahmoudcv.theme.Accent
import com.mif.mahmoudcv.theme.Primary

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val settingsManager = LocalSettingsManager.current
    val isDarkTheme: Boolean = settingsManager.isDarkTheme
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Primary.copy(alpha = if (isDarkTheme) 0.12f else 0.06f),
                            Color.Transparent
                        ),
                        center = Offset(0.2f * 1000, 0.3f * 1000),
                        radius = 1000f
                    )
                )
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Accent.copy(alpha = if (isDarkTheme) 0.06f else 0.03f),
                            Color.Transparent
                        ),
                        center = Offset(0.8f * 1000, 0.7f * 1000),
                        radius = 800f
                    )
                )
        )
        Scaffold(
            containerColor = Color.Transparent,
            contentWindowInsets = WindowInsets.systemBars,
            bottomBar = {
                BottomNavBar(navController = navController)
            }
        ) { paddingValues ->
            NavGraph(
                navController = navController,
                modifier = Modifier.padding(paddingValues)
            )
        }
    }
}

