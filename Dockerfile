FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/*.jar /app/tutocicd.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/tutocicd.jar"]