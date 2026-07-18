package com.mif.mahmoudcv.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Platform-specific system bars configuration.
 * Handles status bar and navigation bar colors/styles for each platform.
 */
@Composable
expect fun SystemBarsEffect(
    statusBarColor: Color,
    navigationBarColor: Color,
    isDarkTheme: Boolean
)

/**
 * Returns the navigation bar height for the current platform.
 * Used for proper bottom padding calculations.
 */
@Composable
expect fun getNavigationBarHeight(): Int




