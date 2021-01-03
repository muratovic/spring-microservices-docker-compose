FROM openjdk:8-jdk-alpine
MAINTAINER Murat Öztürk <muratozturk1987@gmail.com>

# Add the service itself
ARG JAR_FILE=target/*.jar
ENV JAVA_TOOL_OPTIONS "-agentlib:jdwp=transport=dt_socket,address=7777,server=y,suspend=n"
COPY ${JAR_FILE} muratovic-student-service.jar
EXPOSE 8082 7777
ENTRYPOINT ["java","-jar", "/muratovic-student-service.jar"]
