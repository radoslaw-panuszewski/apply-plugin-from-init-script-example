rootProject {
    buildscript {
        dependencies {
            classpath("com.coditory.gradle:integration-test-plugin:1.5.0")
        }
    }
    pluginManager.withPlugin("java") {
        apply(plugin = "com.coditory.integration-test")
    }
}