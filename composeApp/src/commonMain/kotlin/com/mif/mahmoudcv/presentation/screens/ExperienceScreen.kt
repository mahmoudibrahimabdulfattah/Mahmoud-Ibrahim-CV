package com.mif.mahmoudcv.presentation.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Work
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
import com.mif.mahmoudcv.presentation.components.ExperienceCard
import com.mif.mahmoudcv.presentation.components.SectionTitle

@Composable
fun ExperienceScreen(
    modifier: Modifier = Modifier
) {
    val experiences = CvDataProvider.getLocalizedExperiences()
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        contentPadding = PaddingValues(top = 24.dp, bottom = 100.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            SectionTitle(
                title = Strings.sectionExperience(),
                icon = Icons.Default.Work
            )
        }
        itemsIndexed(
            items = experiences,
            key = { _, experience -> experience.id }
        ) { index, experience ->
            var isVisible: Boolean by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                isVisible = true
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(500, delayMillis = index * 100)) +
                        slideInVertically(
                            initialOffsetY = { 50 },
                            animationSpec = tween(500, delayMillis = index * 100)
                        )
            ) {
                ExperienceCard(experience = experience)
            }
        }
    }
}

