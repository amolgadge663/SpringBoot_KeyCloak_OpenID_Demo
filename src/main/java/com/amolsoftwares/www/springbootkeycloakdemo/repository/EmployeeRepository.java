package com.amolsoftwares.www.springbootkeycloakdemo.repository;

import com.amolsoftwares.www.springbootkeycloakdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
