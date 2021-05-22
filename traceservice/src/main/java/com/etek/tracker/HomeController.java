package com.etek.tracker;

import com.etek.tracker.services.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final static Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    DataService dataService;

    @GetMapping("/trace/{id}")
    public String pingTrace(@PathVariable("id") String id) {
         dataService.updateStatus(id);
         return "success";
    }
}
