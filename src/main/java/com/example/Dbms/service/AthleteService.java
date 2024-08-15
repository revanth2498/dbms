package com.example.Dbms.service;

import com.example.Dbms.repository.AthleteRepository;
import com.example.Dbms.model.Athletes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteService {

    @Autowired
    private AthleteRepository athleteRepository;

    public List<Athletes> getAthletes() {
    return athleteRepository.findAll();
    }

    public List<Athletes> getAthletesByName(String name) {
        return athleteRepository.findByName(name);
    }

    public String addAthlete(Athletes athlete) {
        return athleteRepository.save(athlete).toString();

    }


    // Service methods using the repository
}
