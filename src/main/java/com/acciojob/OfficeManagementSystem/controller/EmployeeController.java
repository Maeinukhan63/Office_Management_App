package com.acciojob.OfficeManagementSystem.controller;

import com.acciojob.OfficeManagementSystem.model.Employee;
import com.acciojob.OfficeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeservices;



    @PostMapping("/add-employee")
    public String addEmp(@RequestBody Employee employee){
        employeeservices.addEmp(employee);
        return "Employee  registered successfully";
    }

    @GetMapping("/get-employee")
    public Employee getEmp(@RequestParam("id") int empId){
        return employeeservices.getEmp(empId);
    }   

    @DeleteMapping("/delete-employee/{id}")
    public String deletEmp(@PathVariable("id") int empId){
        employeeservices.deletEmp(empId);
        return "Employee deleted successfully";
    }

    @PatchMapping("/update-salary")
    public Employee updateSal(@RequestParam("id") int empId,@RequestParam("sal") int salary){
        return employeeservices.updateSal(empId,salary);
    }

    @GetMapping("/get-highestSalary")
    public Employee getHighestSalary(){
        return employeeservices.getHighestSalary();
    }
}
