#Using alpine base image
FROM alpine:latest

#Create directory inside of a container
WORKDIR /app

#Install extensions
RUN apk --no-cache add openjdk17
RUN apk --no-cache add wget

#Download jmx_exporter .jar file
RUN wget https://repo1.maven.org/maven2/io/prometheus/jmx/jmx_prometheus_javaagent/0.6/jmx_prometheus_javaagent-0.6.jar \
    -O /app/jmx_prometheus_javaagent.jar

# Copy artifacts from Gradle to container
COPY build/libs/spring-petclinic-*.jar /app/spring-petclinic.jar

#Copy JMX exporter yaml file to container
COPY jmx_exporter_config.yaml /app/jmx_exporter_config.yaml

#Expose port for app and exporter
#App will use 8080 and jmx exporter will use 7777/metrics
EXPOSE 8080
EXPOSE 7777

#Rune jmx exporter with spring pet clinic app
CMD ["java", "-javaagent:/app/jmx_prometheus_javaagent.jar=7777:/app/jmx_exporter_config.yaml", "-jar", "/app/spring-petclinic.jar"]

