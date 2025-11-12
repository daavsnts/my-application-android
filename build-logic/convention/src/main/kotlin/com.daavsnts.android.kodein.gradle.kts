import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies

val libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

dependencies {
    "implementation"(libs.findLibrary("kodein.di").get())
    "implementation"(libs.findLibrary("kodein.di.viewmodel").get())
    "implementation"(libs.findLibrary("kodein.di.compose").get())
}