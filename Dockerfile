FROM alpine:latest

WORKDIR /app

RUN apk --no-cache add openjdk17
RUN apk --no-cache add wget

RUN wget https://repo1.maven.org/maven2/io/prometheus/jmx/jmx_prometheus_javaagent/0.6/jmx_prometheus_javaagent-0.6.jar \
    -O /app/jmx_prometheus_javaagent.jar

#Artifacts from Gradle
COPY build/libs/spring-petclinic-*.jar /app/spring-petclinic.jar

EXPOSE 8080
EXPOSE 7777

CMD ["java", "-javaagent:/app/jmx_prometheus_javaagent.jar=7777:/app/jmx_exporter_config.yaml", "-jar", "/app/spring-petclinic.jar"]

