FROM alpine:latest

WORKDIR /app

RUN apk --no-cache add openjdk17

RUN wget https://repo1.maven.org/maven2/io/prometheus/jmx/jmx_prometheus_javaagent/0.15.0/jmx_prometheus_javaagent-0.15.0.jar \
    -O /opt/jmx_prometheus_javaagent.jar

#Artifacts from Gradle
COPY build/libs/spring-petclinic-*.jar /opt/petclinic.jar

EXPOSE 8080

CMD ["java", "-javaagent:/opt/jmx_prometheus_javaagent.jar=8080:/opt/jmx_exporter_config.yaml", "-jar", "/opt/spring-petclinic.jar"]
