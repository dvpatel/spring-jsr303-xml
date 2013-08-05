spring-jsr303-xml
--------------------
Example of Spring / JSR-303 data validation based on JSR303 XML configuration.  This is work in progress.

This project is a continuation of spring-jsr303 project.  While the sample spring-jsr303 sample was based on Annotation, this project demonstrates the same functionality but XML configuration for defining constraints on the domain models.  For technical documentation, refer to URL:  COMING_SOON

System Requirements:
-------------------
*  Java +1.6
*  Git +1.8
*  Maven +3.X

All dependencies, including Spring, Hibernate, tomcat7, and other supporting components are retrieved and configured using maven project manager.  See pom.xml for complete details.

Run-time
--------------------
Code Access:  
*  git clone https://github.com/dvpatel/spring-jsr303-xml.git

Build Project:  
*  cd spring-jsr303-xml
*  mvn package
	
Run Unit Tests:  
*  cd spring-jsr303-xml
*  mvn test
	
Run Sample App:
*  cd spring-jsr303-xml
*  mvn tomcat7:run-war
*  http://localhost:8080/spring-jsr303-xml

To clean:
*  cd spring-jsr303-xml
*  mvn clean
