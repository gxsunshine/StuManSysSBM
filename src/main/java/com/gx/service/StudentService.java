package com.gx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gx.dao.StudentMapper;
import com.gx.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;
	
	public List<Student> getAll(){
		return studentMapper.getAll();	
	}
}
