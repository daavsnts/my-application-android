import com.android.build.api.dsl.CommonExtension
import org.gradle.api.artifacts.VersionCatalogsExtension

val libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

plugins {
    id("org.jetbrains.kotlin.plugin.compose")
}

extensions.configure<CommonExtension<*, *, *, *, *, *>>("android") {
    buildFeatures {
        compose = true
    }
}

dependencies {
    val composeBom = platform(libs.findLibrary("androidx.compose.bom").get())
    "implementation"(composeBom)
    "implementation"(libs.findLibrary("androidx.compose.ui").get())
    "implementation"(libs.findLibrary("androidx.compose.ui.graphics").get())
    "implementation"(libs.findLibrary("androidx.compose.ui.tooling.preview").get())
    "implementation"(libs.findLibrary("androidx.compose.material3").get())
    "implementation"(libs.findLibrary("androidx.activity.compose").get())

    "androidTestImplementation"(composeBom)
    "androidTestImplementation"(libs.findLibrary("androidx.compose.ui.test.junit4").get())
    "debugImplementation"(libs.findLibrary("androidx.compose.ui.tooling").get())
    "debugImplementation"(libs.findLibrary("androidx.compose.ui.test.manifest").get())
}