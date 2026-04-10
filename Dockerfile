# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the JAR file, skipping tests to speed up the process
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the JAR from the build stage
# Note: Ensure the JAR name matches what is in your pom.xml (usually artifactId-version.jar)
COPY --from=build /app/target/*.jar app.jar

# Expose the port Render will use (defaults to 8080)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]