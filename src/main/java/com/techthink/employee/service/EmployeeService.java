package com.techthink.employee.service;

import com.techthink.employee.models.Employee;

public interface EmployeeService {
    Employee save(Employee employee);

    boolean isEmployeeIdExist(Employee employee);
}
