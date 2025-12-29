package com.mif.mahmoudcv.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mif.mahmoudcv.theme.Accent
import com.mif.mahmoudcv.theme.DateTextStyle
import com.mif.mahmoudcv.theme.Primary
import com.mif.mahmoudcv.theme.PrimaryLight

@Composable
fun GradientBackground(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    val primaryColor: Color = Primary.copy(alpha = 0.15f)
    val accentColor: Color = Accent.copy(alpha = 0.08f)
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(primaryColor, Color.Transparent),
                    center = Offset(0.2f, 0.3f),
                    radius = 1000f
                )
            )
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(accentColor, Color.Transparent),
                    center = Offset(0.8f, 0.7f),
                    radius = 800f
                )
            ),
        content = content
    )
}

@Composable
fun SectionTitle(
    title: String,
    icon: ImageVector,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = PrimaryLight,
            modifier = Modifier.size(28.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(4.dp))
            Box(
                modifier = Modifier
                    .width(60.dp)
                    .height(4.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Primary, PrimaryLight)
                        )
                    )
            )
        }
    }
}

@Composable
fun PrimaryBadge(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(Primary, PrimaryLight)
                )
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun AccentBadge(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(Accent.copy(alpha = 0.15f))
            .border(1.dp, Accent.copy(alpha = 0.3f), RoundedCornerShape(50))
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Text(
            text = text,
            color = Accent,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun TechChip(
    text: String,
    modifier: Modifier = Modifier,
    isExpert: Boolean = false,
    isSoft: Boolean = false
) {
    val backgroundColor: Brush = when {
        isExpert -> Brush.horizontalGradient(listOf(Primary, PrimaryLight))
        isSoft -> Brush.horizontalGradient(listOf(Accent.copy(alpha = 0.15f), Accent.copy(alpha = 0.1f)))
        else -> Brush.horizontalGradient(listOf(Primary.copy(alpha = 0.1f), Primary.copy(alpha = 0.1f)))
    }
    val textColor: Color = when {
        isExpert -> Color.White
        isSoft -> Accent
        else -> PrimaryLight
    }
    val borderColor: Color = when {
        isExpert -> Color.Transparent
        isSoft -> Accent.copy(alpha = 0.2f)
        else -> Primary.copy(alpha = 0.2f)
    }
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(6.dp))
            .background(brush = backgroundColor)
            .then(
                if (!isExpert) Modifier.border(1.dp, borderColor, RoundedCornerShape(6.dp))
                else Modifier
            )
            .padding(horizontal = 10.dp, vertical = 6.dp)
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun SkillPill(
    text: String,
    modifier: Modifier = Modifier,
    isExpert: Boolean = false,
    isSoft: Boolean = false
) {
    val backgroundColor: Brush = when {
        isExpert -> Brush.horizontalGradient(listOf(Primary, PrimaryLight))
        isSoft -> Brush.horizontalGradient(listOf(Accent.copy(alpha = 0.1f), Accent.copy(alpha = 0.1f)))
        else -> Brush.horizontalGradient(
            listOf(
                MaterialTheme.colorScheme.surfaceVariant,
                MaterialTheme.colorScheme.surfaceVariant
            )
        )
    }
    val textColor: Color = when {
        isExpert -> Color.White
        isSoft -> Accent
        else -> MaterialTheme.colorScheme.onSurfaceVariant
    }
    val borderColor: Color = when {
        isExpert -> Color.Transparent
        isSoft -> Accent.copy(alpha = 0.2f)
        else -> MaterialTheme.colorScheme.outline
    }
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(brush = backgroundColor)
            .then(
                if (!isExpert) Modifier.border(1.dp, borderColor, RoundedCornerShape(50))
                else Modifier
            )
            .padding(horizontal = 14.dp, vertical = 8.dp)
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun CardContainer(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    val cardModifier: Modifier = modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(16.dp))
        .background(MaterialTheme.colorScheme.surfaceVariant)
        .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(16.dp))
    if (onClick != null) {
        Surface(
            modifier = cardModifier,
            onClick = onClick,
            color = Color.Transparent
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                content = content
            )
        }
    } else {
        Column(
            modifier = cardModifier.padding(20.dp),
            content = content
        )
    }
}

@Composable
fun LocationTag(
    location: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "📍",
            fontSize = 12.sp
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = location,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
        )
    }
}

@Composable
fun DateBadge(
    date: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = date,
        style = DateTextStyle,
        color = PrimaryLight,
        modifier = modifier
    )
}

@Composable
fun BulletPoint(
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
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}



