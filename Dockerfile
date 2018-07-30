FROM openjdk:8-jre-alpine
VOLUME ["/tmp", "/config"]
ARG JAR_FILE
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dloader.path=/config","-jar","/app.jar"]