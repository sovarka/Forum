package ru.startandroid.newforum.model;

public class Message {
    public String text;
    public String author;
    public String date;

    public Message(String text, String author, String date) {
        this.text = text;
        this.author = author;
        this.date = date;
    }
}
