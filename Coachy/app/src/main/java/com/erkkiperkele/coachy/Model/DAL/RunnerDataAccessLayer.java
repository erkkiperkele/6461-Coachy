package com.erkkiperkele.coachy.Model.DAL;

import com.erkkiperkele.coachy.Model.Entities.Coach;
import com.erkkiperkele.coachy.Model.Entities.Runner;
import com.erkkiperkele.coachy.Model.Entities.RunnerStats;
import com.erkkiperkele.coachy.Model.Entities.RunnerTeam;
import com.erkkiperkele.coachy.Model.Entities.RunnerWorkout;
import com.erkkiperkele.coachy.Model.Entities.TeamStats;

import java.util.ArrayList;
import java.util.List;

public class RunnerDataAccessLayer {
    private List<Runner> _runners = new ArrayList<Runner>();

    public RunnerDataAccessLayer() {
        //TODO: Read entities from file or initialize DB connection.
    }


    public Runner getRunner(int runnerId) {
        throw new NoSuchMethodError();
    }

    public void insertRunner(Runner runner) {
        throw new NoSuchMethodError();
    }

    public void updateRunner(Runner runner) {
        throw new NoSuchMethodError();
    }

    public void deleteRunner(int runnerId) {
        throw new NoSuchMethodError();
    }

    public Coach getCoach(int coachId) {
        throw new NoSuchMethodError();
    }

    public void insertCoach(Coach coach) {
        throw new NoSuchMethodError();
    }

    public void updateCoach(Coach coach) {
        throw new NoSuchMethodError();
    }

    public void deleteCoach(int coachId) {
        throw new NoSuchMethodError();
    }

    public RunnerTeam getTeam(int teamId) {
        throw new NoSuchMethodError();
    }

    public void insertTeam(RunnerTeam team) {
        throw new NoSuchMethodError();
    }

    public void updateTeam(RunnerTeam team) {
        throw new NoSuchMethodError();
    }

    public void deleteTeam(int teamId) {
        throw new NoSuchMethodError();
    }

    public RunnerStats getRunnerStats(int runnerId) {
        throw new NoSuchMethodError();
    }

    public TeamStats getTeamStats(int teamId) {
        throw new NoSuchMethodError();
    }
}
