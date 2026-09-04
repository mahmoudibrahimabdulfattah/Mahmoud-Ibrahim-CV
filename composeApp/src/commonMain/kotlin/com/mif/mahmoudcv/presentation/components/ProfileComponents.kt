package com.mif.mahmoudcv.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material.icons.outlined.Devices
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.RocketLaunch
import androidx.compose.material.icons.outlined.WorkHistory
import androidx.compose.material.icons.outlined.Download as DownloadOutlined
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.mif.mahmoudcv.data.Strings
import com.mif.mahmoudcv.domain.model.Language
import com.mif.mahmoudcv.domain.model.ProfileInfo
import com.mif.mahmoudcv.theme.AppColors
import mahmoudibrahimcv.composeapp.generated.resources.Res
import mahmoudibrahimcv.composeapp.generated.resources.ic_github
import mahmoudibrahimcv.composeapp.generated.resources.ic_linkedin
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProfileHeader(
    profileInfo: ProfileInfo,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = profileInfo.profileImageUrl,
                contentDescription = "${profileInfo.firstName} ${profileInfo.lastName}",
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape)
                    .border(2.dp, AppColors.signal, CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "${profileInfo.firstName} ${profileInfo.lastName}",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = profileInfo.title,
                    style = MaterialTheme.typography.bodyMedium,
                    color = AppColors.signal,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = profileInfo.location,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp))
        Text(
            text = Strings.marketingHeadline(),
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            lineHeight = 40.sp
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = Strings.marketingPromise(),
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 26.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        ProofRow(years = profileInfo.yearsOfExperience)
    }
}

@Composable
private fun ProofRow(years: Int) {
    Column(modifier = Modifier.fillMaxWidth()) {
        ProofItem(Icons.Outlined.WorkHistory, ltr("$years+"), Strings.proofYears())
        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
        ProofItem(Icons.Outlined.Devices, ltr("Android\u00A0·\u00A0iOS\u00A0·\u00A0KMP"), Strings.proofPlatforms())
        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
        ProofItem(Icons.Outlined.DownloadOutlined, ltr("10M+"), Strings.proofDownloads())
        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
        ProofItem(Icons.Outlined.RocketLaunch, ltr("7+"), Strings.proofApps())
    }
}

/**
 * Wraps a Latin run in a left-to-right isolate so the bidi algorithm resolves it
 * as one unit. Without this, a trailing `+` on "6+" is a neutral character that
 * takes the surrounding RTL direction and renders as "+6" -- a different claim.
 * This is the Unicode equivalent of the `<bdi dir="ltr">` the website uses.
 */
private fun ltr(value: String): String = "\u2066$value\u2069"

@Composable
private fun ProofItem(icon: ImageVector, value: String, label: String) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = AppColors.signal,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(14.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = value,
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
fun BioSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = Strings.aboutHeading(),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight.Bold,
            lineHeight = 26.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = Strings.aboutBody(),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 24.sp
        )
    }
}

@Composable
fun DeliveryPathSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = Strings.processHeading(),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = Strings.processLede(),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 22.sp
        )
        Spacer(modifier = Modifier.height(18.dp))
        DeliveryStep(1, Strings.processStep1Title(), Strings.processStep1Body())
        Spacer(modifier = Modifier.height(18.dp))
        DeliveryStep(2, Strings.processStep2Title(), Strings.processStep2Body())
        Spacer(modifier = Modifier.height(18.dp))
        DeliveryStep(3, Strings.processStep3Title(), Strings.processStep3Body())
    }
}

@Composable
private fun DeliveryStep(ordinal: Int, title: String, body: String) {
    Row(modifier = Modifier.fillMaxWidth()) {
        // The ordinal is the content here -- the order of the three steps is the
        // point of the section -- so it is drawn, not decorative. A bordered
        // circle keeps it flat rather than adding a filled badge.
        Box(
            modifier = Modifier
                .size(28.dp)
                .border(1.dp, AppColors.signal, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = ordinal.toString(),
                style = MaterialTheme.typography.labelMedium,
                color = AppColors.signal,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.width(14.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = body,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 20.sp
            )
        }
    }
}

@Composable
fun SocialLinksSection(
    profileInfo: ProfileInfo,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = { com.mif.mahmoudcv.util.openEmailClient(profileInfo.email) },
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(Icons.Default.Email, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text(Strings.email(), fontWeight = FontWeight.SemiBold)
            }
            OutlinedButton(
                onClick = { com.mif.mahmoudcv.util.openUrl(profileInfo.linkedInUrl) },
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.ic_linkedin),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(Strings.linkedIn(), fontWeight = FontWeight.SemiBold)
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialIconButtonWithDrawable(
                painter = rememberVectorPainter(Icons.Outlined.Phone),
                label = Strings.callLabel(),
                onClick = { com.mif.mahmoudcv.util.openPhoneDialer(profileInfo.phone) }
            )
            SocialIconButtonWithDrawable(
                painter = painterResource(Res.drawable.ic_github),
                label = Strings.github(),
                onClick = { com.mif.mahmoudcv.util.openUrl(profileInfo.githubUrl) }
            )
            DownloadCVButton(
                onClick = { com.mif.mahmoudcv.util.openUrl(profileInfo.cvUrl) },
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ClosingContactSection(
    profileInfo: ProfileInfo,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(1.dp, MaterialTheme.colorScheme.outlineVariant, RoundedCornerShape(12.dp))
            .padding(20.dp)
    ) {
        Text(
            text = Strings.closingContactTitle(),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = Strings.closingContactBody(),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = { com.mif.mahmoudcv.util.openEmailClient(profileInfo.email) },
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(Icons.Default.Email, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text(Strings.email(), fontWeight = FontWeight.SemiBold)
            }
            OutlinedButton(
                onClick = { com.mif.mahmoudcv.util.openUrl(profileInfo.linkedInUrl) },
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.ic_linkedin),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(Strings.linkedIn(), fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Composable
private fun SocialIconButtonWithDrawable(
    painter: Painter,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.size(48.dp),
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colorScheme.surface,
        border = ButtonDefaults.outlinedButtonBorder(enabled = true),
        onClick = onClick
    ) {
        Box(contentAlignment = Alignment.Center) {
            Icon(
                painter = painter,
                contentDescription = label,
                tint = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.size(22.dp)
            )
        }
    }
}

@Composable
private fun DownloadCVButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier.height(48.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Icon(Icons.Default.Download, contentDescription = null, modifier = Modifier.size(18.dp))
        Spacer(modifier = Modifier.width(8.dp))
        Text(Strings.downloadCv(), fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
    }
}

@Composable
fun LanguagesSection(
    languages: List<Language>,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = Strings.sectionLanguages(),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            languages.forEach { language ->
                LanguageBadge(language = language, modifier = Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun LanguageBadge(language: Language, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(horizontal = 10.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.Language,
            contentDescription = null,
            tint = AppColors.signal,
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "${language.name} · ${language.level}",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            maxLines = 1
        )
    }
}
