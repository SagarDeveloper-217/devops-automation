FROM openjdk:latest
EXPOSE 8080
ADD target/devops-pro.jar devops-pro.jar
ENTRYPOINT ["java","-jar","/devops-pro.jar"]