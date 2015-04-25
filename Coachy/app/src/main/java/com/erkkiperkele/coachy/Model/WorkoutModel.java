package com.erkkiperkele.coachy.Model;

import com.erkkiperkele.coachy.Model.Entities.RunnerWorkout;
import com.erkkiperkele.coachy.Model.Entities.WorkoutSession;
import com.erkkiperkele.coachy.Model.Entities.WorkoutTemplate;

public class WorkoutModel {
    private DataAccessLayer _dataAccessLayer;

    public WorkoutModel(){
        _dataAccessLayer = new DataAccessLayer();
    }

    public void addLap(int workoutSessionId)
    {

    }


    public WorkoutSession getWorkoutSession(int workoutSessionId){
       return _dataAccessLayer.getWorkoutSession(workoutSessionId);
    }

    public void addWorkoutSession(WorkoutSession workoutSession){
        _dataAccessLayer.insertWorkoutSession(workoutSession);

    }

    public void updateWorkoutSession(WorkoutSession workoutSession){
        _dataAccessLayer.updateWorkoutSession(workoutSession);
    }

    public void deleteWorkoutSession(int workoutSessionId){
        _dataAccessLayer.deleteWorkoutSession(workoutSessionId);
    }

    public WorkoutSession getWorkoutSessionByRunnerWoId(int runnerWorkoutId) {
        RunnerWorkout runnerWorkout = getRunnerWorkout(runnerWorkoutId);
        return getWorkoutSession(runnerWorkout.getWorkoutSessionId());
    }

    public RunnerWorkout getRunnerWorkout(int runnerWorkoutId){
       return _dataAccessLayer.getRunnerWorkout(runnerWorkoutId);
    }

    public void addRunnerWorkout(RunnerWorkout runnerWorkout){
        _dataAccessLayer.insertRunnerWorkout(runnerWorkout);
    }

    public void updateRunnerWorkout(RunnerWorkout runnerWorkout) {
        _dataAccessLayer.updateRunnerWorkout(runnerWorkout);
    }
    public void deleteRunnerWorkout(int runnerWorkoutId){
        _dataAccessLayer.deleteRunnerWorkout(runnerWorkoutId);
    }

    public WorkoutTemplate getWorkoutTemplate(int workoutTemplateId){
        return _dataAccessLayer.getWorkoutTemplate(workoutTemplateId);
    }

    public void addWorkoutTemplate(WorkoutTemplate workoutTemplate){
        _dataAccessLayer.insertWorkoutTemplate(workoutTemplate);

    }
    public void updateWorkoutTemplate(WorkoutTemplate workoutTemplate){
        _dataAccessLayer.updateWorkoutTemplate(workoutTemplate);

    }
    public void deleteWorkoutTemplate(int workoutTemplateId){
        _dataAccessLayer.deleteWorkoutTemplate(workoutTemplateId);
    }
}
