# Student Management System Rest Service

This is a Student Management Service REST API, implemented CRUD operations.

### Tools Used :

- JDK 11 or higher
- Spring Boot 2.7.1
  - MSSQL Driver
  - JDBC Driver
  - JPA
  - Tomcat Embed + Tomcat Starter
- Microsoft SQL Server
- IntelliJ IDEA for coding
- Azure Data Studio
- Postman

## Project Structure

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/projectstructure.png)

## Important Configurationn for SpringBoot and MS SQL

Add this as a environment variable

```properties
spring.profiles.active=dev
```

application.properties file :

```properties
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=StudentDB;encrypt=true;trustServerCertificate=true;
spring.datasource.username=
spring.datasource.password=
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.SQLServer2012Dialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update

data.exception.message1=User already exists!
data.exception.message2=User does not exists!
```

## Saving a student

URL : http://localhost:8080/StudentManagementSystem/api/v1/student

```properties
http://localhost:8080/StudentManagementSystem/api/v1/student
```

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/savestudent.png)
