package com.bikram.practice.basicrestdemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class RestResourceDemo {

    @GetMapping("/greeting")
    public String showMessage(){
        return "Hello Everyone";
    }
}
