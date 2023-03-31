package com.suwon.ezen.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/*")
public class controller {
    // 서버 연결 코드 작성
    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello intel.");
    }

    @GetMapping("/world")
    public void world(){
        System.out.println("hello world!");
    }


}
