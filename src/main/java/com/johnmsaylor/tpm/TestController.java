package com.johnmsaylor.tpm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String hey() {
        System.out.println("hello!");
        return "This are you!";
    }

    @RequestMapping("/api")
    public void log() {
        System.out.println("logged");
    }

}
