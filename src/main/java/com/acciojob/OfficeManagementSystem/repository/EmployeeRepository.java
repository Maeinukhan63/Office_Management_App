package com.acciojob.OfficeManagementSystem.repository;

import com.acciojob.OfficeManagementSystem.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository {

    Map<Integer, Employee> empDb=new HashMap<>();

    public void addEmp(Employee employee){
        empDb.put(employee.getEmpId(), employee);
    }

    public Employee getEmp(int empId) {
        return empDb.get(empId);
    }

    public void deletEmp(int empId) {
        empDb.remove(empId);
    }

    public Employee updateSal(int empId, int salary) {
        Employee employee=empDb.get(empId);
        employee.setSalary(salary);
        return employee;
    }

    public Employee getHighestSalary() {
        int maxsal=0;
        Employee highestPaidEmp=null;
        for(int empId:empDb.keySet()){
            Employee currEmp=empDb.get(empId);
            if(currEmp.getSalary() > maxsal){
                maxsal=currEmp.getSalary();
                highestPaidEmp=currEmp;
            }
        }
        return highestPaidEmp;

    }
    
}
