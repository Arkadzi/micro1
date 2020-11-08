FROM openjdk:8
ADD target/edge.jar /edge.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "edge.jar"]
