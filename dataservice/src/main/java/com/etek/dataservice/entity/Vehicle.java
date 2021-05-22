package com.etek.dataservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity(name = "vehicles")
public class Vehicle {
    @Id
    private String id;
    @Column
    private String regno;
    @Column
    private String status;
    @Column
    private LocalDateTime updation;

}
