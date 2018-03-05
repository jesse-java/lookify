package com.naldojesse.lookify.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Song implements java.io.Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @Size(min=5)
    private String title;

    @Column
    @Size(min=5)
    private String artist;

    @Column
    private String rating;

    @Column(updatable=false)
    @DateTimeFormat (pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;

    @Column
    @DateTimeFormat (pattern = "MM/dd/yyy HH:mm:ss")
    private Date updatedAt;

    public Song() {

    }

    public Song(String title, String artist, String rating) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
