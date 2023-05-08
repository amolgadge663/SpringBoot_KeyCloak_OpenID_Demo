package com.amolsoftwares.www.springbootkeycloakdemo.service;

import com.amolsoftwares.www.springbootkeycloakdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    //create
    Employee createEmp(Employee employee);

    //get one by id
    Optional<Employee> getEmpById(Long id);

    //get all
    List<Employee> getAllEmp();

}
