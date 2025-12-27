package com.mif.mahmoudcv.data

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.russhwolf.settings.Settings

enum class AppLanguage(val code: String, val displayName: String) {
    ENGLISH("en", "English"),
    ARABIC("ar", "عربي");

    companion object {
        fun fromCode(code: String): AppLanguage {
            return entries.find { it.code == code } ?: ENGLISH
        }
    }
}

class SettingsManager private constructor() {

    private val settings: Settings = Settings()

    var currentLanguage: AppLanguage by mutableStateOf(loadLanguage())
        private set

    var isDarkTheme: Boolean by mutableStateOf(loadTheme())
        private set

    private fun loadLanguage(): AppLanguage {
        val code: String = settings.getString(KEY_LANGUAGE, AppLanguage.ENGLISH.code)
        return AppLanguage.fromCode(code)
    }

    private fun loadTheme(): Boolean {
        return settings.getBoolean(KEY_DARK_THEME, true)
    }

    fun updateLanguage(language: AppLanguage) {
        currentLanguage = language
        settings.putString(KEY_LANGUAGE, language.code)
    }

    fun updateTheme(isDark: Boolean) {
        isDarkTheme = isDark
        settings.putBoolean(KEY_DARK_THEME, isDark)
    }

    fun toggleTheme() {
        updateTheme(!isDarkTheme)
    }

    fun isArabic(): Boolean = currentLanguage == AppLanguage.ARABIC

    companion object {
        private const val KEY_LANGUAGE: String = "app_language"
        private const val KEY_DARK_THEME: String = "is_dark_theme"

        private val INSTANCE: SettingsManager by lazy { SettingsManager() }

        fun getInstance(): SettingsManager = INSTANCE
    }
}

val LocalSettingsManager = compositionLocalOf<SettingsManager> {
    error("SettingsManager not provided")
}

