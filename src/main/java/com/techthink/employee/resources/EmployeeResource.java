package com.techthink.employee.resources;

import com.techthink.employee.models.Employee;
import com.techthink.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employee")
    public ResponseEntity<List<Employee>> getEmployees(){
        System.out.println("Request received");
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }

    @PostMapping(value = "/employee", consumes = "application/json")
    public ResponseEntity<Employee> createEmployee(@RequestBody(required = true) Employee employee){
        boolean isEmployeeIdExist = employeeService.isEmployeeIdExist(employee);
        if(isEmployeeIdExist){
            return new ResponseEntity<>(employee, HttpStatus.NOT_ACCEPTABLE);
        } else {
            employee = employeeService.save(employee);
            return new ResponseEntity<>(employee, HttpStatus.CREATED);
        }
    }
}
