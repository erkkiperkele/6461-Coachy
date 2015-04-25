package com.erkkiperkele.coachy.Model.DAL;

import com.erkkiperkele.coachy.Model.Entities.Runner;
import com.erkkiperkele.coachy.Model.Entities.RunnerWorkout;
import com.erkkiperkele.coachy.Model.Entities.WorkoutSession;
import com.erkkiperkele.coachy.Model.Entities.WorkoutTemplate;

import java.util.ArrayList;
import java.util.List;

// Simple class to access data at its lowest level. Sql scripts would go here.
public class WorkoutDataAccessLayer {

    private List<WorkoutSession> _workoutSessions = new ArrayList<WorkoutSession>();
    private List<WorkoutTemplate> _workoutTemplates = new ArrayList<WorkoutTemplate>();
    private List<RunnerWorkout> _runnerWorkouts = new ArrayList<RunnerWorkout>();

    public WorkoutDataAccessLayer() {
        //TODO: Read entities from file or initialize DB connection.
    }

    public WorkoutSession getWorkoutSession(int id) {
        for (WorkoutSession wo : _workoutSessions) {
            if (wo.getId() == id) {
                return wo;
            }
        }
        return null;
    }

    public void insertRunnerWorkout(RunnerWorkout runnerWorkout) {
        _runnerWorkouts.add(runnerWorkout);
    }

    public void insertWorkoutSession(WorkoutSession workoutSession) {
        _workoutSessions.add(workoutSession);
    }

    public void updateWorkoutSession(WorkoutSession workoutSession) {

        for (WorkoutSession currentWorkoutSession : _workoutSessions) {
            if (currentWorkoutSession.getId() == workoutSession.getId()) {
                int index = _workoutSessions.indexOf(currentWorkoutSession);
                _workoutSessions.set(index, workoutSession);
                break;
            }
        }
    }

    public void deleteWorkoutSession(int workoutSessionToDelete) {
        for (WorkoutSession currentWorkoutSession : _workoutSessions) {
            if (currentWorkoutSession.getId() == workoutSessionToDelete) {
                int index = _workoutSessions.indexOf(currentWorkoutSession);
                _workoutSessions.remove(index);
                break;
            }
        }
    }

    public RunnerWorkout getRunnerWorkout(int runnerWorkoutId) {
        for (RunnerWorkout rw : _runnerWorkouts) {
            if (rw.getId() == runnerWorkoutId) {
                return rw;
            }
        }
        return null;
    }

    public void updateRunnerWorkout(RunnerWorkout runnerWorkout) {
        for (RunnerWorkout current : _runnerWorkouts) {
            if (current.getId() == runnerWorkout.getId()) {
                int index = _runnerWorkouts.indexOf(current);
                _runnerWorkouts.set(index, runnerWorkout);
                break;
            }
        }
    }

    public void deleteRunnerWorkout(int runnerWorkoutToDelete) {
        for (RunnerWorkout runnerWorkout: _runnerWorkouts){
            if (runnerWorkout.getId() == runnerWorkoutToDelete)
            {
                _runnerWorkouts.remove(runnerWorkout);
                break;
            }
        }
    }

    public WorkoutTemplate getWorkoutTemplate(int workoutTemplateId) {
        for (WorkoutTemplate wt:_workoutTemplates)
        {
            if (wt.getId() == workoutTemplateId){
                return wt;
            }
        }
        return null;
    }

    public void insertWorkoutTemplate(WorkoutTemplate workoutTemplate) {
        _workoutTemplates.add(workoutTemplate);
    }

    public void updateWorkoutTemplate(WorkoutTemplate workoutTemplate) {
        for (WorkoutTemplate wt:_workoutTemplates){
            if (wt.getId() == workoutTemplate.getId()){
                int index = _workoutTemplates.indexOf(wt);
                _workoutTemplates.set(index, workoutTemplate);
            }
        }
    }

    public void deleteWorkoutTemplate(int workoutTemplateToDelete) {
        for (WorkoutTemplate wt: _workoutTemplates){
            if (wt.getId() == workoutTemplateToDelete){
                _workoutTemplates.remove(wt);
            }
        }
    }
}
