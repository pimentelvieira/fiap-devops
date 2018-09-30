FROM openjdk:8
ADD target/fiap-devops.jar fiap-devops.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "fiap-devops.jar"]