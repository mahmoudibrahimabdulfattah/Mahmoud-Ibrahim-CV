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
            "مهندس موبايل أول بخبرة تزيد عن $years سنوات في بناء تطبيقات الهاتف الأصلية — اندرويد باستخدام Kotlin و Jetpack Compose، و iOS باستخدام Swift و SwiftUI. متمكن من قيادة مشاريع تطوير الهاتف المحمول والتعاون مع فرق متعددة التخصصات وتقديم تطبيقات عالية الأداء وقابلة للتوسع يستخدمها ملايين المستخدمين."
        } else {
            "Senior Mobile Engineer with $years+ years of experience building native mobile applications — Android with Kotlin & Jetpack Compose, and iOS with Swift & SwiftUI. Skilled in leading mobile development projects, collaborating with cross-functional teams, and delivering high-performance, scalable applications used by millions of users."
        }
    }

    @Composable
    fun marketingHeadline(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "أبني تطبيقات جوال بأداء يعتمد عليه."
        } else {
            "I build production-ready mobile apps."
        }
    }

    @Composable
    fun marketingPromise(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "أحول تصميمات Figma وواجهات API إلى تطبيقات آمنة وقابلة للتوسع وجاهزة للإطلاق على Android و iOS أو باستخدام Kotlin Multiplatform."
        } else {
            "Give me your Figma designs and APIs, and I'll turn them into scalable, secure, production-ready apps for Android, iOS, or Kotlin Multiplatform."
        }
    }

    @Composable
    fun closingContactTitle(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "لديك مشروع تطبيق؟"
        } else {
            "Have a mobile project in mind?"
        }
    }

    @Composable
    fun closingContactBody(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "أرسل التصميمات أو واجهات API أو تفاصيل المنتج الحالي، وسأوضح لك كيف أبني الحل المناسب."
        } else {
            "Send the designs, APIs, or current product context. I'll tell you how I'd approach the build."
        }
    }

    @Composable
    fun proofYears(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "خبرة عملية احترافية" else "Professional experience"
    }

    @Composable
    fun proofPlatforms(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "تسليم عبر المنصات" else "Cross-platform delivery"
    }

    @Composable
    fun proofDownloads(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "WeightWatchers على Google Play" else "WeightWatchers on Google Play"
    }

    @Composable
    fun proofApps(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "وصلت إلى الإنتاج" else "Shipped to production"
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
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "خليل" else "I. Khalil"
    }

    @Composable
    fun profileTitle(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مهندس برمجيات أول لتطبيقات الجوال — Android · iOS · KMP" else "Senior Mobile Engineer — Android · iOS · KMP"
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
    fun exp0Title(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مهندس برمجيات أول لتطبيقات Android و iOS" else "Senior Mobile Engineer (Android & iOS)"
    }

    @Composable
    fun exp0Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "انتقلت إلى فريق iOS في مايو 2026 بعد ست سنوات في Android، وأبني ميزات أصلية باستخدام Swift و SwiftUI."
        } else {
            "Moved to the iOS team in May 2026 after six years of Android work; build native iOS features in Swift and SwiftUI."
        }
    }

    @Composable
    fun exp0Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "أسلم ميزات على المنصتين باستخدام Android (Kotlin, Jetpack Compose) و iOS (Swift, SwiftUI)."
        } else {
            "Ship features on both platforms: Kotlin and Jetpack Compose on Android, Swift and SwiftUI on iOS."
        }
    }

    @Composable
    fun exp0Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "أحافظ على اتساق البنية بين قاعدتي الكود باستخدام Clean Architecture و MVVM/MVI."
        } else {
            "Keep architecture consistent across both codebases with Clean Architecture and MVVM/MVI."
        }
    }

    @Composable
    fun exp0Resp4(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "أنسق مع فرق المنتج و backend وضمان الجودة لتوحيد الميزات والإصدارات على Android و iOS."
        } else {
            "Coordinate with product, backend, and QA to align features and releases across Android and iOS."
        }
    }

    @Composable
    fun exp1Title(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مهندس Android أول" else "Senior Android Engineer"
    }

    @Composable
    fun exp2Title(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مهندس Android أول — دوام جزئي" else "Senior Android Engineer (Part-time)"
    }

    @Composable
    fun exp1Location(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "عن بعد · نيويورك، الولايات المتحدة" else "Remote · New York, USA"
    }

    @Composable
    fun exp1End(): String {
        return "05/2026"
    }

    @Composable
    fun exp1Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "طورت وحافظت على تطبيق WeightWatchers الرسمي، وهو منتج استهلاكي يتجاوز 10M+ تنزيل ويستخدمه الملايين حول العالم."
        } else {
            "Built and maintained the official WeightWatchers app, a consumer product with 10M+ downloads used by millions worldwide."
        }
    }

    @Composable
    fun exp1Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "أطلقت ميزات ومسارات واجهة جديدة باستخدام Kotlin و Jetpack Compose لتجربة تتبع الطعام والنشاط."
        } else {
            "Shipped new features and UI flows in Kotlin and Jetpack Compose for the food and activity tracking experience."
        }
    }

    @Composable
    fun exp1Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تعاونت مع فرق المنتج والتصميم و backend على خدمات تتبع قابلة للتوسع."
        } else {
            "Collaborated with product, design, and backend teams on scalable food and activity tracking."
        }
    }

    @Composable
    fun exp1Resp4(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "عملت ضمن Clean Architecture و MVI/MVVM، وأضفت اختبارات وحدات وواجهات ساهمت في خفض معدل الأعطال."
        } else {
            "Worked within Clean Architecture and MVI/MVVM, adding unit and UI tests that brought the crash rate down."
        }
    }

    @Composable
    fun exp2Location(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "عن بعد · دبي، الإمارات" else "Remote · Dubai, UAE"
    }

    @Composable
    fun exp2Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "صممت بنية SGS Super App ودمجت ميزات ذكاء اصطناعي محادثية عبر Labiba SDK."
        } else {
            "Architected the SGS Super App and integrated conversational AI features through the Labiba SDK."
        }
    }

    @Composable
    fun exp2Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "قدت تحسينات الأداء ودمج مكتبات خارجية في عدة تطبيقات Android."
        } else {
            "Led performance optimizations and third-party SDK integrations across multiple Android apps."
        }
    }

    @Composable
    fun exp2Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "طبقت Clean Architecture متعددة الوحدات باستخدام Kotlin Flow، مما خفض تكرار الأخطاء بنسبة 25%."
        } else {
            "Applied multi-module Clean Architecture with Kotlin Flow, reducing bug recurrence by 25%."
        }
    }

    @Composable
    fun exp3Location(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "القرية الذكية" else "Smart Village, Egypt"
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
            "قدت تطوير أكثر من 5 تطبيقات Android داخلية تخدم أكثر من 2,000 موظف في العمليات الميدانية والموارد البشرية."
        } else {
            "Led development of 5+ internal Android apps serving 2,000+ employees across field operations and HR."
        }
    }

    @Composable
    fun exp3Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تعاونت مع فرق المنتج و backend وضمان الجودة، مع الحفاظ على إكمال أكثر من 95% من كل sprint."
        } else {
            "Collaborated with cross-functional teams across product, backend, and QA, maintaining 95%+ sprint completion."
        }
    }

    @Composable
    fun exp3Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "صممت Clean Architecture متعددة الوحدات وقابلة للتوسع، مما أتاح تسليم الميزات أسرع بنسبة 30%."
        } else {
            "Architected scalable multi-module Clean Architecture, enabling 30% faster feature delivery."
        }
    }

    @Composable
    fun exp3Resp4(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "رفعت تغطية الاختبارات وخفضت جهد الاختبار اليدوي بنسبة 25%."
        } else {
            "Increased test coverage and reduced manual testing effort by 25%."
        }
    }

    @Composable
    fun exp4Title(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مهندس Android" else "Android Engineer"
    }

    @Composable
    fun exp4Location(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مدينة نصر" else "Nasr City, Egypt"
    }

    @Composable
    fun exp4Resp1(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "أطلقت أكثر من 3 تطبيقات Android من الفكرة إلى الإنتاج."
        } else {
            "Shipped 3+ Android apps from concept to production."
        }
    }

    @Composable
    fun exp4Resp2(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "توليت تطبيق Smart Sales من البداية إلى النهاية، وعالجت أخطاء حرجة وحسنت رضا المستخدمين."
        } else {
            "Owned the Smart Sales app end to end, resolving critical bugs and improving user satisfaction."
        }
    }

    @Composable
    fun exp4Resp3(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "ربطت التطبيقات بأنظمة SAP عبر C# WCF لمزامنة البيانات لحظيا بين المنصات."
        } else {
            "Integrated apps with SAP systems through C# WCF for real-time cross-platform data sync."
        }
    }

    @Composable
    fun exp5Title(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "متدرب مطور Android" else "Android Developer Intern"
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
    fun projWeightWatchers(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق لتتبع الطعام والنشاط والوزن، يستخدمه ملايين الأشخاص حول العالم."
        } else {
            "Food, activity, and weight tracking used by millions worldwide."
        }
    }

    @Composable
    fun projSgsSuperApp(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "خدمة ذاتية للموظفين مدعومة بالذكاء الاصطناعي لصالح Saudi Ground Services."
        } else {
            "AI-enhanced employee self-service for Saudi Ground Services."
        }
    }

    @Composable
    fun projNewsShorts(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تطبيق أخبار مبني باستخدام Kotlin Multiplatform، بتصفح عمودي وبنية offline-first."
        } else {
            "Kotlin Multiplatform news app with TikTok-style vertical browsing and offline-first architecture."
        }
    }

    @Composable
    fun projSmartMentor(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "منصة إرشاد تشمل محادثات فورية وجلسات فيديو وحجز المواعيد."
        } else {
            "Mentorship platform with real-time chat, video sessions, and session booking."
        }
    }

    @Composable
    fun projWeAttend(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "إدارة حضور لأكثر من 2,000 موظف في Telecom Egypt."
        } else {
            "Attendance management for 2,000+ Telecom Egypt employees."
        }
    }

    @Composable
    fun projWeHr(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "بوابة خدمة ذاتية لطلبات الموارد البشرية وكشوف الرواتب."
        } else {
            "Employee self-service portal for HR requests and payslips."
        }
    }

    @Composable
    fun projInteractiveCv(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "سيرة تفاعلية واحدة عبر أربع منصات باستخدام Compose Multiplatform، مع العربية ودعم RTL."
        } else {
            "One Compose Multiplatform CV across four platforms, with Arabic and RTL."
        }
    }

    @Composable
    fun projMysteryShopper(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "تقييمات منظمة للفروع مع جمع البيانات ومزامنتها دون اتصال."
        } else {
            "Structured branch evaluations with offline-first capture and sync."
        }
    }

    @Composable
    fun projDataCleansing(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) {
            "توثيق ميداني لكبائن الشبكات لفنيي Telecom Egypt."
        } else {
            "Field documentation of network cabinets for Telecom Egypt technicians."
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
    fun featuredProjects(): String {
        val settingsManager = LocalSettingsManager.current
        return if (settingsManager.currentLanguage == AppLanguage.ARABIC) "مشاريع مميزة" else "Featured projects"
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
