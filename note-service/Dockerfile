FROM openjdk:8-jdk-alpine
MAINTAINER Murat Öztürk <muratozturk1987@gmail.com>

# Add the service itself
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} muratovic-note-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/muratovic-note-service.jar"]
