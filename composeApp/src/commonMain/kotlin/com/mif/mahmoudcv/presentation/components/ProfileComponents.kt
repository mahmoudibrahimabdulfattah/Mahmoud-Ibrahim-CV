package com.mif.mahmoudcv.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.mif.mahmoudcv.data.Strings
import com.mif.mahmoudcv.domain.model.Language
import com.mif.mahmoudcv.domain.model.ProfileInfo
import com.mif.mahmoudcv.theme.Accent
import com.mif.mahmoudcv.theme.Primary
import com.mif.mahmoudcv.theme.PrimaryLight
import org.jetbrains.compose.resources.painterResource
import mahmoudibrahimcv.composeapp.generated.resources.Res
import mahmoudibrahimcv.composeapp.generated.resources.ic_github

@Composable
fun ProfileHeader(
    profileInfo: ProfileInfo,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(140.dp)
                .shadow(20.dp, CircleShape, spotColor = Primary.copy(alpha = 0.3f))
                .clip(CircleShape)
                .border(
                    width = 4.dp,
                    brush = Brush.horizontalGradient(listOf(Primary, PrimaryLight)),
                    shape = CircleShape
                )
        ) {
            AsyncImage(
                model = profileInfo.profileImageUrl,
                contentDescription = "Profile Picture",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = profileInfo.firstName,
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = profileInfo.lastName,
            style = MaterialTheme.typography.displaySmall,
            color = PrimaryLight,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PrimaryBadge(text = profileInfo.title)
        }
        Spacer(modifier = Modifier.height(8.dp))
        AccentBadge(text = Strings.yearsExperience(profileInfo.yearsOfExperience))
    }
}

@Composable
fun ContactInfoSection(
    profileInfo: ProfileInfo,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        ContactInfoItem(
            icon = Icons.Outlined.LocationOn,
            text = profileInfo.location
        )
        ContactInfoItem(
            icon = Icons.Outlined.Phone,
            text = profileInfo.phone,
            onClick = { com.mif.mahmoudcv.util.openPhoneDialer(profileInfo.phone) }
        )
        ContactInfoItem(
            icon = Icons.Outlined.Email,
            text = profileInfo.email,
            onClick = { com.mif.mahmoudcv.util.openEmailClient(profileInfo.email) }
        )
    }
}

@Composable
private fun ContactInfoItem(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .then(
                if (onClick != null) Modifier.clickable { onClick() }
                else Modifier
            )
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = PrimaryLight,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            color = if (onClick != null) PrimaryLight else MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Composable
fun BioSection(
    bio: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = bio,
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        lineHeight = 28.sp,
        modifier = modifier
    )
}

@Composable
fun SocialLinksSection(
    profileInfo: ProfileInfo,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SocialIconButton(
            text = "in",
            label = "LinkedIn",
            onClick = { com.mif.mahmoudcv.util.openUrl(profileInfo.linkedInUrl) }
        )
        SocialIconButtonWithDrawable(
            label = "GitHub",
            onClick = { com.mif.mahmoudcv.util.openUrl(profileInfo.githubUrl) }
        )
        SocialIconButton(
            icon = Icons.Default.Email,
            label = "Email",
            onClick = { com.mif.mahmoudcv.util.openEmailClient(profileInfo.email) }
        )
        Spacer(modifier = Modifier.weight(1f))
        DownloadCVButton(
            onClick = { com.mif.mahmoudcv.util.openUrl(profileInfo.cvUrl) }
        )
    }
}

@Composable
private fun SocialIconButton(
    icon: ImageVector? = null,
    text: String? = null,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.size(48.dp),
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.surfaceVariant,
        border = ButtonDefaults.outlinedButtonBorder(enabled = true),
        onClick = onClick
    ) {
        Box(contentAlignment = Alignment.Center) {
            when {
                icon != null -> {
                    Icon(
                        imageVector = icon,
                        contentDescription = label,
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.size(24.dp)
                    )
                }
                text != null -> {
                    Text(
                        text = text,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }
    }
}

@Composable
private fun SocialIconButtonWithDrawable(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.size(48.dp),
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.surfaceVariant,
        border = ButtonDefaults.outlinedButtonBorder(enabled = true),
        onClick = onClick
    ) {
        Box(contentAlignment = Alignment.Center) {
            Icon(
                painter = painterResource(Res.drawable.ic_github),
                contentDescription = label,
                tint = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
private fun DownloadCVButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier.height(48.dp),
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(containerColor = Accent)
    ) {
        Icon(
            imageVector = Icons.Default.Download,
            contentDescription = null,
            modifier = Modifier.size(18.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = Strings.downloadCv(),
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp
        )
    }
}

@Composable
fun LanguagesSection(
    languages: List<Language>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        languages.forEach { language ->
            LanguageBadge(language = language)
        }
    }
}

@Composable
private fun LanguageBadge(
    language: Language,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(8.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "🌐",
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "${language.name} (${language.level})",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

