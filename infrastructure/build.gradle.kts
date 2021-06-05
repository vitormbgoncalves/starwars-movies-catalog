val koin_version: String by project
val logback_version: String by project
val ktor_version: String by project
val kmongo_version: String by project
val ktorOpenAPIGenerator: String by project
val jackson_version: String by project

dependencies {
    // Module dependencies
    implementation(project(":core"))
    implementation(project(":interfaces"))
    implementation(project(":database"))
    implementation(project(":common-lib"))

    // Ktor
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-auth-jwt:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")

    // Jackson Serialization
    implementation("io.ktor:ktor-jackson:$ktor_version")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jackson_version")

    // koin
    implementation("io.insert-koin:koin-ktor:$koin_version")
    implementation("io.insert-koin:koin-logger-slf4j:$koin_version")
    testImplementation("io.insert-koin:koin-test-junit4:$koin_version")

    // KMongo
    implementation("org.litote.kmongo:kmongo-coroutine-serialization:$kmongo_version")

    // Ktor OpenAPI Generator
    implementation("com.github.papsign:Ktor-OpenAPI-Generator:$ktorOpenAPIGenerator")
}