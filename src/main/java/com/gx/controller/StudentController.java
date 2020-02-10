package com.gx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gx.dao.StudentMapper;
import com.gx.model.Student;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
//	StudentService studentService;
	StudentMapper studentMapper;
	
	@RequestMapping("getAll.action")
	public List<Student> getAll(){
		System.out.println("student/getAll.action");
		return studentMapper.getAll();
	}
}
