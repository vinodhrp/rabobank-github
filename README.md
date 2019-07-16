# Rabobank - Git API Invoker


## About the Application
* Java Web Application, which list out all the public repositories available of the logged Git User. 

## Install & Running
 
### Prerequisites
* [Java 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)  - Programming language
* [Maven 3.5.0](https://maven.apache.org/download.cgi) - Build tool


### Pull from git 
```
$ git clone https://github.com/vinodhrp/rabobank-github
$ cd rabobank-github
```

### Build & run 

* Run test
```
$ mvn test
```

* Run the web server
```
$ mvn spring-boot:run
```


### API documentation
PCF - 
[https://rabobank-github-io.cfapps.io/swagger-ui.html](https://rabobank-github-io.cfapps.io/swagger-ui.html)

After running the project on dev environment and browse
[http://localhost:9191/swagger-ui.html](http://localhost:9191/swagger-ui.html)



## Built With
* [Spring boot 1.5.19](https://projects.spring.io/spring-boot/) - Backed Framework
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Vinodh Ramamoorthy**

## License

This project is licensed under the MIT License

