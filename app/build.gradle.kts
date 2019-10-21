plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
}


android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId = "com.ccr.git"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = AndroidVersion.code
        versionName = AndroidVersion.name
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appcompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintlayout)
    implementation(Libraries.lifecycleExtensions)
    implementation(Libraries.lifecycleViewmodel)

    testImplementation(UnitTestLibraries.junit4)

    androidTestImplementation(AndroidTestLibraries.junit)
    androidTestImplementation(AndroidTestLibraries.espresso)
}
