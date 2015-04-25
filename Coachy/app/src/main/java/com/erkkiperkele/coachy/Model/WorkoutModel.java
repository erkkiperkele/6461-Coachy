package com.erkkiperkele.coachy.Model;

import com.erkkiperkele.coachy.Model.Entities.RunnerWorkout;
import com.erkkiperkele.coachy.Model.Entities.WorkoutSession;

public class WorkoutModel {
    private DataAccessLayer _dataAccessLayer;

    public WorkoutModel(){
        _dataAccessLayer = new DataAccessLayer();
    }

    public void addLap(int sessionId)
    {

    }

    public int getRunnerWorkoutSessionId(int sessionId, int runnerId) {
        return -1;
    }

    public void deleteRunnerWo(int runnerWoId) {

    }

    public void saveRunnerWorkout(RunnerWorkout runnerWorkout) {
        _dataAccessLayer.insertRunnerWorkout(runnerWorkout);
    }


    public WorkoutSession getWoSession(int workoutSessionId){
       return _dataAccessLayer.getWoSession(workoutSessionId);
    }

    public void addWoSession(WorkoutSession workoutSession){
        _dataAccessLayer.insertWorkoutSession(workoutSession);

    }

    public void updateWoSession(WorkoutSession workoutSession){
        _dataAccessLayer.updateWorkoutSession(workoutSession);
    }

    public void deleteWoSession(int workoutSessionId){
        _dataAccessLayer.deleteWorkoutSession(workoutSessionId);
    }

    public RunnerWorkout getRunnerWo(int runnerWorkoutId){
       return _dataAccessLayer.getRunnerWorkout(runnerWorkoutId);
    }

    public void addRunnerWo(){

    }
    public void updateRunnerWo(){

    }
    public void deleteRunnerWo(){

    }

    public void getWoTemplate(){

    }
    public void addWoTemplate(){

    }
    public void updateWoTemplate(){

    }
    public void deleteWoTemplate(){

    }
}
