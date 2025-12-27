package com.mif.mahmoudcv.presentation.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mif.mahmoudcv.presentation.screens.AboutScreen
import com.mif.mahmoudcv.presentation.screens.EducationScreen
import com.mif.mahmoudcv.presentation.screens.ExperienceScreen
import com.mif.mahmoudcv.presentation.screens.ProjectsScreen
import com.mif.mahmoudcv.presentation.screens.SkillsScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.About.route,
        modifier = modifier,
        enterTransition = {
            fadeIn(animationSpec = tween(300)) + slideInHorizontally(
                initialOffsetX = { 30 },
                animationSpec = tween(300)
            )
        },
        exitTransition = {
            fadeOut(animationSpec = tween(300)) + slideOutHorizontally(
                targetOffsetX = { -30 },
                animationSpec = tween(300)
            )
        },
        popEnterTransition = {
            fadeIn(animationSpec = tween(300)) + slideInHorizontally(
                initialOffsetX = { -30 },
                animationSpec = tween(300)
            )
        },
        popExitTransition = {
            fadeOut(animationSpec = tween(300)) + slideOutHorizontally(
                targetOffsetX = { 30 },
                animationSpec = tween(300)
            )
        }
    ) {
        composable(route = Screen.About.route) {
            AboutScreen()
        }
        composable(route = Screen.Experience.route) {
            ExperienceScreen()
        }
        composable(route = Screen.Skills.route) {
            SkillsScreen()
        }
        composable(route = Screen.Projects.route) {
            ProjectsScreen()
        }
        composable(route = Screen.Education.route) {
            EducationScreen()
        }
    }
}


