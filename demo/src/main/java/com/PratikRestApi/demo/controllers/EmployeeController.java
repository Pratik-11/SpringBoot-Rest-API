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
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{id}")
        public EmployeeDTO getEmployeeById(@PathVariable("id") Long employeeId){
            return employeeService.getEmployeeById(employeeId);
        }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }


}
