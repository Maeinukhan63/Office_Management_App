package com.acciojob.OfficeManagementSystem.repository;

import com.acciojob.OfficeManagementSystem.model.Manager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ManagerRepository {
    Map<Integer, Manager> manDb=new HashMap<>();

    public void addMan(Manager manager) {
        manDb.put(manager.getManagerId(),manager);
    }

    public Manager getManager(int managerId) {
        return manDb.get(managerId);
    }

    public void deleteMan(int managerId) {
        manDb.remove(managerId);
    }

    public Manager updateManager(int managerId, int noOfReporter) {
        Manager manager=manDb.get(managerId);
        manager.setNoOfReporter(noOfReporter);
        return manager;
    }
}
