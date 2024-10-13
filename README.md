### Broken init script
Execute the command:
```bash
./gradlew --init-script ./1.init.gradle.kts
```
and you will get the following error:
```
* What went wrong:
Plugin with id 'com.coditory.integration-test' not found.
```

### Working init scripts
Execute any of the following commands:
```bash
./gradlew --init-script ./2.init.gradle.kts
./gradlew --init-script ./3.init.gradle.kts
./gradlew --init-script ./4.init.gradle.kts
```
and the build is successful.