package com.erkkiperkele.coachy.Model.Entities;

public class RunnerLap {
    private double DistanceInM;
    private double LengthInMs;

    public double getDistanceInM() {
        return DistanceInM;
    }

    public void setDistanceInM(double distanceInM) {
        DistanceInM = distanceInM;
    }

    public double getLengthInMs() {
        return LengthInMs;
    }

    public void setLengthInMs(double lengthInMs) {
        LengthInMs = lengthInMs;
    }

    public RunnerLap(double distanceInM, double lengthInMs) {
        DistanceInM = distanceInM;
        LengthInMs = lengthInMs;
    }
}
