# Spring Boot Actuator with No DB Research Project

I am facing an issue where I cannot get a simple spring boot web project with just a hello world to launch with the actuator without it crashing because I do not have a DB.  This is an effort to recreate that issue stand alone.

## Installation

```bash
./gradlew clean build
```

## Run this code
```bash
./gradlew bootRun
```

## Test

```bash
wget http://localhost:8080/actuator
```
## Generation
The initial generation of this project was done with [Spring Boot Initializer](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.3.0&packaging=jar&jvmVersion=21&groupId=dev.rwwise&artifactId=sb_acutator_nodb&name=Spring%20Boot%20Actuator%20with%20No%20DB&description=Spring%20Boot%20Actuator%20with%20No%20DB%20Research%20Project&packageName=dev.rwwise.sb_acutator_nodb&dependencies=web,actuator)
### Options
* Gradle
* Spring Boot 3.3.0
* Group: dev.rwwise
* Artifact: sb_actuator_nodb
* Name: Spring Boot Actuator with No DB
* Description: Spring Boot Actuator with No DB Research Project
* Packaging: Jar
* Java: 21
### Dependencies
* Spring Web
* Spring Boot Actuator

## License
[Apache Commons 2.0](LICENSE)