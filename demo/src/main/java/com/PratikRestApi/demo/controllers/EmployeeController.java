package com.PratikRestApi.demo.controllers;

//operations

// GET /employees
// POST /employees
// DELETE /employees/{id}

import com.PratikRestApi.demo.dto.EmployeeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees")
        public EmployeeDTO getEmployees(){
            return new EmployeeDTO(12l, "Pratik", LocalDate.of(2024,1,2), true);
        }
}
