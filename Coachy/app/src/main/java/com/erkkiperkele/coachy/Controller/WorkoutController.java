package com.erkkiperkele.coachy.Controller;

import com.erkkiperkele.coachy.Model.*;
import com.erkkiperkele.coachy.Model.Entities.Runner;
import com.erkkiperkele.coachy.Model.Entities.RunnerWorkout;
import com.erkkiperkele.coachy.Model.Entities.WorkoutSession;
import com.erkkiperkele.coachy.Model.Entities.WorkoutTemplate;

import java.util.ArrayList;
import java.util.List;

public class WorkoutController {

    private List<Runner> _runners;
    private WorkoutModel _workoutModel;
    private WorkoutSession _workoutSession;

    public WorkoutController() {
        _runners = new ArrayList<Runner>();
        _workoutModel = new WorkoutModel();
        _workoutSession = new WorkoutSession();
    }


    public void createNewWorkout() {
        //Create a new workout with default settings
        throw new NoSuchMethodError();
    }

    public void createNewWorkout(WorkoutTemplate template) {
        //Create a new workout based on the given template settings
        throw new NoSuchMethodError();
    }

    public void updateWorkout(WorkoutTemplate settings) {
        //Update the workout settings
        throw new NoSuchMethodError();
    }

    public void startWorkouts() {
        //Start the workout for all runners
        throw new NoSuchMethodError();
    }

    public void stopWorkout() {
        //Stop all runner's workout
        throw new NoSuchMethodError();
    }

    public void stopRunnerWorkout(int runnerId) {
        //Stop the workout for a particular runner
        throw new NoSuchMethodError();
    }

    public void saveRunnerWorkout(int runnerId) {
        RunnerWorkout runnerWorkout = new RunnerWorkout();
        for (int i = 0; i < _runners.size(); ++i) {
            Runner runner = _runners.get(i);
            if (runner.Id == runnerId) {
                runnerWorkout = runner.CurrentWorkout;
            }
        }

        _workoutModel.updateRunnerWorkout(runnerWorkout);
    }

    public void deleteRunnerWorkout(int runnerWorkoutId) {
        _workoutModel.deleteRunnerWorkout(runnerWorkoutId);
    }

    public void addLap() {
        _workoutModel.addLap(_workoutSession.getId());
    }

    public void addRunner(Runner runner) {
        _runners.add(runner);
    }

    public void removeRunner(Runner runner) {
        _runners.remove(runner);
    }
}
