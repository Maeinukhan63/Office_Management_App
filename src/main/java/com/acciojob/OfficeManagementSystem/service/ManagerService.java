package com.acciojob.OfficeManagementSystem.service;

import com.acciojob.OfficeManagementSystem.model.Manager;
import com.acciojob.OfficeManagementSystem.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public void addMan(Manager manager) {
        managerRepository.addMan(manager);
    }

    public Manager getManager(int managerId) {
        return managerRepository.getManager(managerId);
    }

    public void deleteMan(int managerId) {
        managerRepository.deleteMan(managerId);
    }

    public Manager updateManager(int managerId, int noOfReporter) {
        return managerRepository.updateManager(managerId,noOfReporter);
    }
}
