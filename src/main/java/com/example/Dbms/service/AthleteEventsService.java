package com.example.Dbms.service;

import com.example.Dbms.model.Ahevents;
import com.example.Dbms.model.FormData;
import com.example.Dbms.repository.AthleteEventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteEventsService {

    @Autowired
    private AthleteEventsRepository athleteEventsRepository;
    public ResponseEntity<List<Ahevents>> getAllEvents(int page, int size)
    {
        Pageable pageable = PageRequest.of(page, size);
        List<Ahevents> events = athleteEventsRepository.findAll(pageable).getContent();
        System.out.println(events);
        return new ResponseEntity<>(events, HttpStatus.OK);

    }


    public List<Ahevents> getEventsByName(String name) {
        System.out.println(athleteEventsRepository.findByName(name));
        return athleteEventsRepository.findByName(name);
    }

    public ResponseEntity<List<Ahevents>> getEventsByFields(FormData formData) {
        String noc=formData.getNoc();
        String sport =formData.getSport();
        return new ResponseEntity<>(athleteEventsRepository.getEventsByFields(noc,sport),HttpStatus.OK);

    }

    public Ahevents saveAhevents(Ahevents ahevents) {
        return athleteEventsRepository.save(ahevents);

    }
}
