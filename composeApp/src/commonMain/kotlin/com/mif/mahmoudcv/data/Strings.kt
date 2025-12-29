package com.mif.mahmoudcv.data

import androidx.compose.runtime.Composable

object Strings {

    @Composable
    fun yearsExperience(years: Int): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "$years+ سنوات خبرة"
        } else {
            "$years+ Years Experience"
        }
    }

    @Composable
    fun profileBio(years: Int): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "مهندس برمجيات بخبرة تزيد عن $years سنوات في تطوير وتصميم وصيانة تطبيقات الاندرويد. متمكن من قيادة مشاريع تطوير الهاتف المحمول والتعاون مع فرق متعددة التخصصات وتقديم تطبيقات عالية الأداء وقابلة للتوسع. شغوف بالاستفادة من الأدوات والمنهجيات الحديثة لتحسين أداء التطبيقات وتجربة المستخدم."
        } else {
            "Software Engineer with $years+ years of experience developing, designing, and maintaining Android applications. Skilled in leading mobile development projects, collaborating with cross-functional teams, and delivering high-performance, scalable applications. Passionate about leveraging modern tools and methodologies to enhance app performance and user experience."
        }
    }

    @Composable
    fun downloadCv(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تحميل السيرة الذاتية"
        } else {
            "Download CV"
        }
    }

    // Profile
    @Composable
    fun profileFirstName(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "محمود" else "Mahmoud"
    }

    @Composable
    fun profileLastName(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "ابراهيم" else "Ibrahim"
    }

    @Composable
    fun profileTitle(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مهندس اندرويد أول" else "Sr. Android Engineer"
    }

    @Composable
    fun profileLocation(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "القاهرة، مصر" else "Cairo, Egypt"
    }

    // Languages
    @Composable
    fun langArabic(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "العربية" else "Arabic"
    }

    @Composable
    fun langEnglish(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "الانجليزية" else "English"
    }

    @Composable
    fun levelNative(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "اللغة الأم" else "Native"
    }

    @Composable
    fun levelProfessional(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مستوى احترافي" else "Professional"
    }

    // Experience titles
    @Composable
    fun exp1Title(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مهندس اندرويد أول" else "Senior Android Engineer"
    }

    @Composable
    fun exp1Location(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "عن بعد - نيويورك، الولايات المتحدة" else "Remote - New York, United States"
    }

    @Composable
    fun exp1End(): String {
        return "12/2025"
    }

    @Composable
    fun exp1Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "بناء وصيانة تطبيق WeightWatchers الرسمي للاندرويد المستخدم من قبل الملايين حول العالم."
        } else {
            "Building and maintaining the official WeightWatchers Android app used by millions worldwide."
        }
    }

    @Composable
    fun exp1Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطوير ميزات جديدة وواجهات مستخدم باستخدام Kotlin و Jetpack Compose وهندسة اندرويد الحديثة."
        } else {
            "Shipping new features and UI with Kotlin, Jetpack Compose, and modern Android architecture."
        }
    }

    @Composable
    fun exp1Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "التعاون مع فرق المنتج والتصميم والـ Backend لبناء تجارب تتبع قابلة للتوسع."
        } else {
            "Collaborating with product, design, and backend teams on scalable tracking experiences."
        }
    }

    @Composable
    fun exp1Resp4(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تعزيز الموثوقية وجودة الكود عبر Clean Architecture و MVI/MVVM والاختبار والمراقبة."
        } else {
            "Boosting reliability and code quality via Clean Architecture, MVI/MVVM, testing, and monitoring."
        }
    }

    @Composable
    fun exp2Location(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "عن بعد - دبي، الإمارات" else "Remote - Dubai, UAE"
    }

    @Composable
    fun exp2Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تصميم وتطوير تطبيق SGS Super App مع دمج ميزات المحادثة الذكية عبر Labiba SDK."
        } else {
            "Architected and enhanced SGS Super App, integrating AI conversational features via Labiba SDK."
        }
    }

    @Composable
    fun exp2Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "قيادة تطوير الميزات وتحسين الأداء عبر عدة تطبيقات اندرويد."
        } else {
            "Led feature development and performance optimizations across multiple Android apps."
        }
    }

    @Composable
    fun exp2Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "استخدام هندسة Multi-Module و Kotlin Flow و Retrofit للتعاون السلس عن بعد."
        } else {
            "Utilizing Multi-Module architecture, Kotlin Flow, and Retrofit for seamless remote collaboration."
        }
    }

    @Composable
    fun exp2Resp4(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق Clean Architecture مع أنماط MVVM/MVI لتقليل تكرار الأخطاء."
        } else {
            "Implemented Clean Architecture with MVVM/MVI patterns, reducing bug recurrence."
        }
    }

    @Composable
    fun exp3Location(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "القرية الذكية، مصر" else "Smart Village, Egypt"
    }

    @Composable
    fun exp3End(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "حتى الآن" else "Present"
    }

    @Composable
    fun exp3Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "قيادة تطوير التطبيقات الجديدة ودعم التطبيقات الموجودة."
        } else {
            "Led the development of new applications and supported existing ones."
        }
    }

    @Composable
    fun exp3Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "التعاون مع فرق متعددة التخصصات لضمان تسليم المشاريع في الوقت المحدد."
        } else {
            "Collaborated with cross-functional teams to ensure timely project delivery."
        }
    }

    @Composable
    fun exp3Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "بناء تطبيقات باستخدام Clean Architecture و Kotlin Coroutines و Flow و Compose."
        } else {
            "Build apps where I applied Clean Architecture, Kotlin Coroutines, Flow, and Compose."
        }
    }

    @Composable
    fun exp3Resp4(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "التحسين المستمر للمهارات في Git و Jira وأدوات التطوير الأخرى."
        } else {
            "Continuously improved skills in Git, Jira, and other development tools."
        }
    }

    @Composable
    fun exp3Resp5(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "توجيه المطورين المبتدئين وتقديم الإرشاد التقني."
        } else {
            "Mentor junior developers to provide tech guidance."
        }
    }

    @Composable
    fun exp4Title(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مهندس اندرويد" else "Android Engineer"
    }

    @Composable
    fun exp4Location(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مدينة نصر، القاهرة، مصر" else "Nasr City, Cairo, Egypt"
    }

    @Composable
    fun exp4Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطوير تطبيقات الهاتف المحمول للعملاء."
        } else {
            "Developed mobile applications for customers."
        }
    }

    @Composable
    fun exp4Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "المسؤولية عن إجراء التعديلات على تطبيق Smart Sales."
        } else {
            "Responsible for making changes to the Smart Sales app."
        }
    }

    @Composable
    fun exp4Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "التعاون مع مالكي المنتجات لتحديد المتطلبات وتقديم الحلول."
        } else {
            "Collaborated with product owners to define requirements and deliver solutions."
        }
    }

    @Composable
    fun exp4Resp4(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "دمج تطبيقات الهاتف المحمول مع أنظمة SAP وبناء خدمات ويب باستخدام C# WCF."
        } else {
            "Integrated mobile applications with SAP systems and built web services using C# WCF."
        }
    }

    @Composable
    fun exp5Title(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "متدرب مطور اندرويد" else "Android Developer Intern"
    }

    @Composable
    fun exp5Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطوير تطبيق WE Home (My WE) باستخدام Java و Android SDK و Retrofit2 و Material Design."
        } else {
            "Developed WE Home (My WE) application using Java, Android SDK, Retrofit2, and Material Design."
        }
    }

    @Composable
    fun exp5Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "إعادة بناء تطبيق 3AL-MASHY باستخدام Java و SQLite و list view و Google Maps."
        } else {
            "Re-Built 3AL-MASHY application using Java, SQLite, list view, and Google Maps."
        }
    }

    @Composable
    fun exp5Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "القدرة على العمل مع REST APIs وخدمات Google (Google Maps و Firebase)."
        } else {
            "Able to work with REST APIs and Google Services (Google Maps & Firebase)."
        }
    }

    @Composable
    fun exp5Resp4(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "بناء 3 تطبيقات اندرويد خلال فترة التدريب."
        } else {
            "Built 3 Android apps during the internship."
        }
    }

    // Skill Categories
    @Composable
    fun skillCatLanguages(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "اللغات والأطر البرمجية" else "Languages & Frameworks"
    }

    @Composable
    fun skillCatArchitecture(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "الهندسة المعمارية والأنماط" else "Architecture & Patterns"
    }

    @Composable
    fun skillCatTools(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "الأدوات والمكتبات" else "Tools & Libraries"
    }

    @Composable
    fun skillCatDevops(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "DevOps والاختبار" else "DevOps & Testing"
    }

    @Composable
    fun skillCatCloud(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "السحابة والتكاملات" else "Cloud & Integrations"
    }

    @Composable
    fun skillCatSoft(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "المهارات الشخصية" else "Soft Skills"
    }

    // Projects
    @Composable
    fun proj1Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "التطبيق الرسمي لبرنامج WeightWatchers لإنقاص الوزن، مع أكثر من 10 مليون تحميل وتقييم 4.5 نجمة على Google Play، يساعد الأعضاء على تتبع الطعام والنشاط والماء والوزن."
        } else {
            "Official Android app for the WeightWatchers weight-loss program, with over 10M+ downloads and a 4.5★ rating on Google Play, helping members track food, activity, water, and weight."
        }
    }

    @Composable
    fun proj2Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطوير تطبيق متكامل معزز بالذكاء الاصطناعي لخدمات الأرض السعودية مع ميزات المحادثة."
        } else {
            "Developed an AI-enhanced super app for Saudi Ground Services with conversational features."
        }
    }

    @Composable
    fun proj3Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق اندرويد مخصص لبرنامج المتسوق الخفي في المصرية للاتصالات، يمكّن الوكلاء من زيارة فروع WE بشكل سري وإجراء تقييمات منظمة."
        } else {
            "Custom Android application for Telecom Egypt's Mystery Shopper program, enabling agents to discreetly visit WE branches and conduct structured evaluations."
        }
    }

    @Composable
    fun proj4Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق اندرويد متخصص لفنيي المصرية للاتصالات الميدانيين لتبسيط مسح وتوثيق خزائن وصناديق الشبكة."
        } else {
            "Specialized Android application for Telecom Egypt field technicians to streamline scanning and documenting network cabinets and boxes."
        }
    }

    @Composable
    fun proj5Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق لتبسيط عمليات إدارة الموارد البشرية مع تتبع وإدارة الحضور لموظفي المصرية للاتصالات."
        } else {
            "App to simplify HR management processes, with tracking and managing attendance for Telecom Egypt employees."
        }
    }

    @Composable
    fun proj6Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "يتيح لموظفي TE إدارة خدماتهم بسهولة من خلال الوصول إليها من أجهزتهم."
        } else {
            "Allows TE employees to manage their services easily by accessing them from their devices."
        }
    }

    @Composable
    fun proj7Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق إدارة الإنترنت المحمول مع المعاملات عبر الإنترنت - مدفوعات آمنة وعالية النطاق."
        } else {
            "Mobile internet management app with online transactions—high-scale, secure payments."
        }
    }

    @Composable
    fun proj8Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق الوسائط الرائجة مع تجربة تصفح حديثة مستوحاة من TikTok."
        } else {
            "Trending media app with modern scrolling UX inspired by TikTok."
        }
    }

    @Composable
    fun proj9Desc(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق أخبار مع تجربة تصفح حديثة لاستهلاك الأخبار السريع."
        } else {
            "News app with modern scrolling UX for quick news consumption."
        }
    }

    // Education
    @Composable
    fun eduDegree(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "بكالوريوس علوم الحاسب" else "Bachelor of Computer Science"
    }

    @Composable
    fun eduUniversity(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "جامعة مصر للعلوم والتكنولوجيا" else "Misr University for Science and Technology"
    }

    @Composable
    fun eduLocation(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مدينة السادس من أكتوبر، مصر" else "6th of October City, Egypt"
    }

    @Composable
    fun eduGrade(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "جيد جداً" else "Very Good"
    }

    // Navigation
    @Composable
    fun navAbout(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "نبذة" else "About"
    }

    @Composable
    fun navExperience(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "الخبرة" else "Experience"
    }

    @Composable
    fun navSkills(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "المهارات" else "Skills"
    }

    @Composable
    fun navProjects(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "المشاريع" else "Projects"
    }

    @Composable
    fun navEducation(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "التعليم" else "Education"
    }

    // Settings
    @Composable
    fun settings(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "الإعدادات" else "Settings"
    }

    @Composable
    fun theme(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "المظهر" else "Theme"
    }

    @Composable
    fun language(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "اللغة" else "Language"
    }

    @Composable
    fun themeLight(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "فاتح" else "Light"
    }

    @Composable
    fun themeDark(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "داكن" else "Dark"
    }

    // Job Types
    @Composable
    fun jobFullTime(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "دوام كامل" else "Full-time"
    }

    @Composable
    fun jobPartTime(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "دوام جزئي" else "Part-time"
    }

    @Composable
    fun jobIntern(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "متدرب" else "Intern"
    }

    @Composable
    fun jobContract(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "عقد" else "Contract"
    }

    @Composable
    fun jobFreelance(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "عمل حر" else "Freelance"
    }

    // Project Labels
    @Composable
    fun featured(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مميز" else "Featured"
    }

    @Composable
    fun internalProject(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مشروع داخلي" else "Internal Project"
    }

    // Section Titles
    @Composable
    fun sectionSkills(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "المهارات" else "Skills"
    }

    @Composable
    fun sectionExperience(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "الخبرة العملية" else "Experience"
    }

    @Composable
    fun sectionEducation(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "التعليم" else "Education"
    }

    @Composable
    fun sectionCertificates(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "الشهادات" else "Certificates"
    }

    @Composable
    fun sectionProjects(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "المشاريع" else "Projects"
    }

    @Composable
    fun sectionLanguages(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "اللغات" else "Languages"
    }

    // Education Labels
    @Composable
    fun gpaLabel(gpa: String): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "المعدل التراكمي: $gpa"
        } else {
            "GPA: $gpa"
        }
    }

    @Composable
    fun gradeLabel(grade: String): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "التقدير: $grade"
        } else {
            "Grade: $grade"
        }
    }

    // Common Labels
    @Composable
    fun present(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "حتى الآن" else "Present"
    }

    // Social Links
    @Composable
    fun linkedIn(): String = "LinkedIn"

    @Composable
    fun github(): String = "GitHub"

    @Composable
    fun email(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "البريد الإلكتروني" else "Email"
    }

    // Skill Levels
    @Composable
    fun skillExpert(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "خبير" else "Expert"
    }

    @Composable
    fun skillAdvanced(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "متقدم" else "Advanced"
    }

    @Composable
    fun skillIntermediate(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "متوسط" else "Intermediate"
    }
}
