package com.erkkiperkele.coachy.Model;

import com.erkkiperkele.coachy.Model.DAL.RunnerDataAccessLayer;
import com.erkkiperkele.coachy.Model.Entities.Coach;
import com.erkkiperkele.coachy.Model.Entities.Runner;
import com.erkkiperkele.coachy.Model.Entities.RunnerStats;
import com.erkkiperkele.coachy.Model.Entities.RunnerTeam;
import com.erkkiperkele.coachy.Model.Entities.TeamStats;

public class RunnerModel {
    private RunnerDataAccessLayer _dataAccessLayer;

    public RunnerModel() {
        _dataAccessLayer = new RunnerDataAccessLayer();

    }

    public Runner getRunner(int runnerId) {
        return _dataAccessLayer.getRunner(runnerId);
    }

    public void addRunner(Runner runner) {
        _dataAccessLayer.insertRunner(runner);
    }

    public void updateRunner(Runner runner) {
        _dataAccessLayer.updateRunner(runner);
    }

    public void deleteRunner(int runnerId) {
        _dataAccessLayer.deleteRunner(runnerId);
    }

    public Coach getCoach(int coachId) {
        return _dataAccessLayer.getCoach(coachId);
    }

    public void addCoach(Coach coach) {
        _dataAccessLayer.insertCoach(coach);
    }

    public void updateCoach(Coach coach) {
        _dataAccessLayer.updateCoach(coach);
    }

    public void deleteCoach(int coachId) {
        _dataAccessLayer.deleteCoach(coachId);
    }

    public void getRunnerTeam(int teamId) {
        _dataAccessLayer.getTeam(teamId);
    }

    public void addRunnerTeam(RunnerTeam team) {
        _dataAccessLayer.insertTeam(team);
    }

    public void updateRunnerTeam(RunnerTeam team) {
        _dataAccessLayer.updateTeam(team);
    }

    public void deleteRunnerTeam(int teamId) {
        _dataAccessLayer.deleteTeam(teamId);
    }

    public RunnerStats getRunnerStats(int runnerId) {
        return _dataAccessLayer.getRunnerStats(runnerId);
    }

    public TeamStats getTeamStats(int teamId) {
        return _dataAccessLayer.getTeamStats(teamId);
    }
}
