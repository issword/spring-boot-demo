package com.sword.man;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }
}