package com.mif.mahmoudcv.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Rocket
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Work
import androidx.compose.material.icons.outlined.Code
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Rocket
import androidx.compose.material.icons.outlined.School
import androidx.compose.material.icons.outlined.Work
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.mif.mahmoudcv.data.Strings

sealed class Screen(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
) {
    data object About : Screen(
        route = "about",
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person
    )

    data object Experience : Screen(
        route = "experience",
        selectedIcon = Icons.Filled.Work,
        unselectedIcon = Icons.Outlined.Work
    )

    data object Skills : Screen(
        route = "skills",
        selectedIcon = Icons.Filled.Code,
        unselectedIcon = Icons.Outlined.Code
    )

    data object Projects : Screen(
        route = "projects",
        selectedIcon = Icons.Filled.Rocket,
        unselectedIcon = Icons.Outlined.Rocket
    )

    data object Education : Screen(
        route = "education",
        selectedIcon = Icons.Filled.School,
        unselectedIcon = Icons.Outlined.School
    )

    companion object {
        val bottomNavItems: List<Screen> = listOf(About, Experience, Skills, Projects, Education)
    }
}

@Composable
fun Screen.getLocalizedTitle(): String {
    return when (this) {
        Screen.About -> Strings.navAbout()
        Screen.Experience -> Strings.navExperience()
        Screen.Skills -> Strings.navSkills()
        Screen.Projects -> Strings.navProjects()
        Screen.Education -> Strings.navEducation()
    }
}
