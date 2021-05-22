package com.etek.dataservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity(name = "customers")
public class Customer {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String address ;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "customerid")
    private List<Vehicle> vehicles;
}
