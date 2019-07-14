package com.lambdaschool.webemployees;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculationController {

    // localhost:2019/calc/salary/1/0.05
    // return how much the employee would get
    @Mapping(value = "/salary/{id}/{raise}",
                produces = {"application/json"})
    public ResponseEntity<?> checkRaise(
            @PathVariable
                    long id,
            @PathVariable
                    double raise) {

    }
}
