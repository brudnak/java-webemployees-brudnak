package com.lambdaschool.webemployees;

import java.util.concurrent.atomic.AtomicLong;

public class Employee {

    // fields

    // AtomicLong takes account for possible collisions
    // if multiple points are trying to create employees at
    // the same time. Handles concurrency issues.

    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401k;
    private int companyID;
    private int healthPlanID;

    // constructor
    public Employee(String fname, String lname, double salary, boolean has401k, int companyID, int healthPlanID) {

        this.id = counter.incrementAndGet();
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401k = has401k;
        this.companyID = companyID;
        this.healthPlanID = healthPlanID;
    }

    // *********************************
    // start of - GETTERS & SETTERS
    public long getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHas401k() {
        return has401k;
    }

    public void setHas401k(boolean has401k) {
        this.has401k = has401k;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getHealthPlanID() {
        return healthPlanID;
    }

    public void setHealthPlanID(int healthPlanID) {
        this.healthPlanID = healthPlanID;
    }
    // end of - GETTERS & SETTERS
    // *********************************
}
