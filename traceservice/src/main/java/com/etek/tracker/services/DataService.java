package com.etek.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    DataServiceClient dataServiceClient;
    @Async
    public void updateStatus(String id){
        dataServiceClient.updateStatus(id, "connected");
    }
}
