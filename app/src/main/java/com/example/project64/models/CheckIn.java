package com.example.project64.models;

import java.util.Date;

public class CheckIn {
    int id;

    public CheckIn(int id, String user1, Date date) {
        this.id = id;
        username=user1;
        this.time=date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    String userid;
    Date time;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    String username;

}
