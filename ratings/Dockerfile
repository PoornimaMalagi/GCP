FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/ratings-0.0.1-SNAPSHOT.jar ratings.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","ratings.jar"]