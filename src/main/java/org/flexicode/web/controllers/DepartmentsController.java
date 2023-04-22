package org.flexicode.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.flexicode.web.domain.Departments;
import org.flexicode.web.domain.DepartmentsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class DepartmentsController {
    private DepartmentsRepository repository;
    private ArrayList<Departments> departments;
    
    public List<Departments> getAllDepartments(){
    	repository.findAll().forEach(departments::add);
    	return departments;
    }
}
