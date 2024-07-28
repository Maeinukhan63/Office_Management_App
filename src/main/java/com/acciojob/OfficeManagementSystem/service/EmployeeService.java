package com.acciojob.OfficeManagementSystem.service;

import com.acciojob.OfficeManagementSystem.model.Employee;
import com.acciojob.OfficeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeerepository;

    public void addEmp(Employee employee){
        employeerepository.addEmp(employee);
    }

    public Employee getEmp(int empId){
        return employeerepository.getEmp(empId);
    }

    public void deletEmp(int empId) {
        employeerepository.deletEmp(empId);
    }

    public Employee updateSal(int empId, int salary) {
        return employeerepository.updateSal(empId,salary);
    }

    public Employee getHighestSalary() {
        return employeerepository.getHighestSalary();
    }
}
