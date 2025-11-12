import org.gradle.api.artifacts.VersionCatalogsExtension
val libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

dependencies {
    "implementation"(libs.findLibrary("androidx.core.ktx").get())
    "implementation"(libs.findLibrary("androidx.lifecycle.runtime.ktx").get())
}