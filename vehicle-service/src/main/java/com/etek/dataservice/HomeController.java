package com.etek.dataservice;

import com.etek.dataservice.services.TraceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Random;

@RestController
public class HomeController {

    private final static Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    TraceService traceService;

    @GetMapping("/test/{id}")
    public String trace(@PathVariable(name = "id") String id) {
        traceService.pingTrace(id);
        return "success";
    }

    @Scheduled(cron = "*/30 * * * * ?")
    public void pingtrace(){
        String[] vids = {"YS2R4X20005399401","VLUR4X20009093588",  "VLUR4X20009048066", "YS2R4X20005388011",  "YS2R4X20005387949", "VLUR4X20009048067", "YS2R4X20005387055"};
        Arrays.stream(vids).forEach(vid -> {
            Random random = new Random();
            if (random.nextBoolean()){
                traceService.pingTrace(vid);
            }
        });
    }
}
