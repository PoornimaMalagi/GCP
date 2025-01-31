FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/productPage-0.0.1-SNAPSHOT.jar productPage.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","productPage.jar"]