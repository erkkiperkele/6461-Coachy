package com.erkkiperkele.coachy.Model.Entities;

import java.util.Date;

public class Coach {

    public int Id;

    public String Name;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public Coach() {
        Id = (int) new Date().getTime();
    }

    public Coach(String name) {
        Id = (int) new Date().getTime();
        Name = name;
    }
}
