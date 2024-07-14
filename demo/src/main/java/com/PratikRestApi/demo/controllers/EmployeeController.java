package com.PratikRestApi.demo.controllers;

//operations

// GET /employees
// POST /employees
// DELETE /employees/{id}

import com.PratikRestApi.demo.dto.EmployeeDTO;
import com.PratikRestApi.demo.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employees/{id}")
        public EmployeeDTO getEmployees(@PathVariable("id") Long employeeId){
            return employeeService.getEmployeeById(employeeId);
        }

    @PostMapping(path = "/employees/")
    public EmployeeDTO getData(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(EmployeeDTO);
    }


}
