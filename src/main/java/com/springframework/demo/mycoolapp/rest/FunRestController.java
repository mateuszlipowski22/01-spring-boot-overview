package com.springframework.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Updated version automated";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is yout lucky day";
    }
}
