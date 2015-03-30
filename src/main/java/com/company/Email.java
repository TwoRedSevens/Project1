package com.company;

/**
 * Created by MDB on 30/03/2015.
 */
public class Email {

    private String from;
    private String to;
    private String message;

    public Email() {
    }

    public Email(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    public int charactersInMessage(){
        return message.length();
    }

}
