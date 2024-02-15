package com.aryan.sociallogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @GetMapping("/hello")
    public String health(){
        return "200 OK";
    }
}
