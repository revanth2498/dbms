package com.example.Dbms.repository;

import com.example.Dbms.model.Athletes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AthleteRepository extends JpaRepository<Athletes, Integer> {
    // You can add custom queries here if needed
    List<Athletes> findByName(String name);
}
