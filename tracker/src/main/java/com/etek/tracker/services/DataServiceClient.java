package com.etek.tracker.services;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "dataservice")
@RibbonClient(name = "dataservice")
public interface DataServiceClient {
    @GetMapping("/updateStatus/{vehicleid}/{status}")
    String updateStatus(@PathVariable("vehicleid") String vehicleid, @PathVariable("status") String status);

    @GetMapping("/customers")
    String getCustomers();


    @GetMapping("/vehicles/disconnected")
    List<String> getdisconnectedVehicles();
}
