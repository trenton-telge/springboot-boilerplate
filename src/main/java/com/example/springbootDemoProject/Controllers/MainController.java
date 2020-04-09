package com.example.springbootDemoProject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    StudentReport sRepo;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/view")
    public ModelAndView view(){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("students", sRepo.findAll());
        return mv;
    }
}