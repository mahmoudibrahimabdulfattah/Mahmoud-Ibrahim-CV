package com.mif.mahmoudcv.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Shop
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mif.mahmoudcv.data.Strings
import com.mif.mahmoudcv.domain.model.Project
import com.mif.mahmoudcv.domain.model.ProjectPlatform
import com.mif.mahmoudcv.theme.Primary
import com.mif.mahmoudcv.theme.PrimaryLight

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ProjectCard(
    project: Project,
    modifier: Modifier = Modifier
) {
    val uriHandler = LocalUriHandler.current
    val cardBackground: Brush = if (project.isFeatured) {
        Brush.linearGradient(
            colors = listOf(
                Primary.copy(alpha = 0.1f),
                MaterialTheme.colorScheme.surfaceVariant
            )
        )
    } else {
        Brush.linearGradient(
            colors = listOf(
                MaterialTheme.colorScheme.surfaceVariant,
                MaterialTheme.colorScheme.surfaceVariant
            )
        )
    }
    val borderColor: Color = if (project.isFeatured) {
        Primary.copy(alpha = 0.3f)
    } else {
        MaterialTheme.colorScheme.outline
    }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(brush = cardBackground)
            .border(1.dp, borderColor, RoundedCornerShape(16.dp))
            .clickable(enabled = project.url != null) {
                project.url?.let { uriHandler.openUri(it) }
            }
            .padding(20.dp)
    ) {
        if (project.isFeatured) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .offset(y = (-20).dp)
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Primary, PrimaryLight)
                        )
                    )
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = project.name,
                    style = MaterialTheme.typography.titleMedium,
                    color = if (project.url != null) PrimaryLight else MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                when {
                    project.isFeatured -> ProjectBadge(text = Strings.featured().uppercase(), isFeatured = true)
                    project.isInternal -> ProjectBadge(text = Strings.internalProject().uppercase(), isFeatured = false)
                }
                Icon(
                    imageVector = when (project.platform) {
                        ProjectPlatform.PLAY_STORE -> Icons.Default.Shop
                        ProjectPlatform.GITHUB -> Icons.Default.Code
                        ProjectPlatform.INTERNAL -> Icons.Default.Business
                    },
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                    modifier = Modifier.size(20.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = project.description,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 22.sp,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(16.dp))
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            project.technologies.forEach { tech ->
                ProjectTechChip(text = tech)
            }
        }
    }
}

@Composable
private fun ProjectBadge(
    text: String,
    isFeatured: Boolean,
    modifier: Modifier = Modifier
) {
    val backgroundColor: Brush = if (isFeatured) {
        Brush.horizontalGradient(listOf(Primary, PrimaryLight))
    } else {
        Brush.horizontalGradient(
            listOf(
                MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.2f),
                MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.2f)
            )
        )
    }
    val textColor: Color = if (isFeatured) Color.White else MaterialTheme.colorScheme.onSurfaceVariant
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(brush = backgroundColor)
            .padding(horizontal = 10.dp, vertical = 4.dp)
    ) {
        Text(
            text = text,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            color = textColor,
            letterSpacing = 0.5.sp
        )
    }
}

@Composable
private fun ProjectTechChip(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.1f))
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = text,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
        )
    }
}

@Composable
fun FeaturedProjectCard(
    project: Project,
    modifier: Modifier = Modifier
) {
    ProjectCard(
        project = project,
        modifier = modifier
    )
}

