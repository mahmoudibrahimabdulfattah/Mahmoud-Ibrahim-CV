package com.mif.mahmoudcv.presentation.components

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mif.mahmoudcv.data.Strings
import com.mif.mahmoudcv.domain.model.Project
import com.mif.mahmoudcv.domain.model.ProjectPlatform
import com.mif.mahmoudcv.theme.AppColors
import mahmoudibrahimcv.composeapp.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProjectCard(
    project: Project,
    modifier: Modifier = Modifier,
    showDivider: Boolean = true,
    descriptionMaxLines: Int = 3,
    titleWeight: FontWeight = FontWeight.SemiBold,
    artSize: Dp = 56.dp,
    topPadding: Dp = 18.dp,
    horizontalPadding: Dp = 12.dp
) {
    val uriHandler = LocalUriHandler.current

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clickable(enabled = project.url != null) {
                project.url?.let(uriHandler::openUri)
            }
            .padding(horizontal = horizontalPadding)
            .padding(top = topPadding)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top
        ) {
            ProjectArt(project = project, size = artSize)
            Spacer(modifier = Modifier.width(14.dp))
            Column(modifier = Modifier.weight(1f)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = project.name,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontWeight = titleWeight,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    ProjectDestinationLabel(project = project)
                }

                Spacer(modifier = Modifier.size(6.dp))
                Text(
                    text = project.description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 22.sp,
                    maxLines = descriptionMaxLines,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.size(10.dp))
                ProjectTechnologyChips(technologies = project.technologies)
            }
        }
        if (showDivider) {
            Spacer(modifier = Modifier.size(18.dp))
            HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
        }
    }
}

@Composable
fun FeaturedProjectCard(project: Project, modifier: Modifier = Modifier) {
    // Featured status is structural, not promotional. The distinction is one tonal step
    // off the canvas plus a firmer edge -- the two devices the design system sanctions
    // before elevation -- against plain rows that stay on the bare background. No pill,
    // no stripe, no gradient, no promotional colour.
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 12.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(12.dp))
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        ProjectCard(
            project = project,
            showDivider = false,
            descriptionMaxLines = 5,
            titleWeight = FontWeight.Bold,
            artSize = 64.dp,
            topPadding = 10.dp,
            horizontalPadding = 0.dp
        )
    }
}

@Composable
private fun ProjectArt(project: Project, size: Dp) {
    val art: DrawableResource? = projectDrawable(project.name)
    if (art != null) {
        Image(
            painter = painterResource(art),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(size)
                .clip(RoundedCornerShape(14.dp))
        )
    } else {
        Box(
            modifier = Modifier
                .size(size)
                .clip(RoundedCornerShape(14.dp))
                .background(Color(0xFF245B78)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "DC",
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = (size.value * 0.32f).sp
            )
        }
    }
}

private fun projectDrawable(projectName: String): DrawableResource? = when (projectName) {
    "WeightWatchers" -> Res.drawable.project_weightwatchers
    "SGS Super App" -> Res.drawable.project_sgs_super_app
    "News Shorts" -> Res.drawable.project_news_shorts
    "Smart Mentor" -> Res.drawable.project_smart_mentor
    "WE Attend" -> Res.drawable.project_we_attend
    "WE HR" -> Res.drawable.project_we_hr
    "Interactive CV" -> Res.drawable.project_interactive_cv
    "Mystery Shopper" -> Res.drawable.project_mystery_shopper
    "Data Cleansing" -> null
    else -> null
}

@Composable
private fun ProjectDestinationLabel(project: Project) {
    val destination = when (project.platform) {
        ProjectPlatform.PLAY_STORE -> Strings.destinationPlayStore()
        ProjectPlatform.GITHUB -> Strings.destinationGithub()
        ProjectPlatform.INTERNAL -> Strings.destinationInternal()
    }
    // No external-link glyph beside the name. The website needs one because a link inside
    // a page has to advertise that it leaves; a whole card that is itself the tap target
    // does not. `OpenInNew` also renders as an illegible slashed square at 13dp once the
    // auto-mirrored RTL variant kicks in, so it was reading as a broken image.
    Text(
        text = destination,
        style = MaterialTheme.typography.labelSmall,
        color = AppColors.signal,
        fontWeight = FontWeight.Medium,
        maxLines = 1
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ProjectTechnologyChips(technologies: List<String>) {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        technologies.forEach { tech ->
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(99.dp))
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.outlineVariant,
                        shape = RoundedCornerShape(99.dp)
                    )
                    .padding(horizontal = 10.dp, vertical = 5.dp)
            ) {
                Text(
                    text = tech,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1
                )
            }
        }
    }
}
