package com.mif.mahmoudcv.presentation.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mif.mahmoudcv.data.CvDataProvider
import com.mif.mahmoudcv.presentation.components.BioSection
import com.mif.mahmoudcv.presentation.components.CardContainer
import com.mif.mahmoudcv.presentation.components.ContactInfoSection
import com.mif.mahmoudcv.presentation.components.LanguagesSection
import com.mif.mahmoudcv.presentation.components.ProfileHeader
import com.mif.mahmoudcv.presentation.components.SettingsBottomSheet
import com.mif.mahmoudcv.presentation.components.SettingsButton
import com.mif.mahmoudcv.presentation.components.SocialLinksSection

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {
    val profileInfo = CvDataProvider.getLocalizedProfileInfo()
    val scrollState = rememberScrollState()
    var isVisible: Boolean by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        isVisible = true
    }
    var showSettings: Boolean by remember { mutableStateOf(false) }
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(horizontal = 20.dp)
                .padding(top = 24.dp, bottom = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(400)) + scaleIn(
                    initialScale = 0.8f,
                    animationSpec = tween(400)
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.TopEnd
                ) {
                    SettingsButton(onClick = { showSettings = true })
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(600)) + slideInVertically(
                    initialOffsetY = { -40 },
                    animationSpec = tween(600)
                )
            ) {
                ProfileHeader(profileInfo = profileInfo)
            }
            Spacer(modifier = Modifier.height(32.dp))
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(600, delayMillis = 150)) + slideInVertically(
                    initialOffsetY = { 40 },
                    animationSpec = tween(600, delayMillis = 150)
                )
            ) {
                CardContainer {
                    ContactInfoSection(profileInfo = profileInfo)
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(600, delayMillis = 300)) + slideInVertically(
                    initialOffsetY = { 40 },
                    animationSpec = tween(600, delayMillis = 300)
                )
            ) {
                CardContainer {
                    BioSection(bio = profileInfo.bio)
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(600, delayMillis = 450)) + slideInVertically(
                    initialOffsetY = { 40 },
                    animationSpec = tween(600, delayMillis = 450)
                )
            ) {
                SocialLinksSection(profileInfo = profileInfo)
            }
            Spacer(modifier = Modifier.height(24.dp))
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(600, delayMillis = 600)) + slideInVertically(
                    initialOffsetY = { 40 },
                    animationSpec = tween(600, delayMillis = 600)
                )
            ) {
                LanguagesSection(languages = profileInfo.languages)
            }
        }
        if (showSettings) {
            SettingsBottomSheet(onDismiss = { showSettings = false })
        }
    }
}

