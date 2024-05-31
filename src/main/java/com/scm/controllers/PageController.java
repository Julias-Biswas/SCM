package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/home")  
    public String homePage(Model model) {
        System.out.println("Home page loading...");

        // sending data to view
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("channel", "Learn Code With Julias");
        model.addAttribute("github_repo", "https://github.com/julias-biswas");
        
        return "home";
    }

    // About
    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", false);
        System.out.println("About page loading...");
        return "about";
    }

    // Services
    @GetMapping("/services")
    public String servicePage() {
        System.out.println("Services page loading...");
        return "services";
    }

}
