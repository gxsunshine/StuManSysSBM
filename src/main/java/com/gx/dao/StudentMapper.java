package com.gx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gx.model.Student;

@Mapper
public interface StudentMapper {

	public List<Student> getAll();
	
	
}
