import com.android.build.api.dsl.ApplicationExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.gradle.api.artifacts.VersionCatalogsExtension

val libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.daavsnts.android.compose")
}

apply(plugin = "com.daavsnts.android.base")

extensions.configure<ApplicationExtension>("android") {
    namespace = "com.daavsnts.application"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.daavsnts.application"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = AndroidConfig.javaVersion
        targetCompatibility = AndroidConfig.javaVersion
    }
}

extensions.configure<KotlinAndroidProjectExtension>("kotlin") {
    jvmToolchain(AndroidConfig.jvmTarget.toInt())
}

dependencies {
    "implementation"(libs.findLibrary("androidx.activity.compose").get())
}