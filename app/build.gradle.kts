plugins {
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-kapt")
  id("de.mannodermaus.android-junit5")
}

android {
  compileSdk = 30

  defaultConfig {
    applicationId = "com.devsiupe.maa"
    minSdk = 21
    targetSdk = 30
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    testInstrumentationRunnerArguments["runnerBuilder"] =
      "de.mannodermaus.junit5.AndroidJUnit5Builder"
  }

  buildTypes {
    getByName("release") {
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
  Kotlin.apply {
    implementation(STDLIB)
  }

  Androidx.apply {
    implementation(CORE)
    implementation(APPCOMPAT)
    implementation(GOOGLE_MATERIAL)
    implementation(CONSTRAINT_LAYOUT)
  }

  Compose.apply {
    implementation(UI)
    implementation(UI_TOOLING)
    implementation(FOUNDATION)
    implementation(MATERIAL_DESIGN)
    implementation(MATERIAL_ICONS)
    implementation(MATERIAL_ICONS_EXTENDED)
    implementation(RUNTIME_LIVEDATA)

    androidTestImplementation(ANDROID_TEST)
  }

  Test.apply {
    testImplementation(JUNIT4)
    testImplementation(JUNIT5)
    testRuntimeOnly(JUNIT5_VINTAGE_ENGINE) // junit4 지원
    testImplementation(THRUTH)

    androidTestImplementation(ANDROIDX_JUNIT)
    androidTestImplementation(JUNIT5)
    androidTestImplementation(JUNIT5_JUPITER_API)
    androidTestImplementation(JUNIT5_ANDROID_TEST_CORE)
    androidTestImplementation(ESSPRESSO_CORE)
    androidTestRuntimeOnly(JUNIT5_ANDROID_TEST_RUNNER)
  }
}


//dependencies {
//
//  implementation 'androidx.core:core-ktx:1.7.0'
//  implementation "androidx.compose.ui:ui:$compose_version"
//  implementation "androidx.compose.material:material:$compose_version"
//  implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"
//  implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.1'
//  implementation 'androidx.activity:activity-compose:1.3.1'
//  testImplementation 'junit:junit:4.13.2'
//  androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//  androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
//  androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"
//  debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
//}
