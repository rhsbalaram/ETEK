package com.etek.dataservice.repository;

import com.etek.dataservice.entity.Customer;
import com.etek.dataservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
@Transactional
public interface CustomerRepository extends JpaRepository<Customer,String> {
    }
