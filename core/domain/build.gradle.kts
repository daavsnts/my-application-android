import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies

val libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

plugins {
    id("org.jetbrains.kotlin.jvm")
}

group = "com.daavsnts.core.domain"
version = "1.0"

dependencies {
    val kodeinVersion = libs.findVersion("kodein").get()
    implementation("org.kodein.di:kodein-di:$kodeinVersion")
}