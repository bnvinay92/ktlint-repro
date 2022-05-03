buildscript {
    dependencies {
        classpath(libs.kotlin.gradle.plugin)
    }

    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
        // For binary compatibility validator.
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
}

plugins {
   `kotlin-dsl`
    base
}

// See https://stackoverflow.com/questions/25324880/detect-ide-environment-with-gradle
val isRunningFromIde get() = project.properties["android.injected.invoked.from.ide"] == "true"

subprojects {

}
