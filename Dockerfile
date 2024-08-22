FROM openjdk:22-jdk-slim
VOLUME /tmp
COPY target/guard-1.0.0.jar guard.jar
ENTRYPOINT ["java", "-jar", "/guard.jar"]
EXPOSE 8080