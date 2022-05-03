plugins {
    kotlin("multiplatform")
    id("org.jlleitschuh.gradle.ktlint") version "10.2.1"
}

kotlin {
    jvm()
    ios()
}
