package com.example.testdemo.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainViewController {

    @ModelAttribute("layout")
    public String layout() {
        return "layout/default";
    }

    @GetMapping("/")
    public String getMainView(Model model) {
        model.addAttribute("pageTitle", "Main View");

        return "index";
    }

    @GetMapping("/temp")
    public String getTempView(Model model) {
        model.addAttribute("pageTitle", "Temp View");
        return "temp";
    }
}
