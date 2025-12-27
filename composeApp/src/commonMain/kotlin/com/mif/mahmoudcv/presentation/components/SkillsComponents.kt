package com.mif.mahmoudcv.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountTree
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mif.mahmoudcv.domain.model.SkillCategory
import com.mif.mahmoudcv.domain.model.SkillLevel
import com.mif.mahmoudcv.theme.PrimaryLight

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SkillCategoryCard(
    skillCategory: SkillCategory,
    modifier: Modifier = Modifier
) {
    CardContainer(modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Icon(
                imageVector = getSkillCategoryIcon(skillCategory.icon),
                contentDescription = null,
                tint = PrimaryLight,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = skillCategory.name,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.SemiBold
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            skillCategory.skills.forEach { skill ->
                SkillPill(
                    text = skill.name,
                    isExpert = skill.level == SkillLevel.EXPERT,
                    isSoft = skill.level == SkillLevel.SOFT
                )
            }
        }
    }
}

@Composable
private fun getSkillCategoryIcon(iconName: String): ImageVector {
    return when (iconName) {
        "code" -> Icons.Default.Code
        "architecture" -> Icons.Default.AccountTree
        "tools" -> Icons.Default.Build
        "testing" -> Icons.Default.Science
        "cloud" -> Icons.Default.Cloud
        "people" -> Icons.Default.People
        else -> Icons.Default.Star
    }
}

@Composable
fun SkillsOverview(
    skillCategories: List<SkillCategory>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        skillCategories.forEach { category ->
            SkillCategoryCard(skillCategory = category)
        }
    }
}

