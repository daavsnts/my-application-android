plugins {
    id("com.daavsnts.android.application")
    id("com.daavsnts.android.kodein")
}

dependencies {
    implementation(project(":features:pokedex"))
    implementation(project(":core:network"))
    implementation(project(":core:data"))
    implementation(project(":core:domain"))

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}