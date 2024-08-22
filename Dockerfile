FROM openjdk:22-jdk-slim
VOLUME /tmp
COPY target/*.jar guard.jar
ENTRYPOINT ["java", "-jar", "/guard.jar"]
EXPOSE 8080