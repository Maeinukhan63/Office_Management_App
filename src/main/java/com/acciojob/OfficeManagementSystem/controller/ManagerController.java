package com.acciojob.OfficeManagementSystem.controller;

import com.acciojob.OfficeManagementSystem.model.Manager;
import com.acciojob.OfficeManagementSystem.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ManagerController {

    @Autowired
    ManagerService managerService;


    @PostMapping("/add-manager")
    public String addMan(@RequestBody() Manager manager){
        managerService.addMan(manager);
        return "Manager details successfully saved";
    }

    @GetMapping("/get-manager")
    public Manager getManager(@RequestParam("id") int managerId){
        return managerService.getManager(managerId);
    }

    @DeleteMapping("/delete-manager/{id}")
    public String deleteMan(@PathVariable("id") int managerId){
        managerService.deleteMan(managerId);
        return "Manager detail deleted successfully";
    }

    @PatchMapping("/update-manager")
    public Manager updateManager(@RequestParam("id") int managerId, @RequestParam("rep") int noOfReporter){
        return managerService.updateManager(managerId,noOfReporter);
    }

}
