package com.lambdaschool.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
