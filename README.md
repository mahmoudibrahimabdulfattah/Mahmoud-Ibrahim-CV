# 📱 Interactive CV — Compose Multiplatform

My CV as a real app: **one Kotlin codebase running natively on Android, iOS, Desktop (JVM), and Web (Wasm + JS)**.

Built by [Mahmoud I. Khalil](https://www.linkedin.com/in/mahmoudibrahimabdulfattah/) — Senior Mobile Engineer (Android & iOS).

## ✨ Features

- **6 targets, one codebase** — Android, iOS, Desktop (JVM), Web (WasmJS + JS)
- **Full Arabic localization with RTL** — live language switching flips the entire layout direction at runtime
- **Dark / Light theme** — persisted with `multiplatform-settings` across all platforms
- **Adaptive UI** — bottom navigation on mobile, adapted layouts on desktop/web
- **Zero server** — all CV data is local; images loaded with Coil 3 + Ktor

## 🖼️ Screenshots

| Android | iOS | Desktop | Web |
|---------|-----|---------|-----|
| _coming soon_ | _coming soon_ | _coming soon_ | _coming soon_ |

## 🏗️ Architecture

```
composeApp/src/commonMain
├── data/          # CV data provider, settings, localized strings
├── domain/model/  # Profile, Experience, Skill, Project models
├── presentation/  # Screens, components, navigation
└── theme/         # Colors, typography, system bars
```

- UI: Compose Multiplatform (Material 3)
- Navigation: `org.jetbrains.androidx.navigation`
- State/lifecycle: `lifecycle-viewmodel-compose` + `lifecycle-runtime-compose`
- Images: Coil 3 with Ktor engines per platform
- Persistence: `multiplatform-settings`
- Dates: `kotlinx-datetime` (dynamic years-of-experience calculation)

## 🚀 Run It

### Android
```shell
./gradlew :composeApp:assembleDebug
```

### Desktop (JVM)
```shell
./gradlew :composeApp:run
```

### Web (Wasm — modern browsers)
```shell
./gradlew :composeApp:wasmJsBrowserDevelopmentRun
```

### Web (JS — compatibility)
```shell
./gradlew :composeApp:jsBrowserDevelopmentRun
```

### iOS
Open [/iosApp](./iosApp) in Xcode and run, or use the KMP plugin run configuration in Android Studio.

## 🔗 Links

- 🌐 [Portfolio website](https://mahmoudibrahimabdulfattah.github.io/)
- 💼 [LinkedIn](https://www.linkedin.com/in/mahmoudibrahimabdulfattah/)
- 📧 mahmoudibrahimabdulfattah@gmail.com
