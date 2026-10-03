# Compose Multiplatform ProGuard Rules - Optimized for Startup Performance

# Enable R8 full mode for better optimization
-allowaccessmodification
-repackageclasses

# Optimization passes
-optimizationpasses 5
-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*

# Keep Compose - minimal rules
-keep class androidx.compose.runtime.** { *; }
-keep class androidx.compose.ui.** { *; }

# Keep Kotlin Metadata for reflection
-keepattributes RuntimeVisibleAnnotations,AnnotationDefault
-keep class kotlin.Metadata { *; }
-dontwarn kotlin.**

# Keep Kotlin Coroutines - minimal
-keepclassmembers class kotlinx.coroutines.** {
    volatile <fields>;
}
-dontwarn kotlinx.coroutines.**

# Keep Multiplatform Settings
-keep class com.russhwolf.settings.Settings { *; }
-dontwarn com.russhwolf.settings.**

# Keep Navigation
-keep class * extends androidx.navigation.Navigator { *; }
-dontwarn androidx.navigation.**

# Keep Coil - minimal for image loading
-keep class coil3.ImageLoader { *; }
-keep class coil3.request.ImageRequest { *; }
-dontwarn coil3.**

# Keep Ktor - minimal
-keep class io.ktor.** { *; }
-dontwarn io.ktor.**

# Keep your app entry points
-keep class com.mif.mahmoudcv.MainActivity { *; }
-keep class com.mif.mahmoudcv.App* { *; }

# Keep data classes for serialization
-keepclassmembers class com.mif.mahmoudcv.domain.model.** {
    <fields>;
    <init>(...);
}
-keepclassmembers class com.mif.mahmoudcv.data.** {
    <fields>;
    <init>(...);
}

# Remove logging in release - aggressive
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** i(...);
    public static *** w(...);
}

# Remove Kotlin assertions
-assumenosideeffects class kotlin.jvm.internal.Intrinsics {
    public static void checkNotNull(...);
    public static void checkNotNullParameter(...);
    public static void checkNotNullExpressionValue(...);
}

# Keep enum values
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# App Startup
-keep class androidx.startup.** { *; }
-keep class * extends androidx.startup.Initializer { *; }

# ProfileInstaller
-keep class androidx.profileinstaller.** { *; }

