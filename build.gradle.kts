import java.net.URI

buildscript {
    repositories {
        mavenCentral()
    }

    extra.apply {
        set("mindustryVersion", "v158.1")
        set("kotlinVersion", "2.2.0")
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${project.extra["kotlinVersion"]}")
    }
}

plugins {
    kotlin("jvm") version "2.2.0"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
    ivy{
        url = URI("https://github.com/")
        patternLayout{ artifact("/[organisation]/[module]/releases/download/[revision]/dependencies.jar")}
        metadataSources{ artifact() }
    }

    //If the version is set to 'latest', downloads the latest Mindustry *release* as a dependency
    ivy{
        url = URI("https://github.com/")
        patternLayout{artifact("/[organisation]/[module]/releases/[revision]/download/dependencies.jar")}
        metadataSources{ artifact() }
    }

    //For depending on the absolute newest commit for Mindustry
    ivy{
        url = URI("https://github.com/")
        patternLayout{artifact("/[organisation]/[module]/releases/download/master/[revision].jar")}
        metadataSources{ artifact() }
    }
}

java{
    targetCompatibility = JavaVersion.VERSION_17
    sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly("Anuken:Mindustry:${project.extra["mindustryVersion"]}")
}

tasks.shadowJar {
    configurations = listOf(project.configurations.runtimeClasspath.get())
}
