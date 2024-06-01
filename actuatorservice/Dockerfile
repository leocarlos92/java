# Use the official maven/adoptopenjdk build image as the build environment
# AdoptOpenJDK is now moved to Eclipse Temurin. You might want to use eclipse-temurin images for future projects
# Adjust the JDK version as per your project's need
FROM maven:latest as build

# Copy the project files to the container
COPY src /home/app/src
COPY pom.xml /home/app

# Package the application
RUN mvn -f /home/app/pom.xml clean package -DskipTests

# Use OpenJDK for the runtime environment
FROM openjdk:17-oracle

# Copy the built artifact from the build stage
COPY --from=build /home/app/target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java","-jar","/app.jar"]
