package com.example.tutorielcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TutorielCicdApplication {
    @GetMapping("/hello")
    public String teste(){
     return  "Bonjour mon amie Tanjona";
    }

    public static void main(String[] args) {
        SpringApplication.run(TutorielCicdApplication.class, args);
    }

}
