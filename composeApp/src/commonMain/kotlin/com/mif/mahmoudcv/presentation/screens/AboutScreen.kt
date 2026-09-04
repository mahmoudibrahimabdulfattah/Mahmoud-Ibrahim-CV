package com.mif.mahmoudcv.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mif.mahmoudcv.data.CvDataProvider
import com.mif.mahmoudcv.data.Strings
import com.mif.mahmoudcv.presentation.components.BioSection
import com.mif.mahmoudcv.presentation.components.CardContainer
import com.mif.mahmoudcv.presentation.components.ClosingContactSection
import com.mif.mahmoudcv.presentation.components.LanguagesSection
import com.mif.mahmoudcv.presentation.components.ProfileHeader
import com.mif.mahmoudcv.presentation.components.SettingsBottomSheet
import com.mif.mahmoudcv.presentation.components.SettingsButton
import com.mif.mahmoudcv.presentation.components.SocialLinksSection

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    val profileInfo = CvDataProvider.getLocalizedProfileInfo()
    val scrollState = rememberScrollState()
    var showSettings by remember { mutableStateOf(false) }

    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp, bottom = 100.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = Strings.navAbout(),
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.weight(1f)
                )
                SettingsButton(onClick = { showSettings = true })
            }
            Spacer(modifier = Modifier.height(14.dp))
            ProfileHeader(profileInfo = profileInfo)
            Spacer(modifier = Modifier.height(24.dp))
            SocialLinksSection(profileInfo = profileInfo)
            Spacer(modifier = Modifier.height(28.dp))
            CardContainer {
                BioSection(bio = profileInfo.bio)
            }
            Spacer(modifier = Modifier.height(20.dp))
            LanguagesSection(languages = profileInfo.languages)
            Spacer(modifier = Modifier.height(28.dp))
            ClosingContactSection(profileInfo = profileInfo)
        }

        if (showSettings) {
            SettingsBottomSheet(onDismiss = { showSettings = false })
        }
    }
}
