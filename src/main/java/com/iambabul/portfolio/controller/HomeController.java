package com.iambabul.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to spring boot project";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact page is under construction";
    }

    @GetMapping("/about")
    public String about() {
        return "About page is under construction";
    }
}
