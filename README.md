# Java-RestApi-Training
Java, Spring boot, docker, mysql, rest api

# Descargar : https://dev.mysql.com/downloads/shell/

# Correr para levantar BD MySql
//	docker run --detach 
//	--env MYSQL_ROOT_PASSWORD=dummypassword 
//	--env MYSQL_USER=courses-user 
//	--env MYSQL_PASSWORD=dummycourses 
//	--env MYSQL_DATABASE=courses 
//	--name mysql
//	--publish 3306:3306 mysql:5.7

# Spring Boot
    - Utiliza dependency injection
    - Auto configura las frameworks.
    - Tiene tomcat embeded server y otros.
## resources/application.properties
1. Alli puede congigurar su connection string
## spring-boot-devtools
1. En el pom.xml esta dependencia permite recargar el server cuando salva un archivo.

## spring-boot-starter-data-jpa
1. Para conectarse a una base de datos.

