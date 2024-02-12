package com.coderdot.controllers;

import com.coderdot.dto.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Welcome to our Healthy Center! We're delighted to have you here. At our center, we're dedicated to empowering you on your journey towards a healthier and happier lifestyle. Whether you're seeking expert guidance, wellness resources, or simply a supportive community, you've come to the right place. Explore our range of services, classes, and programs designed to nurture your mind, body, and spirit. Together, let's embark on a path to optimal well-being. Welcome, and let's thrive together!");
    }

}
