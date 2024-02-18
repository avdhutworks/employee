package com.techthink.employee.resources;

import com.techthink.employee.models.Employee;
import com.techthink.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employee")
    public List<Employee> getEmployees(){
        System.out.println("Request received");
        return new ArrayList<>();
    }

    @PostMapping(value = "/employee", consumes = "application/json")
    public Employee createEmployee(@RequestBody(required = true) Employee employee){
        return employeeService.save(employee);
    }
}
