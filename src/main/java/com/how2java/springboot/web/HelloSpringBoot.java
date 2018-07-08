package com.how2java.springboot.web;

/**
 * Created by DELL on 2018/2/7.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloSpringBoot
{
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }



    @RequestMapping("/chen")
    public String chen() {
        return "Hello Spring Boot Chen!";
    }

    @RequestMapping("/chen222")
    public String chen222() {
        return "Hello Spring Boot Chen!";
    }

    @RequestMapping("/chen333")
    public String chen333() {
        return "Hello Spring Boot Chen!";
    }
}
