package com.aman.first_spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    @RequestMapping("/home")
    @ResponseBody
    public String testfunc(){
        secodfunc();
        return "home";
    }
    static void secodfunc(){
        System.out.println("anything");
    }
}
