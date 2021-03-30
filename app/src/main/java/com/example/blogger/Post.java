package com.example.blogger;

import java.util.Date;

public class Post {

    private  String title;
    private String description;
    private String tag;
    private Date date;
    private  String authorName;

    public Post(String title, String description, String tag, Date date, String  authorName) {
        this.title = title;
        this.description = description;
        this.tag = tag;
        this.date = date;
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTag() {
        return tag;
    }

    public Date getDate() {
        return date;
    }
}
