package com.etek.tracker.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {
    @GetMapping("/")
    public String getindexPage(){
        return "index";
    }
}
