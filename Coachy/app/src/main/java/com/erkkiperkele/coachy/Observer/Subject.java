package com.erkkiperkele.coachy.Observer;


public interface Subject {

    void attach(Observer o);

    void detach(Observer o);

    void notifyObs();
}
