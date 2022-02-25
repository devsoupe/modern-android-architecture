const val KOTLIN_VERSION = "1.5.31"
const val JUNIT5_VERSION = "5.7.2"
const val COMPOSE_VERSION = "1.0.5"

object Kotlin {
    const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
}

object Androidx {
    const val CORE = "androidx.core:core-ktx:1.6.0"
    const val APPCOMPAT = "androidx.appcompat:appcompat:1.3.1"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.3"
    const val GOOGLE_MATERIAL = "com.google.android.material:material:1.4.0"
}

object Compose {
  const val UI = "androidx.compose.ui:ui:$COMPOSE_VERSION"
  const val UI_TOOLING = "androidx.compose.ui:ui-tooling:$COMPOSE_VERSION"
  const val FOUNDATION = "androidx.compose.foundation:foundation:$COMPOSE_VERSION"
  const val MATERIAL_DESIGN = "androidx.compose.material:material:$COMPOSE_VERSION"
  const val MATERIAL_ICONS = "androidx.compose.material:material-icons-core:$COMPOSE_VERSION"
  const val MATERIAL_ICONS_EXTENDED = "androidx.compose.material:material-icons-extended:$COMPOSE_VERSION"
  const val RUNTIME_LIVEDATA = "androidx.compose.runtime:runtime-livedata:$COMPOSE_VERSION"
  const val ACTIVITY = "androidx.activity:activity-compose:1.4.0"

  const val ANDROID_TEST = "androidx.compose.ui:ui-test-junit4:$COMPOSE_VERSION"
}

object Test {
    private const val DE_MANNODERMAUS_JUNIT5_VERSION = "1.2.2"

    const val JUNIT4 = "junit:junit:4.13.2"
    const val JUNIT5 = "org.junit.jupiter:junit-jupiter:$JUNIT5_VERSION"
    const val JUNIT5_JUPITER_API = "org.junit.jupiter:junit-jupiter-api:$JUNIT5_VERSION"
    const val JUNIT5_VINTAGE_ENGINE = "org.junit.vintage:junit-vintage-engine:$JUNIT5_VERSION"
    const val JUNIT5_ANDROID_TEST_CORE = "de.mannodermaus.junit5:android-test-core:$DE_MANNODERMAUS_JUNIT5_VERSION"
    const val JUNIT5_ANDROID_TEST_RUNNER = "de.mannodermaus.junit5:android-test-runner:$DE_MANNODERMAUS_JUNIT5_VERSION"

    const val ANDROIDX_JUNIT = "androidx.test.ext:junit:1.1.3"
    const val THRUTH = "com.google.truth:truth:1.1.3"

    const val ESSPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
}
