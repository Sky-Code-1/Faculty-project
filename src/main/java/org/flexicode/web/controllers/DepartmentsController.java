package org.flexicode.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.flexicode.web.domain.Departments;
import org.flexicode.web.domain.DepartmentsRepository;
import org.flexicode.web.entity.DepartmentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/api/departments")
public class DepartmentsController {
    private final DepartmentsRepository repository;
    private ArrayList<Departments> departments;
    
    
//    @GetMapping
    public List<Departments> getAllDepartments(){
    	repository.findAll().forEach(departments::add);
    	return departments;
    }
    public DepartmentsController(DepartmentsRepository repository, ArrayList<Departments> departments) {
		this.repository = repository;
		this.departments = departments;
	}
//	@PostMapping
    public ResponseEntity<Departments> addDepartment(@RequestBody DepartmentRequest request){
    	Departments department = new Departments();
    	System.out.println(request.getName());
    	System.out.println(request.getTitle());
    	department.setDepartmentName(request.getTitle());
    	department.setDepartmentTitle(request.getTitle());
    	repository.save(department);
    	return ResponseEntity.ok(department);
    }
}
