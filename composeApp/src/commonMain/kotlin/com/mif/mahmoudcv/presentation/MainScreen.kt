package com.mif.mahmoudcv.presentation

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.mif.mahmoudcv.presentation.navigation.AppNavigationRail
import com.mif.mahmoudcv.presentation.navigation.BottomNavBar
import com.mif.mahmoudcv.presentation.navigation.NavGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val useNavigationRail = maxWidth >= 840.dp

        Scaffold(
            containerColor = MaterialTheme.colorScheme.background,
            contentWindowInsets = WindowInsets.systemBars,
            bottomBar = {
                if (!useNavigationRail) {
                    BottomNavBar(navController = navController)
                }
            }
        ) { paddingValues ->
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                if (useNavigationRail) {
                    AppNavigationRail(
                        navController = navController,
                        modifier = Modifier.fillMaxHeight()
                    )
                }
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.TopCenter
                ) {
                    NavGraph(
                        navController = navController,
                        modifier = Modifier
                            .widthIn(max = 1120.dp)
                            .fillMaxWidth()
                            .fillMaxHeight()
                    )
                }
            }
        }
    }
}
