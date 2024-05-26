# Spring Boot Actuator with No DB Research Project

I am facing an issue where I cannot get a simple spring boot web project with just a hello world to launch with the actuator without it crashing because I do not have a DB.  This is an effort to recreate that issue stand alone.

## Installation

```bash
./gradlew clean build
```

## Run this code
```bash
./gradlew run
```

## Test

```bash
wget http://localhost:8080/hello
```

## License 
[Apache Commons 2.0](LICENSE)