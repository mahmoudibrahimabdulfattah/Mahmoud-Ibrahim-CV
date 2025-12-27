package com.mif.mahmoudcv.presentation.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Rocket
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
import com.mif.mahmoudcv.presentation.components.ProjectCard
import com.mif.mahmoudcv.presentation.components.SectionTitle

@Composable
fun ProjectsScreen(
    modifier: Modifier = Modifier
) {
    val projects = CvDataProvider.getLocalizedProjects()
    val featuredProjects = projects.filter { it.isFeatured }
    val otherProjects = projects.filter { !it.isFeatured }
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        contentPadding = PaddingValues(top = 24.dp, bottom = 100.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            SectionTitle(
                title = Strings.sectionProjects(),
                icon = Icons.Default.Rocket
            )
        }
        itemsIndexed(
            items = featuredProjects,
            key = { _, project -> "featured_${project.id}" }
        ) { index, project ->
            var isVisible: Boolean by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                isVisible = true
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(500)) +
                        scaleIn(
                            initialScale = 0.95f,
                            animationSpec = tween(500)
                        )
            ) {
                ProjectCard(project = project)
            }
        }
        itemsIndexed(
            items = otherProjects,
            key = { _, project -> "project_${project.id}" }
        ) { index, project ->
            var isVisible: Boolean by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                isVisible = true
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(400, delayMillis = 100 + index * 80)) +
                        slideInVertically(
                            initialOffsetY = { 30 },
                            animationSpec = tween(400, delayMillis = 100 + index * 80)
                        )
            ) {
                ProjectCard(project = project)
            }
        }
    }
}

