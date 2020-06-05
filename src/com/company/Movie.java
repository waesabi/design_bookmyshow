package com.company;

import java.util.Date;
import java.util.List;

public class Movie {
    private String name;
    private Date releaseDate;
    private Double duration;
    private List<String> genres;
    private Admin AddedBy;
    private List<Show> shows;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Admin getAddedBy() {
        return AddedBy;
    }

    public void setAddedBy(Admin addedBy) {
        AddedBy = addedBy;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
