package com.lambdaschool.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/data")
public class EmployeeController {

    // localhost:2019/data/allemployees
    @RequestMapping(value = "/allemployees",
                    produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees() {
        WebemployeesApplication.ourEmpList.empList.sort((e1, e2) -> e1.getLname().compareToIgnoreCase(e2.getLname()));
        return new ResponseEntity<>(WebemployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }

    // localhost:2019/data/employee/2
    @GetMapping(value = "/employee/{id}",
                produces = {"application/json"})
    public ResponseEntity<?> gemEmpDetail(@PathVariable long id) {
        Employee rtnEmp = WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id));
        return new ResponseEntity<>(rtnEmp, HttpStatus.OK);
    }

    // localhost:2019/data/employees/s
    @GetMapping(value = "/employees/{letter}",
                produces = {"application/json"})
    public ResponseEntity<?> getEmployees(
            @PathVariable
                    char letter) {
        ArrayList<Employee> rtnEmps = WebemployeesApplication.ourEmpList.
                findEmployees(e -> e.getFname().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        return new ResponseEntity<>(rtnEmps, HttpStatus.OK);
    }
}
