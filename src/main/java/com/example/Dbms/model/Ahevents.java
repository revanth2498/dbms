package com.example.Dbms.model;

import jakarta.persistence.*;

@Entity
public class Ahevents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String sex;
    private int age;
    private String height;
    private String weight;
    private String team;
    private String noc;
    private String games;
    private int year;
    private String season;
    private String city;
    private String sport;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNoc() {
        return noc;
    }

    public void setNoc(String noc) {
        this.noc = noc;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

//    public Athletes getAthlete() {
//        return athlete;
//    }
//
//    public void setAthlete(Athletes athlete) {
//        this.athlete = athlete;
//    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }

    @Override
    public String toString() {
        return "AthleteEvents{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", team='" + team + '\'' +
                ", noc='" + noc + '\'' +
                ", games='" + games + '\'' +
                ", year=" + year +
                ", season='" + season + '\'' +
                ", city='" + city + '\'' +
                ", sport='" + sport + '\'' +
                ", event='" + event + '\'' +
                ", medal='" + medal + '\'' +
                '}';
    }

    //    @ManyToOne
//    @JoinColumn(name = "athletes_id")
//    private Athletes athlete;
    private String event;
    private String medal;

}
