FROM openjdk:11-slim
WORKDIR /app
COPY ./*-SNAPSHOT.jar ./app.jar

EXPOSE 8080 

ENTRYPOINT ["java", "-jar", "app.jar"]
