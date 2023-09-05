# grade7, jdk11
FROM gradle:7.0.2-jdk11 AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# jdk11  
FROM openjdk:11-jre-slim
COPY --from=build /app/build/libs/study-group.jar /study-group.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/study-group.jar"]
