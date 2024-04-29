FROM alpine:latest

RUN apk --no-cache add openjdk17

WORKDIR /app

#Artifacts from Gradle
COPY build/libs/spring-petclinic-*.jar petclinic.jar

EXPOSE 8080

CMD ["java", "-jar", "petclinic.jar"]
