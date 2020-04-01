package com.bikram.practice.basicrestdemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/practice")
public class RestResourceDemo {

    @GetMapping("/greeting")
    public String showMessage(){
        return "Hello Everyone";
    }

    @GetMapping("/month")
    public String getDay(){
        Calendar cal = Calendar.getInstance();
        Date date = new Date(cal.getTimeInMillis());
        return new SimpleDateFormat("MMMM").format(date);
    }
}
