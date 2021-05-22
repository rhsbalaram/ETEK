package com.etek.dataservice.repository;

import com.etek.dataservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    @Modifying
    @Query(value = "update vehicles   set status =:status, updation =:date  where id =:vehicleid", nativeQuery = true)
    int updateVehicleStatusAndTime(@Param("status") String status, @Param("date") LocalDateTime date, @Param("vehicleid") String vehicleid);

    @Query(value = "select id from vehicles  where updation <=:updation or updation is null", nativeQuery = true)
    List<String> findIdByUpdationLessThan(@Param("updation") LocalDateTime updation);
}
