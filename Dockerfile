FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/UserInfo/src
COPY pom.xml /home/app
RUN mvn -f /home/UserInfo/pom.xml clean package

FROM openjdk:8-jre-slim
COPY --from=build /home/UserInfo/target/UserInfo-0.0.1-SNAPSHOT.jar /usr/local/lib/UserInfo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/UserInfo.jar"]