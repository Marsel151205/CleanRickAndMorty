object Version {
    const val androidApplication = "8.1.2"
    const val kotlinAndroid = "1.9.0"
    const val androidLibrary = "8.1.2"
    const val kotlinJvm = "1.9.0"
    const val core = "1.9.0"
    const val appCompat = "1.6.1"
    const val material = "1.10.0"
    const val constraintLayout = "2.1.4"
    const val jUnit = "4.13.2"
    const val extJUnit = "1.1.5"
    const val espressoCore = "3.5.1"
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val androidLibrary = "com.android.library"
    const val kotlinJvm = "org.jetbrains.kotlin.jvm"
    const val javaLibrary = "java-library"
}

object Dependencies {

    object Core {
        const val core = "androidx.core:core-ktx:${Version.core}"
    }

    object UI {
        const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        const val material = "com.google.android.material:material:${Version.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    }

    object Test {
        const val jUnit = "junit:junit:${Version.jUnit}"
        const val testJUnit = "androidx.test.ext:junit:${Version.extJUnit}"
    }

    object EspressoCore {
        const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espressoCore}"
    }
}