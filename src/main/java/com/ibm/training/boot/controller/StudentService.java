package com.ibm.training.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.boot.bean.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	

	public String getStudent(int id) {
		// TODO Auto-generated method stub
		return dao.getStudent(id);
	}
	
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return dao.getStudents();
	}

	public void updateUser(Student student, Integer id) {
		// TODO Auto-generated method stub
		dao.updateStudent(student,id);
	}

	public void addNewStudent(Student student) {
		// TODO Auto-generated method stub
		dao.addNewStudent(student);
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		dao.deleteStudent(id);
	}

	
	
	

}
