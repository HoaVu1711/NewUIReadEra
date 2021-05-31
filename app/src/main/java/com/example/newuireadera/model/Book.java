package com.example.newuireadera.model;

public class Book {
    private int imgAvatar;
    private String tvName;
    private String tvAuthor;
    private String tvDescribe;

    public Book(int mAvatar, String tvName, String tvAuthor, String tvDescribe) {
        this.imgAvatar = mAvatar;
        this.tvName = tvName;
        this.tvAuthor = tvAuthor;
        this.tvDescribe = tvDescribe;
    }

    public int getAvatar() {
        return imgAvatar;
    }

    public void setAvatar(int mAvatar) {
        this.imgAvatar = mAvatar;
    }

    public String getName() {
        return tvName;
    }

    public void setName(String tvName) {
        this.tvName = tvName;
    }

    public String getAuthor() {
        return tvAuthor;
    }

    public void setAuthor(String tvAuthor) {
        this.tvAuthor = tvAuthor;
    }

    public String getDescribe() {
        return tvDescribe;
    }

    public void setDescribe(String tvDescribe) {
        this.tvDescribe = tvDescribe;
    }
}
