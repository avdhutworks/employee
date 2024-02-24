package com.techthink.employee.resources;

import com.techthink.employee.models.Employee;
import com.techthink.employee.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;

@RunWith(JUnitPlatform.class)
public class EmployeeResourceTest {

    @Mock
    private EmployeeService employeeService;

    private Employee setUpEmployeeWithEmployeeId(){
        return new Employee(1L, "Avdhut", "Sitaram", "Parab", "ABCDE1234F", 1234123412341234L, "101010101010", 9988776655L, "parab_avdhut@gmail.com");
    }

    private Employee setUpEmployeeWithoutEmployeeId(){
        return new Employee("Avdhut", "Sitaram", "Parab", "ABCDE1234F", 1234123412341234L, "101010101010", 9988776655L, "parab_avdhut@gmail.com");
    }

    @Test
    public void createEmployee_employeeIdIsPresent(){
        Assert.assertTrue(employeeService.isEmployeeIdExist(setUpEmployeeWithEmployeeId()));
    }

    @Test
    public void createEmployee_employeeIdIsNotPresent() {
        Assert.assertFalse(employeeService.isEmployeeIdExist(setUpEmployeeWithoutEmployeeId()));
    }
}
