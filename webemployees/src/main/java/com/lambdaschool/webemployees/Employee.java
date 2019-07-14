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
}
