# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Maven config files
COPY pom.xml .
COPY src ./src

# Build the project
RUN mvn -B -DskipTests package

# Stage 2: Run the application
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy built jar from Stage 1
COPY --from=build /app/target/app-1.0-SNAPSHOT.jar app.jar

# Run the program
ENTRYPOINT ["java", "-jar", "app.jar"]