package com.example.cicd1216_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hi")
    public String hicicd(){
        return "hicicd 1216";
    }

    @GetMapping("/hi2")
    public String hicicd2(){
        return "새로운 개발 cicd 적용";
    }
}
