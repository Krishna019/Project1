package com.example.Second.Week.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping(path = "/getSecretMessage")
    public String getMySuperSecretMessage(){
        return "Secret message";
    }


}
