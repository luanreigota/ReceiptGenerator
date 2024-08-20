

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":configuration"))
    implementation(project(":input-boundary"))
    implementation(project(":output-boundary"))
    implementation(project(":usecase"))
    implementation(project(":entities"))
    implementation(project(":web"))
    implementation(project(":repository"))
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    mainClass.set("com.receiptgenerator.BootApplication.kt")
}