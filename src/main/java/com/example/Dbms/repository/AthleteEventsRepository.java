package com.example.Dbms.repository;
import com.example.Dbms.model.Ahevents;
import com.example.Dbms.model.FormData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AthleteEventsRepository extends JpaRepository<Ahevents, Integer> {
    List<Ahevents> findByName(String name);


    @Query(value="select * from ahevents a where a.noc=:noc and a.sport=:sport",nativeQuery = true)
    List<Ahevents> getEventsByFields(String noc,String sport);

    //List<AthleteEvents> findByName(String name);
}