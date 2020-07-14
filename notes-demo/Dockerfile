FROM openjdk:8-jre-alpine

RUN mkdir -p /opt
COPY target/notes-demo-0.0.1-SNAPSHOT.jar /opt

ENTRYPOINT java -Dspring.profiles.active=${spring_profiles:-ddev} ${java_opts} - xms${java_xms:-2048m} -xms${java_xms:-2048m} -jar opt/notes-demo-0.0.1-SNAPSHOT.jar