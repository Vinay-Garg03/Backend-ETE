package com.exam.vinayEndTermProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/firstPage.html")
    public String getAllDetails(Model model) {
        return "firstPage";
    }
    @RequestMapping("/secondPage.html")
    public String getDetail(Model model) {
        return "secondPage";
    }
}
