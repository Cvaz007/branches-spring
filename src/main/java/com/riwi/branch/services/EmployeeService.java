package com.riwi.branch.services;

import com.riwi.branch.models.Employee;
import com.riwi.branch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    public void deleteEmployee(Integer id){
        employeeRepository.deleteById(id);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Integer id){
        return employeeRepository.findById(id).get();
    }

}
