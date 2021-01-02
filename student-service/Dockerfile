FROM openjdk:8-jdk-alpine
MAINTAINER Murat Öztürk <muratozturk1987@gmail.com>

# Add the service itself
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} muratovic-student-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/muratovic-student-service.jar"]
