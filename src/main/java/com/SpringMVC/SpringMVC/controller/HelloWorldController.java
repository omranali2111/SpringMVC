package com.SpringMVC.SpringMVC.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

    @RequestMapping("/showform")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processform")
    public String processForm(){
        return "hello";
    }
    @RequestMapping("/processformV2")
    public String letsShout(@RequestParam("studentName") String theName, Model model){
        theName=theName.toUpperCase();
        String result ="hey my friend! "+ theName;
         model.addAttribute("message",result);
         return "hello";

    }
}
