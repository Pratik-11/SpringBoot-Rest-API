package com.PratikRestApi.demo.services;

import com.PratikRestApi.demo.dto.EmployeeDTO;
import com.PratikRestApi.demo.entities.EmployeeEntity;
import com.PratikRestApi.demo.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDTO getEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        // has to convert entity into DTO
        return new EmployeeDTO(employeeEntity.getId(), employeeEntity.getName(), employeeEntity.getDateOfJoining(), employeeEntity.isActive());
    }

    public EmployeeDTO createNewEmployee()
}