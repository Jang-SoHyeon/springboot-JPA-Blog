package com.my.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

//    @GetMapping("/test/hello")
    @RequestMapping(value = "/test/hello")
    public String hello(){
        return "<h1>hello spring boot</h1>";
    }
}
