plugins {

    // Android Library
    id(Plugins.androidLibrary)
    // Kotlin Android
    id(Plugins.kotlinAndroid)
}

android {
    namespace = Data.nameSpace
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        minSdk = Config.minSdk

        testInstrumentationRunner = Config.testInstrumentationRunner
        consumerProguardFiles(Config.consumerProguardFiles)
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

    // JUnit
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.testJUnit)

    // EspressoCore
    androidTestImplementation(Dependencies.EspressoCore.espressoCore)

    // Domain
    implementation(project(":domain"))
}