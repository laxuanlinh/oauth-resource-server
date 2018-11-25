package com.example.authclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateController {

    @RequestMapping("/")
    public String hello(){
        return "Welcome to the public web";

    }

    @RequestMapping("/private")
    public String privateHello(){
        return "Welcome to the private web";
    }

}
