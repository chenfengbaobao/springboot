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
        for (int i = 0; i < 5; i++) {
            System.out.println("--i--"+i);
        }
        return "Hello Spring Boot!";


    }


    @RequestMapping("/whfchen")
    public String whfchen() {
        for (int i = 0; i < 5; i++) {
            System.out.println("--i--"+i);
        }
        return "Hello Spring Boot!";


    }

    @RequestMapping("/bao")
    public String bao() {
        for (int i = 0; i < 5; i++) {
            System.out.println("--i--"+i);
        }
        return "Hello Spring Boot!";
    }

    @RequestMapping("/bao3333")
    public String bao3333() {
        for (int i = 0; i < 5; i++) {
            System.out.println("--i--"+i);
        }
        return "Hello Spring Boot!";
    }


    @RequestMapping("/chen555")
    public String chen555() {
        return "Hello Spring Boot Chen!";
    }

    @RequestMapping("/chen8888")
    public String chen8888() {
        return "Hello Spring Boot Chen!";
    }
}
