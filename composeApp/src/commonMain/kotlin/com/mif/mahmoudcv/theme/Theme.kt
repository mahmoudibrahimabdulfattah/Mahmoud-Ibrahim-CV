package com.mif.mahmoudcv.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = PrimaryDark,
    onPrimaryContainer = PrimaryLight,
    secondary = Accent,
    onSecondary = DarkBackgroundDarker,
    secondaryContainer = Accent.copy(alpha = 0.15f),
    onSecondaryContainer = Accent,
    tertiary = PrimaryLight,
    onTertiary = DarkBackgroundDarker,
    tertiaryContainer = PrimaryLight.copy(alpha = 0.15f),
    onTertiaryContainer = PrimaryLight,
    background = DarkBackground,
    onBackground = DarkTextPrimary,
    surface = DarkSurface,
    onSurface = DarkTextPrimary,
    surfaceVariant = DarkCardBackground,
    onSurfaceVariant = DarkTextSecondary,
    outline = DarkCardBorder,
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
    primaryContainer = PrimaryLight.copy(alpha = 0.15f),
    onPrimaryContainer = PrimaryDark,
    secondary = Accent,
    onSecondary = LightBackgroundDarker,
    secondaryContainer = Accent.copy(alpha = 0.15f),
    onSecondaryContainer = Accent,
    tertiary = PrimaryLight,
    onTertiary = LightBackgroundDarker,
    tertiaryContainer = PrimaryLight.copy(alpha = 0.1f),
    onTertiaryContainer = PrimaryDark,
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
    inversePrimary = PrimaryLight,
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

