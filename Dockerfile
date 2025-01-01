FROM eclipse-temurin:17

EXPOSE 8080

ADD demo-cicd.jar demo-cicd.jar

ENTRYPOINT ["java", "-jar", "/demo-cicd.jar"]