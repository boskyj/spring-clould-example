FROM openjdk:8-jdk-alpine
RUN addgroup -S bosky && adduser -S bosky -G bosky
USER bosky:bosky
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]