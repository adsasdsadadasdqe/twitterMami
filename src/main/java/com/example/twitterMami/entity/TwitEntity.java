package com.example.twitterMami.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TwitEntity {

    @Id
    @GeneratedValue()
    private Integer id;
    private String twitt;


    public TwitEntity(){

    }

    public TwitEntity(String twitt){
        super();
        this.twitt=twitt;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTwitt() {
        return twitt;
    }

    public void setTwitt(String twitt) {
        this.twitt = twitt;
    }

    @Override
    public String toString() {
        return "Twitt" + twitt;
    }
}
