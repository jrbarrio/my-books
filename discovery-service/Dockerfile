FROM openjdk:15-jdk-alpine

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY ./build/libs/discovery-service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
