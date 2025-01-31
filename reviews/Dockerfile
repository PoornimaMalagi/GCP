FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/reviews-0.0.1-SNAPSHOT.jar reviews.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","reviews.jar"]