plugins {
    kotlin("jvm") version "2.1.21"
    application // <- ADICIONADO
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

// <- ADICIONADO
application {
    mainClass.set("MainKt") // Nome da classe gerada automaticamente pelo Kotlin se sua função main está fora de classe
}
