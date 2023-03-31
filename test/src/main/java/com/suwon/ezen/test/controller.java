package com.suwon.ezen.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/*")
public class controller {

    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello intel.");
    }

}
