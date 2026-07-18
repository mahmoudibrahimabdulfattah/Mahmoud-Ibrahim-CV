package com.mif.mahmoudcv.theme

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity

@Composable
actual fun SystemBarsEffect(
    statusBarColor: Color,
    navigationBarColor: Color,
    isDarkTheme: Boolean
) {
    // iOS handles status bar style through Info.plist and UIStatusBarStyle
    // The home indicator area is handled by safe area insets
}

@Composable
actual fun getNavigationBarHeight(): Int {
    val density = LocalDensity.current
    val safeAreaInsets = WindowInsets.safeDrawing
    return with(density) { safeAreaInsets.getBottom(this) }
}




