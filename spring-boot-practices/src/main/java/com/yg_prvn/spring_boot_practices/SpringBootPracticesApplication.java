package com.yg_prvn.spring_boot_practices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootPracticesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticesApplication.class, args);
	}

	@GetMapping("/hello2")
    public String helloEveryone(@RequestParam(value = "name", defaultValue = "") String name) {
		if(name.equals("")) return "Enter a Parameter like : localhost:8080/hello2?name=YOUR NAME";
        return String.format("Hello, %s!", name);
    }



}
