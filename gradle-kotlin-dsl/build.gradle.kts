defaultTasks("build")

tasks.wrapper {
    description = "Regenerates the Gradle Wrapper files"
    gradleVersion = "5.0"
    distributionUrl = "http://services.gradle.org/distributions/gradle-${gradleVersion}-all.zip"
}
