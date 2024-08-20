pluginManagement {
    repositories {
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/snapshot") }
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "ReceiptGenerator"

include("application")
include("configuration")
include("input-boundary")
include("output-boundary")
include("usecase")
include("entities")
include("web")
include("repository")
