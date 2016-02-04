package com.example.paulac.moneytracker.Database;

/**
 * Created by paulac on 2/4/16.
 */
public class DataProvider {
    private String category;
    private String amount;
    private String note;
    private String date;
    private String event;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public DataProvider(String category, String amount, String note, String date, String event, String location){
        this.category = category;
        this.amount = amount;
        this.note = note;
        this.date = date;
        this.event = event;
        this.location = location;
    }

}
