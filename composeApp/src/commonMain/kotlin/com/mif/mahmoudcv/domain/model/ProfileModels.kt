package com.mif.mahmoudcv.domain.model

data class ProfileInfo(
    val firstName: String,
    val lastName: String,
    val title: String,
    val yearsOfExperience: Int,
    val location: String,
    val phone: String,
    val email: String,
    val bio: String,
    val profileImageUrl: String,
    val linkedInUrl: String,
    val githubUrl: String,
    val cvUrl: String,
    val languages: List<Language>
) {
    val fullName: String get() = "$firstName $lastName"
}

data class Language(
    val name: String,
    val level: String
)

data class Experience(
    val id: Int,
    val title: String,
    val company: String,
    val companyUrl: String?,
    val location: String,
    val jobType: JobType,
    val startDate: String,
    val endDate: String,
    val responsibilities: List<String>,
    val technologies: List<String>
)

enum class JobType {
    FULL_TIME,
    PART_TIME,
    INTERN,
    FREELANCE
}

data class SkillCategory(
    val id: Int,
    val name: String,
    val icon: String,
    val skills: List<Skill>
)

data class Skill(
    val name: String,
    val level: SkillLevel = SkillLevel.NORMAL
)

enum class SkillLevel {
    NORMAL,
    EXPERT,
    SOFT
}

data class Project(
    val id: Int,
    val name: String,
    val description: String,
    val url: String? = null,
    val isFeatured: Boolean = false,
    val isInternal: Boolean = false,
    val platform: ProjectPlatform,
    val technologies: List<String>
)

enum class ProjectPlatform {
    PLAY_STORE,
    GITHUB,
    INTERNAL
}

data class Education(
    val id: Int,
    val degree: String,
    val university: String,
    val universityUrl: String?,
    val location: String,
    val startYear: String,
    val endYear: String,
    val gpa: String,
    val grade: String
)

data class Certificate(
    val id: Int,
    val name: String,
    val issuer: String
)

