package com.mif.mahmoudcv.presentation.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
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
import com.mif.mahmoudcv.presentation.components.SectionTitle
import com.mif.mahmoudcv.presentation.components.SkillCategoryCard

@Composable
fun SkillsScreen(
    modifier: Modifier = Modifier
) {
    val skillCategories = CvDataProvider.getLocalizedSkillCategories()
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        contentPadding = PaddingValues(top = 24.dp, bottom = 100.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            SectionTitle(
                title = Strings.sectionSkills(),
                icon = Icons.Default.Code
            )
        }
        itemsIndexed(
            items = skillCategories,
            key = { _, category -> category.id }
        ) { index, category ->
            var isVisible: Boolean by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                isVisible = true
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(animationSpec = tween(400, delayMillis = index * 80)) +
                        slideInHorizontally(
                            initialOffsetX = { if (index % 2 == 0) -50 else 50 },
                            animationSpec = tween(400, delayMillis = index * 80)
                        )
            ) {
                SkillCategoryCard(skillCategory = category)
            }
        }
    }
}

