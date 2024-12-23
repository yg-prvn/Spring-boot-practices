package com.yg_prvn.spring_boot_practices;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
public class HelloController {
    @RequestMapping("/hello") 
    public String hello(){
        return "Hello, World!";
    }

    @RequestMapping("/hellopraveen")
    public String hello1() {
        return "Hello, Praveen!";
    }

    // @GetMapping("/hello_")
    // public String helloEveryone(@RequestParam(value = "name", defaultValue = "Praveen") String name) {
    //     return String.format("Hello, %s!", name);
    // }
    
    
}
