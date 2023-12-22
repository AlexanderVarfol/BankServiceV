package com.bankservice.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping({"/home", "/"})
    public String home() {
        return "index-home";
    }

    @GetMapping("/home/Bank")
    public String photo() {
        return "index-photo";
    }

    @GetMapping("/swagger")
    public String swagger() {
        return "redirect:/swagger-ui/index.html";
    }
}
