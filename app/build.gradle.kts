plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.nency.allvideosdownload"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nency.allvideosdownload"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //    implementation("androidx.multidex:multidex:2.0.1")
    implementation("de.hdodenhof:circleimageview:3.1.0")

    implementation("com.intuit.sdp:sdp-android:1.1.0")
//    implementation("com.google.android.exoplayer:exoplayer:2.11.7")
    implementation("com.github.bumptech.glide:glide:4.13.1")
//    implementation("com.github.ybq:Android-SpinKit:1.4.0")

    //bottomnav
    implementation("com.google.android.material:material:1.3.0-alpha03")


    implementation("com.airbnb.android:lottie:5.0.3")
    implementation("com.google.android.material:material:1.5.0-alpha01")
//    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.0.0")

//    implementation("com.github.seventhmoon:GeoIp-android:1.0.0")
    implementation("com.facebook.fresco:fresco:3.0.0") {
//        exclude(group = "com.parse.bolts", module = "bolts-applinks")
//        exclude(module = "bolts-android")
//        exclude(group = "com.parse.bolts", module = "bolts-tasks")
    }

//    implementation("com.facebook.fresco:fresco:2.6.0")
//    implementation("com.facebook.fresco:webpsupport:2.6.0")
    implementation("com.facebook.fresco:animated-webp:2.6.0")
    implementation("com.facebook.fresco:animated-base:2.6.0")

    // Networking
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    implementation("com.squareup.okhttp3:logging-interceptor:4.3.1")
    implementation("com.squareup.okhttp3:okhttp:4.3.1")
    implementation("org.apache.commons:commons-lang3:3.5")
    implementation("commons-io:commons-io:2.4")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.8")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.7.1")

}