package com.erkkiperkele.coachy.Model;

import java.util.Date;

public class WorkoutSession {
    public int Id;
    public Date SessionDate;

    public WorkoutSession()
    {
        Id = (int) new Date().getTime();
        SessionDate = new Date();
    }
}
