FROM openjdk:17
EXPOSE 8082
ADD target/docker.jar docker.jar 
ENTRYPOINT ["java","-jar","/docker.jar"]