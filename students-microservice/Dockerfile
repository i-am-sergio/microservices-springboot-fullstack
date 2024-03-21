# from Image: eclipse-temurin:17-jre-alpine (jdk for development and jre for production)
FROM eclipse-temurin:17-jre-alpine

# Copy the jar file into the container
COPY build/libs/students-microservice-0.0.1-SNAPSHOT.jar students-microservice-0.0.1-SNAPSHOT.jar

# Run the jar file
CMD ["java", "-jar", "students-microservice-0.0.1-SNAPSHOT.jar"]

EXPOSE 8001

