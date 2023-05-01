package com.bilvantis.sample.controller;

import com.bilvantis.sample.entity.Employee;
import com.bilvantis.sample.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot";
    }

    @PostMapping("/saveEmployeeDetails")
    public Employee saveEmployee(@RequestBody Employee employee) {

    	System.out.println("Employee Details --->"+employee);
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/updateEmployeeDetails")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/getallEmployee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/uniqueEmployees/{employeeName}")
    public List<Employee> getUniqueEmployees(@PathVariable(name = "employeeName") String employeeName){
        return employeeService.getUniqueEmployees(employeeName);
    }
    
    @GetMapping("/getEmployeeDetails/{employeeId}")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @DeleteMapping("/deleteEmployee/{employeeId}")
    public void deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
