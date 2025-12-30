<p align="center">
  <img src="https://img.icons8.com/color/96/restaurant.png" alt="Flavor Logo"/>
</p>

<h1 align="center">🍽️ Flavor</h1>

<p align="center">
  <strong>A modern Android recipe & food discovery app</strong><br>
  Built with Clean Architecture and Jetpack Compose
</p>

<p align="center">
  <a href="https://github.com/Nikunja-Sharma/Flavor">
    <img src="https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white" alt="Platform"/>
  </a>
  <a href="https://kotlinlang.org">
    <img src="https://img.shields.io/badge/Kotlin-2.0-7F52FF?logo=kotlin&logoColor=white" alt="Kotlin"/>
  </a>
  <a href="https://developer.android.com/jetpack/compose">
    <img src="https://img.shields.io/badge/Jetpack%20Compose-Latest-4285F4?logo=jetpackcompose&logoColor=white" alt="Compose"/>
  </a>
  <a href="https://github.com/Nikunja-Sharma/Flavor/blob/main/LICENSE">
    <img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="License"/>
  </a>
</p>

<p align="center">
  <a href="#-features">Features</a> •
  <a href="#-tech-stack">Tech Stack</a> •
  <a href="#-architecture">Architecture</a> •
  <a href="#-getting-started">Getting Started</a> •
  <a href="#-screenshots">Screenshots</a>
</p>

---

## ✨ Features

<table>
  <tr>
    <td>🔐</td>
    <td><strong>Google Sign-In</strong></td>
    <td>Secure authentication via Firebase</td>
  </tr>
  <tr>
    <td>🍳</td>
    <td><strong>Recipe Discovery</strong></td>
    <td>Browse and discover delicious recipes</td>
  </tr>
  <tr>
    <td>🎨</td>
    <td><strong>Material 3</strong></td>
    <td>Modern UI with dynamic theming</td>
  </tr>
  <tr>
    <td>🏗️</td>
    <td><strong>Clean Architecture</strong></td>
    <td>Scalable & maintainable codebase</td>
  </tr>
  <tr>
    <td>💾</td>
    <td><strong>Offline Support</strong></td>
    <td>Local caching with Room database</td>
  </tr>
  <tr>
    <td>🔄</td>
    <td><strong>Reactive</strong></td>
    <td>Real-time updates with StateFlow</td>
  </tr>
</table>

---

## 🛠️ Tech Stack

<table>
  <tr>
    <th>Category</th>
    <th>Technology</th>
  </tr>
  <tr>
    <td>🔤 Language</td>
    <td><img src="https://img.shields.io/badge/Kotlin-2.0-7F52FF?logo=kotlin&logoColor=white"/></td>
  </tr>
  <tr>
    <td>🎨 UI</td>
    <td><img src="https://img.shields.io/badge/Jetpack%20Compose-Material%203-4285F4?logo=jetpackcompose&logoColor=white"/></td>
  </tr>
  <tr>
    <td>🏛️ Architecture</td>
    <td><img src="https://img.shields.io/badge/Clean%20Architecture-MVVM-green"/></td>
  </tr>
  <tr>
    <td>💉 DI</td>
    <td><img src="https://img.shields.io/badge/Hilt-2.53-orange"/></td>
  </tr>
  <tr>
    <td>🗄️ Database</td>
    <td><img src="https://img.shields.io/badge/Room-2.6-blue"/></td>
  </tr>
  <tr>
    <td>🌐 Network</td>
    <td><img src="https://img.shields.io/badge/Retrofit-2.11-red"/></td>
  </tr>
  <tr>
    <td>🔐 Auth</td>
    <td><img src="https://img.shields.io/badge/Firebase-Auth-FFCA28?logo=firebase&logoColor=black"/></td>
  </tr>
  <tr>
    <td>⚡ Async</td>
    <td><img src="https://img.shields.io/badge/Coroutines-StateFlow-purple"/></td>
  </tr>
  <tr>
    <td>🖼️ Images</td>
    <td><img src="https://img.shields.io/badge/Coil-2.5-teal"/></td>
  </tr>
</table>

---

## 🏗️ Architecture

This app follows **Clean Architecture** with clear separation into three layers:

```
┌─────────────────────────────────────────────────────────────┐
│                        UI Layer                              │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────┐          │
│  │   Screens   │  │  ViewModels │  │    State    │          │
│  └─────────────┘  └─────────────┘  └─────────────┘          │
└─────────────────────────────────────────────────────────────┘
                            │
                            ▼
┌─────────────────────────────────────────────────────────────┐
│                      Domain Layer                            │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────┐          │
│  │   UseCases  │  │   Models    │  │ Repositories│          │
│  └─────────────┘  └─────────────┘  │ (Interfaces)│          │
│                                    └─────────────┘          │
└─────────────────────────────────────────────────────────────┘
                            │
                            ▼
┌─────────────────────────────────────────────────────────────┐
│                       Data Layer                             │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────┐          │
│  │    Remote   │  │    Local    │  │ Repositories│          │
│  │  (Retrofit) │  │   (Room)    │  │   (Impl)    │          │
│  └─────────────┘  └─────────────┘  └─────────────┘          │
└─────────────────────────────────────────────────────────────┘
```

### 📁 Project Structure

```
com.nikunja.flavor
│
├── 📂 data
│   ├── 📂 remote          # API services & DTOs
│   ├── 📂 local           # Room database & DAOs
│   └── 📂 repository      # Repository implementations
│
├── 📂 domain
│   ├── 📂 model           # Business models
│   ├── 📂 repository      # Repository interfaces
│   ├── 📂 usecase         # Business logic
│   └── 📂 util            # Domain utilities
│
├── 📂 ui
│   ├── 📂 navigation      # Compose Navigation
│   ├── 📂 screens         # Feature screens
│   └── 📂 theme           # Material theme
│
├── 📂 di                  # Hilt modules
├── 📄 MainActivity.kt
└── 📄 FlavorApp.kt
```

---

## 🚀 Getting Started

### Prerequisites

- 📱 Android Studio Hedgehog or later
- ☕ JDK 17
- 📦 Android SDK 35

### Firebase Setup

1. Create a project at [Firebase Console](https://console.firebase.google.com)
2. Enable **Google Sign-In** in Authentication
3. Download `google-services.json` → place in `app/`
4. Add SHA-1 fingerprint to Firebase settings

### Installation

```bash
# Clone the repository
git clone https://github.com/Nikunja-Sharma/Flavor.git

# Open in Android Studio
# Sync Gradle files

# Run on device/emulator
./gradlew installDebug
```

---

## 📱 Screens

| Screen | Description |
|:------:|-------------|
| 🔐 **Login** | Google Sign-In authentication |
| 🏠 **Home** | Recipe list with pull-to-refresh |
| 👤 **Profile** | User info and sign-out |

---

## ⚙️ Configuration

### API Base URL

Update in `AppModule.kt`:
```kotlin
.baseUrl("https://your-api.com/")
```

### Google OAuth

Set your client ID in `strings.xml`:
```xml
<string name="default_web_client_id">your-client-id</string>
```

---

## 👨‍💻 Author

<p>
  <a href="https://github.com/Nikunja-Sharma">
    <img src="https://img.shields.io/badge/GitHub-Nikunja--Sharma-181717?logo=github&logoColor=white" alt="GitHub"/>
  </a>
</p>

---

<p align="center">
  Made with ❤️ and Kotlin
</p>
