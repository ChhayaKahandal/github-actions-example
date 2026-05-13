FROM eclipse-temurin:21-jdk

ADD target/springboot-image-githubactions.jar springboot-image-githubactions.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "springboot-image-githubactions.jar"]