package com.codeflix.mscatalog.domain.entity;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

public class Video extends BaseEntity {
    private String title;
    private String description;
    private Integer yearLauched;
    private Boolean opened;
    private String rating;
    private Float duration;

    // public Videp() {}

    public Video(UUID id, String title, String description, Integer yearLauched, Boolean opened) {
        super.setId(id);
        this.title = title;
        this.description = description;
        this.yearLauched = yearLauched;
        this.opened = opened;
    }
    
    public Video(String title, String description, Integer yearLauched, Boolean opened) {
        super.generateUuid();
        this.title = title;
        this.description = description;
        this.yearLauched = yearLauched;
        this.opened = opened;
    }

    public Video(String title, String description, Integer yearLauched, Boolean opened, String rating, Float duration) {
        super.generateUuid();
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLauched(yearLauched);
        this.setOpened(opened);
        this.setRating(rating);
        this.setDuration(duration);
    }
    
    public Video(String title, String description, Integer yearLauched, Float duration) {
        super.generateUuid();
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLauched(yearLauched);
        this.setDuration(duration);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null)
            throw new IllegalArgumentException("Name cannot be null");

        if (title.length() < 0)
            throw new IllegalArgumentException("Name must be at least 0 characters long");

        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYearLauched() {
        return yearLauched;
    }

    public void setYearLauched(Integer yearLauched) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if(yearLauched > currentYear)
            throw new IllegalArgumentException("The release year cannot be greater than the current year");

        this.yearLauched = yearLauched;
    }

    public Boolean getOpened() {
        return opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        this.duration = Float.valueOf(decimalFormat.format(duration));
        this.duration = duration;
    }

}
