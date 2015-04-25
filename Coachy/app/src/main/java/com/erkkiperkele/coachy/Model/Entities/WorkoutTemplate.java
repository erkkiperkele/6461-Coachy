package com.erkkiperkele.coachy.Model.Entities;

import java.util.Date;

public class WorkoutTemplate {

    private int Id;

    public int getId() {
        return Id;
    }

    //Number of laps for the session
    //Set to 0 for a never ending session
    private int LapsObjective;

    //Duration of session in seconds
    private int DurationObjectiveInS;

    //Shortest Lap time allowed for a session in ms
    private int MinLapTimeInS;

    //Lap time for the 1st lap of the session in ms
    private int MaxLapTimeInS;

    //Percentage by which to decrease the lap time each step
    //Values from 0 to 1
    //(until it reaches the MinLapTimeInMs)
    private double LapIncrementStep;

    //Distance of a lap in meters
    private double LapDistanceInM;

    public int getLapsObjective() {

        return LapsObjective;
    }

    public void setLapsObjective(int lapsObjective) {
        LapsObjective = lapsObjective;
    }

    public int getDurationObjectiveInS() {
        return DurationObjectiveInS;
    }

    public void setDurationObjectiveInS(int durationObjectiveInS) {
        DurationObjectiveInS = durationObjectiveInS;
    }

    public int getMinLapTimeInS() {
        return MinLapTimeInS;
    }

    public void setMinLapTimeInS(int minLapTimeInS) {
        MinLapTimeInS = minLapTimeInS;
    }

    public int getMaxLapTimeInS() {
        return MaxLapTimeInS;
    }

    public void setMaxLapTimeInS(int maxLapTimeInS) {
        MaxLapTimeInS = maxLapTimeInS;
    }

    public double getLapIncrementStep() {
        return LapIncrementStep;
    }

    public void setLapIncrementStep(double lapIncrementStep) {
        LapIncrementStep = lapIncrementStep;
    }

    public double getLapDistanceInM() {
        return LapDistanceInM;
    }

    public void setLapDistanceInM(double lapDistanceInM) {
        LapDistanceInM = lapDistanceInM;
    }


    public WorkoutTemplate() {
        Id = (int) new Date().getTime();
        LapsObjective = 10;
        DurationObjectiveInS = 0;
        MinLapTimeInS = 30;
        MaxLapTimeInS = 60;
        LapIncrementStep = .1;
        LapDistanceInM = 200;
    }

    public WorkoutTemplate(int lapsObjective, int durationObjectiveInS, int minLapTimeInS, int maxLapTimeInS, double lapIncrementStep, double lapDistanceInM) {
        Id = (int) new Date().getTime();
        LapsObjective = lapsObjective;
        DurationObjectiveInS = durationObjectiveInS;
        MinLapTimeInS = minLapTimeInS;
        MaxLapTimeInS = maxLapTimeInS;
        LapIncrementStep = lapIncrementStep;
        LapDistanceInM = lapDistanceInM;
    }
}
