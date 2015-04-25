package com.erkkiperkele.coachy.Model.Entities;

import java.util.Date;
import java.util.List;

public class RunnerWorkout {

    private int Id;
    private Date StartedOn;
    private Date EndedOn;
    private int WorkoutSessionId;
    private List<RunnerLap> Laps;
    private double LapDistanceInM;
    private double CurrentLapLengthInMs;
    private double LapStep;

    public double getLapDistanceInM() {
        return LapDistanceInM;
    }

    public void setLapDistanceInM(double lapDistanceInM) {
        LapDistanceInM = lapDistanceInM;
    }

    public double getCurrentLapLengthInMs() {
        return CurrentLapLengthInMs;
    }

    public void setCurrentLapLengthInMs(double currentLapLengthInMs) {
        CurrentLapLengthInMs = currentLapLengthInMs;
    }

    public List<RunnerLap> getLaps() {
        return Laps;
    }

    public void setLaps(List<RunnerLap> laps) {
        Laps = laps;
    }

    public int getRunnerId() {
        return RunnerId;
    }

    public void setRunnerId(int runnerId) {
        RunnerId = runnerId;
    }

    private int RunnerId;

    public int getId() {
        return Id;
    }

    public Date getStartedOn() {
        return StartedOn;
    }

    public void setStartedOn(Date startedOn) {
        StartedOn = startedOn;
    }

    public Date getEndedOn() {
        return EndedOn;
    }

    public void setEndedOn(Date endedOn) {
        EndedOn = endedOn;
    }

    public int getWorkoutSessionId() {
        return WorkoutSessionId;
    }

    public void setWorkoutSessionId(int workoutSessionId) {
        WorkoutSessionId = workoutSessionId;
    }

    public RunnerWorkout(int workoutSessionId, int runnerId, double lapDistanceInM, double initialLapLengthInMs, double lapStep) {
        Id = (int) new Date().getTime();
        StartedOn = new Date();
        WorkoutSessionId = workoutSessionId;
        RunnerId = runnerId;
        LapDistanceInM = lapDistanceInM;
        CurrentLapLengthInMs = initialLapLengthInMs;
        LapStep = lapStep;
    }

    public RunnerWorkout() {

    }

    public void addLap() {
        RunnerLap runnerLap = new RunnerLap(LapDistanceInM, CurrentLapLengthInMs);
        Laps.add(runnerLap);

        CurrentLapLengthInMs *= LapStep;
    }

    public boolean isOver() {
        return EndedOn != null;
    }

    public int getLapCount(){
        return Laps.size();
    }

    public double getDistanceRan(){
        return Laps.size() * LapDistanceInM;
    }

    public double getLengthInMs(){
        return (double)(EndedOn.getTime() - StartedOn.getTime());
    }
}
