# Spring-boot-project-practices
Spring Boot Practices --traininng

Project Title: Spring Boot Basics Practice

Description:
This project is a beginner-friendly Spring Boot application designed to demonstrate the development of RESTful APIs. The application showcases the use of various annotations such as @SpringBootApplication, @RestController, @RequestMapping, and @GetMapping to build a lightweight web server capable of handling HTTP requests.

The application provides the following endpoints:

/hello Endpoint:
Method: GET
Response: Returns a simple "Hello, World!" message to demonstrate a basic API response.

/hello1 Endpoint:
Method: GET
Response: Returns a personalized greeting, "Hello, Praveen!" showcasing another example of static responses.

/hello2 Endpoint:
Method: GET
Query Parameter: name (optional)
Response:
If the name parameter is provided: Returns a personalized message in the format "Hello, [name]!"
If the name parameter is missing or empty: Provides guidance to include the parameter in the URL (e.g., /hello2?name=YOUR NAME).

Technologies Used:

Framework: Spring Boot
Programming Language: Java
Development Tools: VS Code, Maven
