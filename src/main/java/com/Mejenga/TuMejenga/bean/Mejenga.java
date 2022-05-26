package com.Mejenga.TuMejenga.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Mejenga {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Date date;

    public Mejenga(){
    }
    public Mejenga(long id, String name,Date  date) {
        super();
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
