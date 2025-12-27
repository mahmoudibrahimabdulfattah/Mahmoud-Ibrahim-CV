package com.mif.mahmoudcv.presentation.components

import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mif.mahmoudcv.data.Strings
import com.mif.mahmoudcv.domain.model.Experience
import com.mif.mahmoudcv.domain.model.JobType
import com.mif.mahmoudcv.theme.Accent
import com.mif.mahmoudcv.theme.DarkTextMuted
import com.mif.mahmoudcv.theme.Primary
import com.mif.mahmoudcv.theme.PrimaryLight

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ExperienceCard(
    experience: Experience,
    modifier: Modifier = Modifier
) {
    val uriHandler = LocalUriHandler.current
    CardContainer(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = experience.title,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(horizontalAlignment = Alignment.End) {
                DateBadge(date = "${experience.startDate} - ${experience.endDate}")
                Spacer(modifier = Modifier.height(6.dp))
                JobTypeBadge(jobType = experience.jobType)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            if (experience.companyUrl != null) {
                Text(
                    text = experience.company,
                    style = MaterialTheme.typography.titleMedium,
                    color = PrimaryLight,
                    textDecoration = TextDecoration.None,
                    modifier = Modifier.clickable {
                        uriHandler.openUri(experience.companyUrl)
                    }
                )
            } else {
                Text(
                    text = experience.company,
                    style = MaterialTheme.typography.titleMedium,
                    color = PrimaryLight
                )
            }
            Text(
                text = "•",
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                fontSize = 10.sp
            )
            Text(
                text = "📍",
                fontSize = 12.sp
            )
            Text(
                text = experience.location,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            experience.responsibilities.forEach { responsibility ->
                ResponsibilityItem(text = responsibility)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            experience.technologies.forEach { tech ->
                TechChip(text = tech)
            }
        }
    }
}

@Composable
private fun JobTypeBadge(
    jobType: JobType,
    modifier: Modifier = Modifier
) {
    val text: String = when (jobType) {
        JobType.FULL_TIME -> Strings.jobFullTime()
        JobType.PART_TIME -> Strings.jobPartTime()
        JobType.INTERN -> Strings.jobIntern()
        JobType.FREELANCE -> Strings.jobFreelance()
    }
    val (backgroundColor, textColor) = when (jobType) {
        JobType.FULL_TIME -> Primary.copy(alpha = 0.15f) to PrimaryLight
        JobType.PART_TIME -> Accent.copy(alpha = 0.15f) to Accent
        JobType.INTERN -> DarkTextMuted.copy(alpha = 0.15f) to DarkTextMuted
        JobType.FREELANCE -> Accent.copy(alpha = 0.15f) to Accent
    }
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(backgroundColor)
            .padding(horizontal = 10.dp, vertical = 4.dp)
    ) {
        Text(
            text = text,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
            color = textColor
        )
    }
}

@Composable
private fun ResponsibilityItem(
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.padding(vertical = 4.dp),
        verticalAlignment = Alignment.Top
    ) {
        Box(
            modifier = Modifier
                .padding(top = 8.dp)
                .size(6.dp)
                .clip(CircleShape)
                .background(PrimaryLight)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 22.sp
        )
    }
}

