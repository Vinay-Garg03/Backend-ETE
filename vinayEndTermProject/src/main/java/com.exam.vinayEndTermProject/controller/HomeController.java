package com.exam.vinayEndTermProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllDetails(Model model) {
        return "firstPage";
    }
    @RequestMapping("/firstPage.html")
    public String getAll(Model model) {
        return "firstPage";
    }
    @RequestMapping("/secondPage.html")
    public String getDetail(Model model) {
        return "secondPage";
    }
}
