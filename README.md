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

## Read the Step By Step Guide here 
[Building Rest API with SpringBoot 2](https://medium.com/@pranoy8086/building-rest-api-with-springboot-2-9bd89fb308b0)

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

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/savestudent.png)

## Retriving all student details

URL : http://localhost:8080/StudentManagementSystem/api/v1/students

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/getallstudents.png)

## Retriving a student details by id

URL : http://localhost:8080/StudentManagementSystem/api/v1/student/{id}

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/getstudentbyid.png)

## Deleting a student details by id

URL : http://localhost:8080/StudentManagementSystem/api/v1/student/{id}

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/deletestudent.png)

## Updating a student details

URL : http://localhost:8080/StudentManagementSystem/api/v1/student

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/updatestudent.png)

## User already exists Exception

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/useralreadyexist.png)

## User does not Exists Exception

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/userdoesnotexits.png)

## Query result from Azure Data Studio

```sql
SELECT * FROM dbo.students
```

![image](https://github.com/developersview/student-management-system-rest-service/blob/master/screenshots/azuredatastudio.png)
