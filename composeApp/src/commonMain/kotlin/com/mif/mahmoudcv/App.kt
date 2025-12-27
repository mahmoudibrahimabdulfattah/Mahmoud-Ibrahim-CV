package com.mif.mahmoudcv

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.LayoutDirection
import com.mif.mahmoudcv.data.AppLanguage
import com.mif.mahmoudcv.data.LocalSettingsManager
import com.mif.mahmoudcv.data.SettingsManager
import com.mif.mahmoudcv.presentation.MainScreen
import com.mif.mahmoudcv.theme.MahmoudIbrahimTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val settingsManager: SettingsManager = remember { SettingsManager.getInstance() }
    val isDarkTheme: Boolean = settingsManager.isDarkTheme
    val currentLanguage: AppLanguage = settingsManager.currentLanguage
    val layoutDirection: LayoutDirection = if (currentLanguage == AppLanguage.ARABIC) {
        LayoutDirection.Rtl
    } else {
        LayoutDirection.Ltr
    }
    CompositionLocalProvider(
        LocalSettingsManager provides settingsManager,
        androidx.compose.ui.platform.LocalLayoutDirection provides layoutDirection
    ) {
        MahmoudIbrahimTheme(darkTheme = isDarkTheme) {
            MainScreen()
        }
    }
}
