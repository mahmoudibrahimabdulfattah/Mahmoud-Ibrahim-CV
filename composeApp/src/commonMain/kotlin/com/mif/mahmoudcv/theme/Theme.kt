package com.mif.mahmoudcv.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF84ADFF),
    onPrimary = Color(0xFF00359E),
    primaryContainer = Color(0xFF173B75),
    onPrimaryContainer = Color(0xFFDCE8FF),
    secondary = Color(0xFFC8D1E0),
    onSecondary = DarkBackgroundDarker,
    secondaryContainer = Color(0xFF243249),
    onSecondaryContainer = Color(0xFFF2F4F7),
    tertiary = Color(0xFFB2CCFF),
    onTertiary = DarkBackgroundDarker,
    tertiaryContainer = Color(0xFF1849A9),
    onTertiaryContainer = Color.White,
    background = DarkBackground,
    onBackground = DarkTextPrimary,
    surface = DarkSurface,
    onSurface = DarkTextPrimary,
    surfaceVariant = DarkCardBackground,
    onSurfaceVariant = DarkTextSecondary,
    outline = Color(0xFF3B4D69),
    outlineVariant = DarkCardBorder,
    error = Error,
    onError = Color.White,
    inverseSurface = LightSurface,
    inverseOnSurface = LightTextPrimary,
    inversePrimary = Primary,
    scrim = Color.Black.copy(alpha = 0.3f)
)

private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFEFF4FF),
    onPrimaryContainer = Color(0xFF1849A9),
    secondary = Accent,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFF2F4F7),
    onSecondaryContainer = LightTextSecondary,
    tertiary = Color(0xFF175CD3),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFD1E0FF),
    onTertiaryContainer = Color(0xFF1849A9),
    background = LightBackground,
    onBackground = LightTextPrimary,
    surface = LightSurface,
    onSurface = LightTextPrimary,
    surfaceVariant = LightCardBackground,
    onSurfaceVariant = LightTextSecondary,
    outline = LightCardBorder,
    outlineVariant = LightCardBorder,
    error = Error,
    onError = Color.White,
    inverseSurface = DarkSurface,
    inverseOnSurface = DarkTextPrimary,
    inversePrimary = Color(0xFF84ADFF),
    scrim = Color.Black.copy(alpha = 0.1f)
)

@Composable
fun MahmoudIbrahimTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    // Apply system bars styling based on theme
    // Use surface color for navigation bar to match bottom bar
    SystemBarsEffect(
        statusBarColor = Color.Transparent,
        navigationBarColor = colorScheme.surface,
        isDarkTheme = darkTheme
    )
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
