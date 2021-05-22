package com.etek.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@EnableScheduling
public class DataService {
    @Autowired
    DataServiceClient dataServiceClient;
    @Async
    public void updateStatus(String id){
        dataServiceClient.updateStatus(id, "connected");
    }

    public String getCustomers(){
        return dataServiceClient.getCustomers();
    }


    @Scheduled(cron = "*/30 * * * * ?")
    public void findDisconnetedVehicles(){
        List<String> vehicles = dataServiceClient.getdisconnectedVehicles();
        vehicles.forEach(vid -> dataServiceClient.updateStatus(vid,"disconnected"));
    }

}
