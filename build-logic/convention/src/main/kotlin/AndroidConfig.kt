import org.gradle.api.JavaVersion

object AndroidConfig {
    const val compileSdk = 36
    const val minSdk = 24
    const val targetSdk = 36
    val javaVersion = JavaVersion.VERSION_11
    const val jvmTarget = "11"
}