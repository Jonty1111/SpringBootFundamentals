Btw Two Applications -> API -> XML/JSON
Client -> Browser
TomCatServer -> Application -> JAva

Rest Service
Client -> HTTP request -> Request -> REST Interfaces ->Throws back the application logic -> JSON convertor JSON -> Response ->Tomcat server -> Send the particular response to HTTP

Startup Project is something in which all the dependency are packed 

Bean is a class with instance 

**SpringBoot Container**

DEPENDENCIES
------------
  1.Starter JSON->Converting array to JSON response
  2.Apache Tomcat->AutoConfiguration with localhost:8080
  3.Spring-boot-Autoconfigure
@SpringBootApplication
  ->SpringBootRestAPI -> class
     ->@ComponentScan
        ->@RestController
            ->Recommendation Controller -> Class -> Return an array back -> Converted into JSON Response -> Starter JSON
                                                 ->GetMapping("/movies")
        Tomcat Server is AutoConfigured -> Servlet Container Configurations Default


   
**Application Layering**

Web Layer
---------
->@SpringBootApplication
    ->@ComponentScan,@Configuration

->@RestController
    ->@GetMapping()
        ->getAllMovies()
            ->return ArrayList[]
                ->to JSON

->Client->Tomcat Server->localhost:8080


Service Layer
------------



DAO Layer
---------



DATABASE
--------
    



Developer Tools
--------------
Stater Project
-------------
->Spring Web

ACTUATOR
--------


SPRING FRAMEWORK
----------------
1.We can develop any application using SPRING MVC
2.Spring Boot



https://drive.google.com/file/d/1G7ISkYNp2y-MRTzwz1SSYwU5V848dz5-/view?usp=sharing, https://drive.google.com/file/d/1qZSzqL-V_-nkJ5nOoGAQbIo1D8D37Gru/view?usp=sharing
https://drive.google.com/file/d/1G7ISkYNp2y-MRTzwz1SSYwU5V848dz5-/view?usp=sharing
https://drive.google.com/file/d/1qZSzqL-V_-nkJ5nOoGAQbIo1D8D37Gru/view?usp=sharing
