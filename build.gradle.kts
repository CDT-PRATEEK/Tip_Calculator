
buildscript {
    extra.apply {
        set("compose_compiler_version", "1.4.7")
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.21" apply false
}
