package com.etek.dataservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TraceService {
    @Autowired
    TraceServiceClient traceServiceClient;
    @Async
    public void pingTrace(String id){
        traceServiceClient.pingTrace(id);
    }

}
