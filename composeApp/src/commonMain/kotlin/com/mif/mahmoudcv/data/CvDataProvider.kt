package com.mif.mahmoudcv.data

import androidx.compose.runtime.Composable
import com.mif.mahmoudcv.domain.model.Certificate
import com.mif.mahmoudcv.domain.model.Education
import com.mif.mahmoudcv.domain.model.Experience
import com.mif.mahmoudcv.domain.model.JobType
import com.mif.mahmoudcv.domain.model.Language
import com.mif.mahmoudcv.domain.model.ProfileInfo
import com.mif.mahmoudcv.domain.model.Project
import com.mif.mahmoudcv.domain.model.ProjectPlatform
import com.mif.mahmoudcv.domain.model.Skill
import com.mif.mahmoudcv.domain.model.SkillCategory
import com.mif.mahmoudcv.domain.model.SkillLevel

object CvDataProvider {

    private const val CAREER_START_YEAR: Int = 2020

    fun calculateYearsOfExperience(): Int {
        val currentYear = getCurrentYear()
        return currentYear - CAREER_START_YEAR
    }

    private fun getCurrentYear(): Int {
        // Simple approach - in production you'd use expect/actual for platform-specific implementation
        return 2025
    }

    const val PROFILE_IMAGE_URL: String = "https://raw.githubusercontent.com/mahmoudibrahimabdulfattah/profile-assets/main/profile.jpg"
    private const val LINKEDIN_URL: String = "https://www.linkedin.com/in/mahmoudibrahimabdulfattah/"
    private const val GITHUB_URL: String = "https://github.com/mahmoudibrahimabdulfattah"
    private const val CV_URL: String = "https://drive.google.com/file/d/1ry2IWShhbb-j-YUrfLYUq36GlcHaxijD/view?usp=drive_link"
    private const val PHONE: String = "+20 114 710 4982"
    private const val EMAIL: String = "mahmoudibrahimabdulfattah@gmail.com"

    private const val WEIGHTWATCHERS_URL: String = "https://www.weightwatchers.com/us/"
    private const val WEIGHTWATCHERS_APP_URL: String = "https://play.google.com/store/apps/details?id=com.weightwatchers.mobile"
    private const val ISPACE_URL: String = "https://ispace.com.eg/"
    private const val TELECOM_EGYPT_URL: String = "https://www.te.eg/"
    private const val SPIRIT_URL: String = "https://spirit-co.com/"
    private const val TE_DATA_URL: String = "https://www.linkedin.com/company/te-data/"
    private const val UNIVERSITY_URL: String = "https://www.linkedin.com/school/misr-university-for-science-and-technology/"
    private const val SGS_APP_URL: String = "https://play.google.com/store/apps/details?id=com.ispace.sgs.app"
    private const val WE_ATTEND_URL: String = "https://play.google.com/store/apps/details?id=com.we.weAttend"
    private const val WE_HR_URL: String = "https://play.google.com/store/search?q=WE%20HR&c=apps"
    private const val MY_WE_URL: String = "https://play.google.com/store/apps/details?id=com.ucare.we"
    private const val MOVIE_CATALOG_URL: String = "https://github.com/mahmoudibrahimabdulfattah/MovieCatalogApp"
    private const val NEWS_SHORTS_URL: String = "https://github.com/mahmoudibrahimabdulfattah/NewsShorts"

    @Composable
    fun getLocalizedProfileInfo(): ProfileInfo {
        val years = calculateYearsOfExperience()
        return ProfileInfo(
            firstName = Strings.profileFirstName(),
            lastName = Strings.profileLastName(),
            title = Strings.profileTitle(),
            yearsOfExperience = years,
            location = Strings.profileLocation(),
            phone = PHONE,
            email = EMAIL,
            bio = Strings.profileBio(years),
            profileImageUrl = PROFILE_IMAGE_URL,
            linkedInUrl = LINKEDIN_URL,
            githubUrl = GITHUB_URL,
            cvUrl = CV_URL,
            languages = listOf(
                Language(Strings.langArabic(), Strings.levelNative()),
                Language(Strings.langEnglish(), Strings.levelProfessional())
            )
        )
    }

