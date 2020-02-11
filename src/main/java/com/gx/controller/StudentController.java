package com.gx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	
	@RequestMapping("getAllByPage.action")
	public PageInfo getAllByPage(){
		// 使用pagehelper进行分页
		PageHelper.startPage(0, 10);
		List<Student> stuList = studentMapper.getAll();
		PageInfo pageInfo = new PageInfo<Student>(stuList);
		return pageInfo;
	}
}
