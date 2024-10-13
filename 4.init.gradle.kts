import com.coditory.gradle.integration.IntegrationTestPlugin

initscript {
    dependencies {
        classpath("com.coditory.gradle:integration-test-plugin:1.5.0")
    }

    repositories {
        gradlePluginPortal()
    }
}

rootProject {
    apply<IntegrationTestPlugin>()
}