    @Composable
    fun getLocalizedExperiences(): List<Experience> {
        return listOf(
            Experience(
                id = 1,
                title = Strings.exp1Title(),
                company = "Telecom Egypt (WE)",
                companyUrl = TELECOM_EGYPT_URL,
                location = Strings.exp3Location(),
                jobType = JobType.FULL_TIME,
                startDate = "01/2023",
                endDate = Strings.exp3End(),
                responsibilities = listOf(
                    Strings.exp3Resp1(),
                    Strings.exp3Resp2(),
                    Strings.exp3Resp3(),
                    Strings.exp3Resp4(),
                    Strings.exp3Resp5()
                ),
                technologies = listOf("Kotlin", "Coroutines", "Flow", "Compose", "Firebase")
            ),
            Experience(
                id = 2,
                title = Strings.exp1Title(),
                company = "WeightWatchers",
                companyUrl = WEIGHTWATCHERS_URL,
                location = Strings.exp1Location(),
                jobType = JobType.FULL_TIME,
                startDate = "08/2025",
                endDate = "12/2025",
                responsibilities = listOf(
                    Strings.exp1Resp1(),
                    Strings.exp1Resp2(),
                    Strings.exp1Resp3(),
                    Strings.exp1Resp4()
                ),
                technologies = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "MVI/MVVM", "Testing")
            ),
            Experience(
                id = 3,
                title = Strings.exp1Title(),
                company = "iSpace Technology",
                companyUrl = ISPACE_URL,
                location = Strings.exp2Location(),
                jobType = JobType.PART_TIME,
                startDate = "08/2025",
                endDate = "12/2025",
                responsibilities = listOf(
                    Strings.exp2Resp1(),
                    Strings.exp2Resp2(),
                    Strings.exp2Resp3(),
                    Strings.exp2Resp4()
                ),
                technologies = listOf("Kotlin", "Jetpack Compose", "Clean Architecture", "MVVM/MVI", "AI/ML")
            ),
            Experience(
                id = 4,
                title = Strings.exp4Title(),
                company = "Spirit for Consultancy Services",
                companyUrl = SPIRIT_URL,
                location = Strings.exp4Location(),
                jobType = JobType.FULL_TIME,
                startDate = "12/2021",
                endDate = "01/2023",
                responsibilities = listOf(
                    Strings.exp4Resp1(),
                    Strings.exp4Resp2(),
                    Strings.exp4Resp3(),
                    Strings.exp4Resp4()
                ),
                technologies = listOf("Kotlin", "Flutter", "SAP Integration", "C# WCF")
            ),
            Experience(
                id = 5,
                title = Strings.exp5Title(),
                company = "TE Data",
                companyUrl = TE_DATA_URL,
                location = Strings.exp3Location(),
                jobType = JobType.INTERN,
                startDate = "06/2018",
                endDate = "08/2018",
                responsibilities = listOf(
                    Strings.exp5Resp1(),
                    Strings.exp5Resp2(),
                    Strings.exp5Resp3(),
                    Strings.exp5Resp4()
                ),
                technologies = listOf("Java", "Android SDK", "Retrofit", "Firebase")
            )
        )
    }

    @Composable
    fun getLocalizedSkillCategories(): List<SkillCategory> {
        return listOf(
            SkillCategory(
                id = 1,
                name = Strings.skillCatLanguages(),
                icon = "code",
                skills = listOf(
                    Skill("Kotlin", SkillLevel.EXPERT),
                    Skill("Java"),
                    Skill("Jetpack Compose"),
                    Skill("Swift (iOS)"),
                    Skill("KMP (Kotlin Multiplatform)")
                )
            ),
            SkillCategory(
                id = 2,
                name = Strings.skillCatArchitecture(),
                icon = "architecture",
                skills = listOf(
                    Skill("Clean Architecture"),
                    Skill("MVI"),
                    Skill("MVVM"),
                    Skill("SOLID"),
                    Skill("Design Patterns"),
                    Skill("Multi-Module"),
                    Skill("Hilt/Dagger/Koin")
                )
            ),
            SkillCategory(
                id = 3,
                name = Strings.skillCatTools(),
                icon = "tools",
                skills = listOf(
                    Skill("Coroutines"),
                    Skill("Flow"),
                    Skill("RxJava"),
                    Skill("ROOM"),
                    Skill("Retrofit"),
                    Skill("Glide"),
                    Skill("Firebase"),
                    Skill("Google Maps"),
                    Skill("JUnit"),
                    Skill("Espresso"),
                    Skill("Android Studio"),
                    Skill("Git/GitHub")
                )
            ),
            SkillCategory(
                id = 4,
                name = Strings.skillCatDevops(),
                icon = "testing",
                skills = listOf(
                    Skill("Unit Testing"),
                    Skill("UI Testing"),
                    Skill("CI/CD"),
                    Skill("Performance Tuning"),
                    Skill("Crashlytics"),
                    Skill("Agile/Scrum"),
                    Skill("Jira")
                )
            ),
            SkillCategory(
                id = 5,
                name = Strings.skillCatCloud(),
                icon = "cloud",
                skills = listOf(
                    Skill("REST APIs"),
                    Skill("JSON"),
                    Skill("SAP WCF"),
                    Skill("AI/ML (Labiba SDK)"),
                    Skill("Push Notifications"),
                    Skill("Offline-First")
                )
            ),
            SkillCategory(
                id = 6,
                name = Strings.skillCatSoft(),
                icon = "people",
                skills = listOf(
                    Skill("Team Leadership", SkillLevel.SOFT),
                    Skill("Cross-Functional Collaboration", SkillLevel.SOFT),
                    Skill("Mentoring", SkillLevel.SOFT),
                    Skill("Remote Work", SkillLevel.SOFT)
                )
            )
        )
    }

    @Composable
    fun getLocalizedProjects(): List<Project> {
        return listOf(
            Project(
                id = 1,
                name = "WeightWatchers",
                description = Strings.proj1Desc(),
                url = WEIGHTWATCHERS_APP_URL,
                isFeatured = true,
                platform = ProjectPlatform.PLAY_STORE,
                technologies = listOf("Kotlin", "Jetpack Compose", "Clean Arch", "Multi-module", "Coroutines")
            ),
            Project(
                id = 2,
                name = "SGS Super App",
                description = Strings.proj2Desc(),
                url = SGS_APP_URL,
                isFeatured = true,
                platform = ProjectPlatform.PLAY_STORE,
                technologies = listOf("Kotlin", "Jetpack Compose", "Labiba AI SDK", "Clean Arch", "MVVM")
            ),
            Project(
                id = 3,
                name = "Mystery Shopper",
                description = Strings.proj3Desc(),
                isInternal = true,
                platform = ProjectPlatform.INTERNAL,
                technologies = listOf("Kotlin", "Jetpack Compose", "Clean Arch", "MVI", "ROOM", "Hilt")
            ),
            Project(
                id = 4,
                name = "Data Cleansing",
                description = Strings.proj4Desc(),
                isInternal = true,
                platform = ProjectPlatform.INTERNAL,
                technologies = listOf("Kotlin", "Jetpack Compose", "Clean Arch", "MVI", "ROOM")
            ),
            Project(
                id = 5,
                name = "WE Attend",
                description = Strings.proj5Desc(),
                url = WE_ATTEND_URL,
                platform = ProjectPlatform.PLAY_STORE,
                technologies = listOf("Kotlin", "XML", "MVVM", "Coroutines", "Firebase")
            ),
            Project(
                id = 6,
                name = "WE HR",
                description = Strings.proj6Desc(),
                url = WE_HR_URL,
                platform = ProjectPlatform.PLAY_STORE,
                technologies = listOf("Kotlin", "XML", "MVVM", "Coroutines", "Firebase")
            ),
            Project(
                id = 7,
                name = "My WE",
                description = Strings.proj7Desc(),
                url = MY_WE_URL,
                platform = ProjectPlatform.PLAY_STORE,
                technologies = listOf("Java", "RxJava", "XML")
            ),
            Project(
                id = 8,
                name = "Movie Catalog",
                description = Strings.proj8Desc(),
                url = MOVIE_CATALOG_URL,
                platform = ProjectPlatform.GITHUB,
                technologies = listOf("Kotlin", "Jetpack Compose", "MVI", "Hilt", "Retrofit")
            ),
            Project(
                id = 9,
                name = "News Shorts",
                description = Strings.proj9Desc(),
                url = NEWS_SHORTS_URL,
                platform = ProjectPlatform.GITHUB,
                technologies = listOf("Kotlin", "Jetpack Compose", "MVI", "Glide")
            )
        )
    }

    @Composable
    fun getLocalizedEducation(): Education {
        return Education(
            id = 1,
            degree = Strings.eduDegree(),
            university = Strings.eduUniversity(),
            universityUrl = UNIVERSITY_URL,
            location = Strings.eduLocation(),
            startYear = "2015",
            endYear = "2019",
            gpa = "3.47 / 4.0",
            grade = Strings.eduGrade()
        )
    }

    @Composable
    fun getLocalizedCertificates(): List<Certificate> {
        return listOf(
            Certificate(1, "Master Swift", "LinkedIn"),
            Certificate(2, "iOS 15 and Swift 5", "LinkedIn"),
            Certificate(3, "Advanced Android Kotlin Development Nanodegree", "Udacity"),
            Certificate(4, "Introduction to Software Testing Concepts & Techniques", "ITI"),
            Certificate(5, "Kotlin Programming Language", "Udemy"),
            Certificate(6, "SQL for Statistics Essential Training", "LinkedIn"),
            Certificate(7, "Introduction to Graphic Design: XD", "LinkedIn"),
            Certificate(8, "Android Bootcamp with Kotlin", "IntelliMinds")
        )
    }
}
