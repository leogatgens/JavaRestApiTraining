# Java-RestApi-Training
Java, Spring boot, docker, mysql, rest api

# El proyecto se creo usando https://start.spring.io/ 
1. Maven project
2. java
3. Jar
4. Con la dependencia Spring Web


# Opcion 1 en BD : Correr en H2 memory database
1. Agregar el pom.xml
   <dependency>
   <groupId>com.h2database</groupId>
   <artifactId>h2</artifactId>
   <scope>runtime</scope>
   </dependency>
2. http://localhost:8080/h2-console/ para accesar la bd
3. usar esto en application.properties: 
   logging.level.org.springframework=DEBUG
   management.endpoints.web.exposure.include=*
   spring.datasource.url=jdbc:h2:mem:testdb;
   spring.jpa.defer-datasource-initialization = true
# Para probar API retorna datos de H2
1. http://localhost:8080/courses
2. http://localhost:8080/courses/1





# Opcion 2 en BD: Correr para levantar BD MySql

## Usando Docker-Desktop
1. docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=courses-user --env MYSQL_PASSWORD=dummycourses	--env MYSQL_DATABASE=courses --name mysql-Training --publish 3306:3306 mysql:8.0
1.1 si la version 8.0 no funciona utilizar latest
2. Descomentar # MYSQL CONFIGURATION en application.properties y comentar H2
3. Comentar el h2 y agregar en pom.xml
   <dependency>
   <groupId>mysql</groupId>
   <artifactId>mysql-connector-java</artifactId>
   </dependency>




# GENERAL -- Spring Boot
    - Utiliza dependency injection
    - Auto configura las frameworks.
    - Tiene tomcat embeded server y otros.
## resources/application.properties
1. Alli puede configurar su connection string

## spring-boot-devtools
1. En el pom.xml esta dependencia permite recargar el server cuando salva un archivo.

## spring-boot-starter-data-jpa
1. JPA(hibernate) Para conectarse a una base de datos.

