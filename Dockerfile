FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/digilims-spring-boot.jar digilims-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "digilims-spring-boot.jar"]
