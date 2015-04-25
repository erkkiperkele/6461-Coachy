package com.erkkiperkele.coachy.Model.Entities;

public class RunnerStats {
    private int workoutsCount;
    private int lapsCount;
    private double averageWorkoutLenght;
    private double averageWorkoutDistance;

    public int getWorkoutsCount() {
        return workoutsCount;
    }

    public void setWorkoutsCount(int workoutsCount) {
        this.workoutsCount = workoutsCount;
    }

    public int getLapsCount() {
        return lapsCount;
    }

    public void setLapsCount(int lapsCount) {
        this.lapsCount = lapsCount;
    }

    public double getAverageWorkoutLenght() {
        return averageWorkoutLenght;
    }

    public void setAverageWorkoutLenght(double averageWorkoutLenght) {
        this.averageWorkoutLenght = averageWorkoutLenght;
    }

    public double getAverageWorkoutDistance() {
        return averageWorkoutDistance;
    }

    public void setAverageWorkoutDistance(double averageWorkoutDistance) {
        this.averageWorkoutDistance = averageWorkoutDistance;
    }

    public RunnerStats() {
    }
}
