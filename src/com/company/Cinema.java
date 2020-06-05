package com.company;

import java.util.List;

public class Cinema {
    private String name;
    private Address location;
    private int totalCinemaHallsCount;
    private List<CinemaHall> halls;

    public Cinema(String name, Address location, int totalCinemaHallsCount, List<CinemaHall> halls) {
        this.name = name;
        this.location = location;
        this.totalCinemaHallsCount = totalCinemaHallsCount;
        this.halls = halls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public int getTotalCinemaHallsCount() {
        return totalCinemaHallsCount;
    }

    public void setTotalCinemaHallsCount(int totalCinemaHallsCount) {
        this.totalCinemaHallsCount = totalCinemaHallsCount;
    }

    public List<CinemaHall> getHalls() {
        return halls;
    }

    public void setHalls(List<CinemaHall> halls) {
        this.halls = halls;
    }
}
