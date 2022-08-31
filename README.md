# Java-RestApi-Training
Java, Spring boot, docker, mysql, rest api



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
## Descargar : https://dev.mysql.com/downloads/shell/

//	docker run --detach 
//	--env MYSQL_ROOT_PASSWORD=dummypassword 
//	--env MYSQL_USER=courses-user 
//	--env MYSQL_PASSWORD=dummycourses 
//	--env MYSQL_DATABASE=courses 
//	--name mysql
//	--publish 3306:3306 mysql:5.7




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

