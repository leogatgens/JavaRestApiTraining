package com.Mejenga.TuMejenga.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity// (name = "Mejenga")
public class Course {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String author;

    public Course(){
    }
    public Course(long id, String name,String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString(){
        return "Course [id = " + getId() + ", name=" + getName() + ", " + getAuthor() + "]";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
