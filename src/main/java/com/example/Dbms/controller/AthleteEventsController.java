package com.example.Dbms.controller;

import com.example.Dbms.model.Ahevents;
import com.example.Dbms.model.FormData;
import com.example.Dbms.service.AthleteEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("athleteEvents")
public class AthleteEventsController {



    @Autowired
    private AthleteEventsService athleteEventsService;

    @GetMapping("/all")
    public ResponseEntity<List<Ahevents>> getAthletesEvents( @RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "20") int size){
        return athleteEventsService.getAllEvents(page,size);

    }

    @PostMapping("/create")
    public void readFromPostManEvent(@RequestBody Ahevents atheleteEvent){
        System.out.println(atheleteEvent);
    }


//    @GetMapping("name/{name}")
//    public List<AthleteEvents> getAthletesByName(@PathVariable String name){
//       return athleteEventsService.getAthletesByName(name);
//    }

    @GetMapping("/name/{name}")
    public List<Ahevents> getAthleteEventsByName(@PathVariable String name){
        return athleteEventsService.getEventsByName(name);
    }

//    public ResponseEntity<List<Ahevents>> getAthletesEventsByFields(@RequestBody String formData){
//        System.out.println(formData);
//
//    }


    @GetMapping("/sendForm")
    public ResponseEntity<List<Ahevents>> getAthletesEventsByFields(@RequestBody FormData formData){
        String a=formData.getCity();
        String b=formData.getName();
        String c=formData.getNoc();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(athleteEventsService.getEventsByFields(formData));
        return athleteEventsService.getEventsByFields(formData);

    }

    @PostMapping("/ahevents")
    public ResponseEntity<Ahevents> createAhevents(@RequestBody Ahevents ahevents) {
        Ahevents savedAhevents = athleteEventsService.saveAhevents(ahevents);
        return new ResponseEntity<>(savedAhevents, HttpStatus.CREATED);
    }

}
