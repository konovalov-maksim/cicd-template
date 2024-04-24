import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.9.23"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    id("org.springframework.boot").version("3.2.4")
    id("io.spring.dependency-management").version("1.1.4")
//    id("org.jetbrains.kotlin.plugin.spring").version("1.9.23")
}

dependencies {
    // Spring
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")

    // Test
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.9.23")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}


