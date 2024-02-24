package com.techthink.employee.service.serviceimpl;

import com.techthink.employee.models.Employee;
import com.techthink.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee save(Employee employee) {
        System.out.println("Employee Details - " + employee.toString());
        return employee;
    }

    @Override
    public boolean isEmployeeIdExist(Employee employee) {
        return (employee.getEmployeeId() != null) ? true : false;
    }
}
