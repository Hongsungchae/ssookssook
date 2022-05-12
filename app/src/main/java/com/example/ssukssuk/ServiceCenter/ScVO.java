package com.example.ssukssuk.ServiceCenter;

public class ScVO {

    private int num;
    private String title;
    private String post;
    private String date;
    private String writer;

    public ScVO(){}

    //constructor
    public ScVO(String writer, String title, String date) {
        this.title = title;
        this.date = date;
        this.writer = writer;
    }

    public ScVO(String title, String post, String date, String writer) {
        this.title = title;
        this.post = post;
        this.date = date;
        this.writer = writer;
    }

    public ScVO(int num, String title, String date) {
        this.num = num;
        this.title = title;
        this.date = date;
    }

    //toString()


    @Override
    public String toString() {
        return "ScVO{" +
                "title='" + title + '\'' +
                ", post='" + post + '\'' +
                ", date='" + date + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }

    //Getter
    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getWriter() {
        return writer;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}