package com.lambdaschool.webemployees;

import java.util.ArrayList;

public class EmpList {

    public ArrayList<Employee> empList = new ArrayList<>();

    public EmpList() {
        empList.add(new Employee("Steve", "Green", 45000, true, 1, 1));
        empList.add(new Employee("Sam", "Ford", 80000, true, 1, 1));
        empList.add(new Employee("John", "Jones", 75000, true, 1, 1));
    }

    // ******************************************
    // METHOD - findEmployee
    // takes SINGLE PARAMETER - will be Lambda Expression
    public Employee findEmployee(CheckEmployee tester) {

        // loop through all employees
        for (Employee e: empList){

            // check if lambda expression is true
            if (tester.test(e)) {
                // return the employee that was just found
                return e;
            }
        }
        // if no matching employee is found return null
        return null;
    } // END OF METHOD
    // ******************************************

    // ******************************************
    // METHOD - findEmployees - PLURAL
    // takes SINGLE PARAMETER - will be Lambda Expression
    public ArrayList<Employee> findEmployees(CheckEmployee tester) {

        // creating TEMPORARY array list
        ArrayList<Employee> tempEmpList = new ArrayList<>();

        // loop though employees
        for (Employee e: empList) {

            // check if lambda expression is true
            if (tester.test(e)) {

                // if true, adds to temporary list
                tempEmpList.add(e);
            }
        }

        return tempEmpList;
    } // END OF METHOD
    // ******************************************
} // END OF CLASS
