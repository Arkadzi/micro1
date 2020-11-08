FROM openjdk:8
ADD target/lab1.jar /lab1.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "lab1.jar"]
