plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.wakey"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.wakey"
        minSdk = 34
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.play.services.maps)
    implementation(libs.places)
    implementation(libs.exifinterface)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Google Map SDK
    implementation("com.google.maps.android:android-maps-utils:2.3.0")

    // Google Places SDK
    implementation("com.google.android.libraries.places:places:3.3.0")

    // Glide 라이브러리
    implementation("com.github.bumptech.glide:glide:4.15.1")
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1")

    // gson 라이브러리
    implementation ("com.google.code.gson:gson:2.9.0")
}