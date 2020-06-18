package com.codegym.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/heyhey")
    public ModelAndView showHeyView() {
        ModelAndView modelAndView = new ModelAndView("greeting");
        return modelAndView;
    }
}
