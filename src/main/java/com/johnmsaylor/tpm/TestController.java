package com.johnmsaylor.tpm;

import com.johnmsaylor.tpm.model.Form;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

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

    @PostMapping("/api")
    public Form postForm(@RequestBody Form form) {

        System.out.println(form.getFavoriteThing());
        System.out.println(form.getIdeas());
        System.out.println(form.getLeastFavoriteThing());
        System.out.println(form.getRating());
        System.out.println(Arrays.toString(form.getReasons()));

        return form;
    }



}
