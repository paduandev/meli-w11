package br.com.meli.starwars.exceptions;

import java.time.LocalDate;

public class PersonNotFoundExDetails {
    private String title;
    private int status;
    private String details;
    private LocalDate timestamp;

    public PersonNotFoundExDetails(String title, int status, String details, LocalDate timestamp) {
        this.title = title;
        this.status = status;
        this.details = details;
        this.timestamp = timestamp;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public LocalDate getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }    
}
