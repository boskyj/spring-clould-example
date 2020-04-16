FROM openjdk:8-jdk-alpine
RUN addgroup -S bosky && adduser -S bosky -G bosky
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
COPY start.sh start.sh
RUN ["chmod", "+x", "./start.sh"]
USER bosky:bosky
ENTRYPOINT ["/bin/sh","./start.sh"]