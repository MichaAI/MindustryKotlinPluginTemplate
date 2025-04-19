buildscript {
    repositories {
        mavenCentral()
    }

    extra.apply {
        set("mindustryVersion", "v146")
        set("kotlinVersion", "2.0.20")
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${project.extra["kotlinVersion"]}")
    }
}

plugins {
    kotlin("jvm") version "2.0.20"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    maven { url = uri("https://raw.githubusercontent.com/Zelaux/MindustryRepo/master/repository") }
    maven { url = uri("https://www.jitpack.io") }
}

dependencies {
    compileOnly("com.github.Anuken.Arc:arc-core:${project.extra["mindustryVersion"]}")
    compileOnly("com.github.Anuken.Mindustry:core:${project.extra["mindustryVersion"]}")
    compileOnly("com.github.anuken.mindustry:server:${project.extra["mindustryVersion"]}")
}

tasks.shadowJar {
    configurations = listOf(project.configurations.runtimeClasspath.get())
}
