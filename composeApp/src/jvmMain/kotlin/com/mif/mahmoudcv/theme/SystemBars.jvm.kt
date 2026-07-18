package com.mif.mahmoudcv.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
actual fun SystemBarsEffect(
    statusBarColor: Color,
    navigationBarColor: Color,
    isDarkTheme: Boolean
) {
    // Desktop doesn't have system bars like mobile
}

@Composable
actual fun getNavigationBarHeight(): Int = 0




