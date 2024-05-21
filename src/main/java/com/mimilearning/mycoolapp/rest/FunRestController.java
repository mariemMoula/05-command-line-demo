package com.mimilearning.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public  String sayHello(){
        return "Hello !";
    }
    //expose a new endpoint for "x"
    @GetMapping("/x")
    public  String sayX(){
        return "Hello from X!";
    }
    @GetMapping("/y")
    public  String sayY(){
        return "Hello from X!";
    }
    @GetMapping("/z")
    public  String sayZ(){
        return "Hello from Z!";
    }
    @GetMapping("/w")
    public  String sayW(){
        return "Hello from W!";
    }
}
