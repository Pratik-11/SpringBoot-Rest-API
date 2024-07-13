package com.PratikRestApi.demo.controllers;

//operations

// GET /employees
// POST /employees
// DELETE /employees/{id}

import com.PratikRestApi.demo.dto.EmployeeDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees/{id}")
        public EmployeeDTO getEmployees(@PathVariable("id") Long employeeId){
            return new EmployeeDTO(employeeId, "Pratik", LocalDate.of(2024,1,2), true);
        }

    @GetMapping(path = "/employees/")
    public String getData(@PathParam("SortBy") String sortBy){
        return "Hello" + sortBy;
    }


}
