package ru.startandroid.newforum.model;

public class Theme {
    private String title;
    private String lastAuthor;
    private String date;
    private int answersCount;
    private boolean isRead;

    public Theme(String title, String lastAuthor, String date, int answersCount, boolean isRead) {
        this.title = title;
        this.lastAuthor = lastAuthor;
        this.date = date;
        this.answersCount = answersCount;
        this.isRead = isRead;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLastAuthor(String lastAuthor) {
        this.lastAuthor = lastAuthor;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAnswersCount(int answersCount) {
        this.answersCount = answersCount;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getTitle() {

        return title;
    }

    public String getLastAuthor() {
        return lastAuthor;
    }

    public String getDate() {
        return date;
    }

    public int getAnswersCount() {
        return answersCount;
    }

    public boolean isRead() {
        return isRead;
    }
}
