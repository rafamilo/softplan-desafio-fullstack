
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests=true

FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/api-*.jar /home/app/app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev", "-jar", "/home/app/app.jar"]