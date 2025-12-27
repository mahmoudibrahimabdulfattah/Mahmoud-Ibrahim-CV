package com.mif.mahmoudcv

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalLayoutDirection
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
    // Use derivedStateOf to avoid unnecessary recompositions
    val layoutDirection: LayoutDirection by remember {
        derivedStateOf {
            if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
                LayoutDirection.Rtl
            } else {
                LayoutDirection.Ltr
            }
        }
    }
    CompositionLocalProvider(
        LocalSettingsManager provides settingsManager,
        LocalLayoutDirection provides layoutDirection
    ) {
        MahmoudIbrahimTheme(darkTheme = settingsManager.isDarkTheme) {
            MainScreen()
        }
    }
}
