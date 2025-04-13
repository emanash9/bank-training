FROM openjdk:23-jdk-slim

WORKDIR /app
COPY target/assessment2-app.jar assessment2-app.jar

EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "assessment2-app.jar"]