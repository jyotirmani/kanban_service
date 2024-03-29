# Project Kanban_serve
```
RESTfull API for Kanban_serves project management
```

## Requirements
```
JDK 8
Maven
Postman
Docker
Springframework boot
Spring web
Swagger2
Swagger-UI
```


## Run
```
git clone  https://github.com/jyotirmani/kanban_service.git
cd Kanban_serve
mvnw spring-boot:run or ./mvnw spring-boot:run

or Run using any tools like STS, eclipse using maven install, build and Run the Application class.
```

## APIs
```
Import Postman API collection: 
localhost:8088/rest/getStateData
```

## Import Postman API collection for swagger documentation 
localhost:8088/v2/api-docs

## To get the swagger documentation through browser
```
http://localhost:8088/swagger-ui.html#/kanban-controller
http://localhost:8088/swagger-ui.html#/basic-error-controller
http://localhost:8088/swagger-ui.html#/user-resource
```


-----
## Docker execution steps
```
Build the docker image
docker build -t Kanban-state-springboot-docker.jar .

Cheeck the docker image created
docker image ls

## Run the build Image
docker run -p 9090:8088 Kanban-state-springboot-docker.jar
```
----
## Using Docker Hub
```
docker tag Kanban-state-springboot-docker.jar test/Kanban-state-springboot-docker.jar

docker push test/Kanban-state-springboot-docker.jar

docker pull test/Kanban-state-springboot-docker.jar
docker run -p 9090:8088 Kanban-state-springboot-docker.jar
```
