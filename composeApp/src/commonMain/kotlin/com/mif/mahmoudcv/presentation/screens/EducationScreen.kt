package com.mif.mahmoudcv.presentation.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.WorkspacePremium
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mif.mahmoudcv.data.CvDataProvider
import com.mif.mahmoudcv.data.Strings
import com.mif.mahmoudcv.presentation.components.CertificateCard
import com.mif.mahmoudcv.presentation.components.EducationCard
import com.mif.mahmoudcv.presentation.components.SectionTitle

@Composable
fun EducationScreen(
    modifier: Modifier = Modifier
) {
    val education = CvDataProvider.getLocalizedEducation()
    val certificates = CvDataProvider.getLocalizedCertificates()
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        contentPadding = PaddingValues(top = 24.dp, bottom = 100.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            var isVisible: Boolean by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                isVisible = true
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(500)) + slideInVertically(
                    initialOffsetY = { -30 },
                    animationSpec = tween(500)
                )
            ) {
                SectionTitle(
                    title = Strings.sectionEducation(),
                    icon = Icons.Default.School
                )
            }
        }
        item {
            var isVisible: Boolean by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                isVisible = true
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(500, delayMillis = 100)) +
                        slideInVertically(
                            initialOffsetY = { 40 },
                            animationSpec = tween(500, delayMillis = 100)
                        )
            ) {
                EducationCard(education = education)
            }
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
            var isVisible: Boolean by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                isVisible = true
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(500, delayMillis = 200)) +
                        slideInVertically(
                            initialOffsetY = { -30 },
                            animationSpec = tween(500, delayMillis = 200)
                        )
            ) {
                SectionTitle(
                    title = Strings.sectionCertificates(),
                    icon = Icons.Default.WorkspacePremium
                )
            }
        }
        itemsIndexed(
            items = certificates,
            key = { _, certificate -> certificate.id }
        ) { index, certificate ->
            var isVisible: Boolean by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                isVisible = true
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(300, delayMillis = 300 + index * 50)) +
                        slideInHorizontally(
                            initialOffsetX = { 40 },
                            animationSpec = tween(300, delayMillis = 300 + index * 50)
                        )
            ) {
                CertificateCard(certificate = certificate)
            }
        }
    }
}

