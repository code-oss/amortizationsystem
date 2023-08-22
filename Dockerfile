FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:11-jdk-slim
COPY --from=build /target/loanapp-0.0.1-SNAPSHOT.jar loanapp.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","loanapp.jar"]
