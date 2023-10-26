package com.gedai.flowcv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")
    public String HelloWorld(){
        return "hello bidas";
    }
}
