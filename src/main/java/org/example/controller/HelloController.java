package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHii(){
        return "Hii\n";
    }
    /*@RequestMapping("/hello")
    public String show(){
        return "Abhi Bahut Kuch Sikhna hai";
    }*/
}
