FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/details-0.0.1-SNAPSHOT.jar details.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","details.jar"]