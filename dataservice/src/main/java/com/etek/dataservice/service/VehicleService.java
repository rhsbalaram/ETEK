package com.etek.dataservice.service;

import com.etek.dataservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;
    public void updateVehicleStatus(String vehicleid, String status){
        vehicleRepository.updateVehicleStatusAndTime(status, LocalDateTime.now(), vehicleid);
    }

    public List<String> getDisconnectedVehicles(){
        return vehicleRepository.findIdByUpdationLessThan(LocalDateTime.now().minusSeconds(35));
    }
}
