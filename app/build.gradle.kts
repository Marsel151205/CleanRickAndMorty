plugins {

    // Android Application
    id(Plugins.androidApplication)

    // Kotlin Android
    id(Plugins.kotlinAndroid)
}

android {
    namespace = App.nameSpace
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        applicationId = App.nameSpace
        minSdk = Config.minSdk
        targetSdk = Config.compileAndTargetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
}

dependencies {

    // Core
    implementation(Dependencies.Core.core)

    // Junit
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.testJUnit)

    // EspressoCore
    androidTestImplementation(Dependencies.EspressoCore.espressoCore)

    // Presentation
    implementation(project(":presentation"))

    // Data
    implementation(project(":data"))

    // Domain
    implementation(project(":domain"))
}