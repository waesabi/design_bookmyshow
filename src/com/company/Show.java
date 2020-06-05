package com.company;

import javax.swing.*;
import java.util.Date;
import java.util.List;

public class Show {
    private int id;
    private Date startTime;
    private Date endTime;
    private List<ShowSeat> seats;
    private Movie movie;
    private CinemaHall playedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<ShowSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<ShowSeat> seats) {
        this.seats = seats;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public CinemaHall getPlayedAt() {
        return playedAt;
    }

    public void setPlayedAt(CinemaHall playedAt) {
        this.playedAt = playedAt;
    }
}
