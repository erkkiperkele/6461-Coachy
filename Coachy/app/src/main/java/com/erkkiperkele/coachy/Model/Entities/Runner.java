package com.erkkiperkele.coachy.Model.Entities;

import java.util.Date;

public class Runner {

    public int Id;

    public String Name;

    public boolean IsRunning;

    public RunnerWorkout CurrentWorkout;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isRunning() {
        return IsRunning;
    }

    public void setRunning(boolean isRunning) {
        IsRunning = isRunning;
    }

    public RunnerWorkout getCurrentWorkout() {
        return CurrentWorkout;
    }

    public void setCurrentWorkout(RunnerWorkout currentWorkout) {
        CurrentWorkout = currentWorkout;
    }

    public Runner(){
        Id = (int) new Date().getTime();
    }

    public Runner(String name, boolean isRunning, RunnerWorkout currentWorkout) {
        Id = (int) new Date().getTime();
        Name = name;
        IsRunning = isRunning;
        CurrentWorkout = currentWorkout;
    }
}
