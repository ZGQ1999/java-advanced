package com.java.util;

import java.util.Date;

/**
 * created by 国庆
 * 2019.03.18
 */

public class Article {
    private Integer id;
    private String title;
    private String author;
    private java.util.Date writeTime;

    public Article(Integer id, String title, String author, java.util.Date writeTime) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.writeTime = writeTime;
    }

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public java.util.Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", writeTime=" + writeTime +
                '}';
    }
}
