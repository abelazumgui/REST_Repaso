FROM mysql AS mysql_banco_imagen
ENV MYSQL_DATABASE banco
COPY ./sql-script/ /docker-entrypoint-initdb.d/

FROM openjdk:19-jdk-alpine3.15 AS rest_banco_imagen
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} rest_banco.jar
ENTRYPOINT ["java","-jar","/rest_banco.jar"]
