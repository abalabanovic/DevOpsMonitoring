
# Docker-compose.yml run containers on localhost

#Docker-compose file running three containers inside of docker network

#1. Spring pet clinic app including jmx exporter running on port 8080
#and outputing the metrics on port 7777/metrics

#2. Prometheus container running on port 9090 and scraping metrics from
#http://petclinic:7777/metrics 

#3. Grafana container running on 3000 using prometheus as data source

