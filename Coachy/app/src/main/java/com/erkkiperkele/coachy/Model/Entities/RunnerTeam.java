package com.erkkiperkele.coachy.Model.Entities;


import java.util.Date;
import java.util.List;

public class RunnerTeam {
    private int Id;
    private String Name;
    private List<Runner> _teamRunners;

    public int getId() {
        return Id;
    }

    public List<Runner> get_teamRunners() {

        return _teamRunners;
    }

    public void set_teamRunners(List<Runner> _teamRunners) {
        this._teamRunners = _teamRunners;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public RunnerTeam() {
        Id = (int) new Date().getTime();
    }

    public RunnerTeam(String name) {
        Id = (int) new Date().getTime();
        Name = name;
    }

    public RunnerTeam(String name, List<Runner> _teamRunners) {
        Id = (int) new Date().getTime();
        Name = name;
        this._teamRunners = _teamRunners;
    }

    public void addTeamRunner(Runner runner){
        _teamRunners.add(runner);
    }
}
