import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "2.0.0"
    kotlin("plugin.serialization") version "2.0.0"
    id("io.ktor.plugin") version "2.3.12"
    id("maven-publish")
    id("signing")
}

group = "org.example"
version = "0.1.0"

repositories {
    mavenCentral()
}

tasks.named<ShadowJar>("shadowJar") {
    enabled = false
}

kotlin {
    jvmToolchain(22)
}
