package com.mif.mahmoudcv.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
actual fun SystemBarsEffect(
    statusBarColor: Color,
    navigationBarColor: Color,
    isDarkTheme: Boolean
) {
    // Web doesn't have system bars
}

@Composable
actual fun getNavigationBarHeight(): Int = 0




