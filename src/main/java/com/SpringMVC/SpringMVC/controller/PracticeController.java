package com.SpringMVC.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class PracticeController {

    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("theDate", LocalDateTime.now());

        return "hello";
    }

}
