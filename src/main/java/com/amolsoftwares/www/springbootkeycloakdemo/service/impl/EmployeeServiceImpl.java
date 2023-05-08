package com.amolsoftwares.www.springbootkeycloakdemo.service.impl;

import com.amolsoftwares.www.springbootkeycloakdemo.model.Employee;
import com.amolsoftwares.www.springbootkeycloakdemo.repository.EmployeeRepository;
import com.amolsoftwares.www.springbootkeycloakdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmp(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmpById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getAllEmp() {
        return employeeRepository.findAll();
    }
}
