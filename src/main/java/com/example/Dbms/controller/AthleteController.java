package com.example.Dbms.controller;

import com.example.Dbms.model.Athletes;
import com.example.Dbms.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/athletes")
public class AthleteController {

    @Autowired
    private AthleteService athleteService;


    @PostMapping("/create")
    public void readFromPostMan(@RequestBody Athletes athelete){
        System.out.println(athelete);
    }

    @GetMapping("/all")
    public List<Athletes> getAthletes(){
        return athleteService.getAthletes();

    }

    @GetMapping("name/{name}")
    public List<Athletes> getAthletesByName(@PathVariable String name){
        return athleteService.getAthletesByName(name);
    }

    @PostMapping("createAthlete")
    public String addAthlete(@RequestBody Athletes athlete){
      return athleteService.addAthlete(athlete);
    }

    // Controller methods to handle HTTP requests
}
