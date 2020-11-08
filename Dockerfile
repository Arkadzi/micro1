FROM openjdk:8
ADD target/calculator.jar /calculator.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "calculator.jar"]
