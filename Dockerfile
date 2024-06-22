FROM openjdk:17
EXPOSE 8080
ADD target/springboot-application2-0.0.1-SNAPSHOT.jar springboot-application2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "springboot-application2-0.0.1-SNAPSHOT.jar"]
