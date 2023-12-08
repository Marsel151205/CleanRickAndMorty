// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.androidApplication) version Version.androidApplication apply false
    id(Plugins.kotlinAndroid) version Version.kotlinAndroid apply false
    id(Plugins.androidLibrary) version Version.androidLibrary apply false
    id(Plugins.kotlinJvm) version Version.kotlinJvm apply false
}