package com.erkkiperkele.coachy.Model.Entities;

import java.util.Date;

public class WorkoutSession {
    private int Id;
    private Date SessionDate;

    public int getId() {
        return Id;
    }

    public Date getSessionDate() {
        return SessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        SessionDate = sessionDate;
    }

    public WorkoutSession() {
        Id = (int) new Date().getTime();
        SessionDate = new Date();
    }
}
