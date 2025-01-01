FROM eclipse-temurin:17

EXPOSE 8080

ARG JAR_FILE=spring-demo-cicd.jar
COPY ${JAR_FILE} ${JAR_FILE}

ENTRYPOINT ["java", "-jar", "${JAR_FILE}"]