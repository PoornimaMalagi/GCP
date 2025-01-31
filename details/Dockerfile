FROM openjdk:17-jdk-alpine
ADD target/details-0.0.1-SNAPSHOT.jar.original details.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","details.jar"]
