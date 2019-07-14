package com.lambdaschool.webemployees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebemployeesApplication {

    static EmpList ourEmpList;

    public static void main(String[] args) {

        // INSTANTIATE an OBJECT of TYPE EmpList named ourEmpList
        // enabling access to the data we created in EmpList
        ourEmpList = new EmpList();

        SpringApplication.run(WebemployeesApplication.class, args);
    }

}
