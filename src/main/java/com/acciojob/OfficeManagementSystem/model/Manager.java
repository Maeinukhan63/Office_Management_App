package com.acciojob.OfficeManagementSystem.model;

public class Manager {

    private int managerId;
    private String name;
    private int age;
    private int noOfReporter;
    private String department;

    public Manager() {
    }

    public Manager(int managerId, String name, int age, int noOfReporter, String department) {
        this.managerId = managerId;
        this.name = name;
        this.age = age;
        this.noOfReporter = noOfReporter;
        this.department = department;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoOfReporter() {
        return noOfReporter;
    }

    public void setNoOfReporter(int noOfReporter) {
        this.noOfReporter = noOfReporter;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
