package com.etek.dataservice.controller;

import com.etek.dataservice.service.CustomerService;
import com.etek.dataservice.service.VehicleService;
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
    VehicleService vehicleService;

    @Autowired
    CustomerService customerService;

    @GetMapping("/updateStatus/{vehicleid}/{status}")
    public String updateStatus(@PathVariable("vehicleid") String vehicleid,@PathVariable("status") String status) {
        vehicleService.updateVehicleStatus(vehicleid,status);
        return "success";
    }

    @GetMapping("/customers")
    public Object getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/vehicles/disconnected")
    public Object getdisconnectedVehicles(){
        return vehicleService.getDisconnectedVehicles();
    }

}
