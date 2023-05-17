package com.example.animals2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title","Главная страница сайта");
        return "home";
    }
    @GetMapping("/add-post")
    public String addPost(Model model) {
        model.addAttribute("title", "Добавление объявлений");
        return "add-post";
    }
}

