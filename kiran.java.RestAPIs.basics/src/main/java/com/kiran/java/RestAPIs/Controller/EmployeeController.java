package com.kiran.java.RestAPIs.Controller;

import java.util.List;
import java.util.ArrayList;

import com.kiran.java.RestAPIs.Bean.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @GetMapping("employee")
    public Employee getEmployee() {
        Employee employee = new Employee(
                2,
                "Ravi",
                "kiran",
                "F114, BEL Layout"
        );
        return employee;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "Ravi", "Kiran","Bangalore"));
            employees.add(new Employee(2, "Kiran", "Verma","Bangalore"));

        return employees;

    }

    @GetMapping("/employee1")
    public String getEmployee1(){
        return"Hell employee1";
    }
}
