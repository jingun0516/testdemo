package com.example.testdemo.controller.view;

import org.springframework.stereotype.Controller;

@Controller
public class MainViewController {

    public String getMainView() {
        return "index";
    }
}
