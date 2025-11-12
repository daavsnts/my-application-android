plugins {
    id("com.daavsnts.android.application")
    id("com.daavsnts.android.kodein")
}

dependencies {
    implementation(project(":features:pokedex"))

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}