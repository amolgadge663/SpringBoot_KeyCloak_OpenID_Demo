package com.amolsoftwares.www.springbootkeycloakdemo.controller;

import com.amolsoftwares.www.springbootkeycloakdemo.model.Employee;
import com.amolsoftwares.www.springbootkeycloakdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    private ResponseEntity<List<Employee>> getAllEmp(){
        return ResponseEntity.ok(employeeService.getAllEmp());
    }

    @GetMapping("/getEmpById/{empId}")
    private ResponseEntity<Optional<Employee>> getEmpById(@PathVariable Long empId){
        return ResponseEntity.ok(employeeService.getEmpById(empId));
    }

    @PostMapping("")
    private ResponseEntity<Employee> createEmp(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmp(employee));
    }
}
