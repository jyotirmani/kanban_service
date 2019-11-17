FROM openjdk:8
EXPOSE 8088
ADD target/Kanban-state-springboot-docker.jar Kanban-state-springboot-docker.jar
ENTRYPOINT ["java", "-jar", "/Kanban-state-springboot-docker.jar"]