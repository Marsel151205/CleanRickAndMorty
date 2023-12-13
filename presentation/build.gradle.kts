plugins {

    // Android Library
    id(Plugins.androidLibrary)

    // Kotlin Android
    id(Plugins.kotlinAndroid)

    // Kapt
    kotlin(Plugins.kapt)

    // Hilt
    id(Plugins.hilt)
}

android {
    namespace = Presentation.nameSpace
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Core
    implementation(Dependencies.Core.core)

    // AppCompat
    implementation(Dependencies.UI.appCompat)

    // MaterialDesign
    implementation(Dependencies.UI.material)

    // JUnit
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.testJUnit)

    // EspressoCore
    androidTestImplementation(Dependencies.EspressoCore.espressoCore)

    // Domain
    implementation(project(":domain"))

    // Hilt
    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.hiltCompiler)

    // Navigation Component
    implementation(Dependencies.NavigationComponent.navigationFragment)
    implementation(Dependencies.NavigationComponent.navigationUI)

    // Paging3
    implementation(Dependencies.Paging.paging3)

    // Glide
    implementation(Dependencies.Glide.glide)

    // ViewBindingPropertyDelegate
    implementation(Dependencies.ViewBinding.viewBindingPropertyDelegate)

    // ViewModel
    implementation(Dependencies.Lifecycle.viewModel)

    // LiveData
    implementation(Dependencies.Lifecycle.liveData)

    // Lifecycle Runtime
    implementation(Dependencies.Lifecycle.lifecycleRuntime)
}

kapt {
    correctErrorTypes = true
}