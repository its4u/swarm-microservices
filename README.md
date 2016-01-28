# Swarm Microservices

This project is an proof of concept of a self-contained JEE microservices.
It uses the wildfly swarm (http://wildfly-swarm.io/) technology.

As a result you get a 40Mb far jar containing part of the JEE application server and the microservices.

## Try it
Launch locally with:
'mvn wildfly-swarm:run'
    
Microservices available at:
http://localhost:8080/hello/document/1

## More to try...
Run it in Docker:
https://blog.openshift.com/a-wildfly-swarm-jax-rs-microservice-in-a-docker-container/