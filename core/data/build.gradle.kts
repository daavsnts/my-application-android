import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies

val libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

plugins {
    id("com.daavsnts.android.library")
}

android {
    namespace = "com.daavsnts.core.data"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:network"))

    val kodeinVersion = libs.findVersion("kodein").get()
    implementation("org.kodein.di:kodein-di:$kodeinVersion")
}