package com.etek.dataservice.services;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "traceservice")
@RibbonClient(name = "traceservice")
public interface TraceServiceClient {
    @GetMapping("/trace/{id}")
    String pingTrace(@PathVariable("id") String id);
}
