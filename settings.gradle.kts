rootProject.name = "ktlint-repro"

enableFeaturePreview("VERSION_CATALOGS")

pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
    // For binary compatibility validator.
    maven { url = uri("https://kotlin.bintray.com/kotlinx") }
  }
}

plugins {
  id("com.gradle.enterprise") version "3.8.1"
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
  repositories {
    mavenCentral()
    google()
  }
  @Suppress("UnstableApiUsage")
  versionCatalogs {

    create("libs") {
      from(files("./libs.versions.toml"))
    }
  }
}

include(
  ":kmp-producer",
  ":kmp-consumer",
  ":java-consumer",
)
