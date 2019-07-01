package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDao;
import com.app.pojos.Student;
@Service
@Transactional
public class StudentServiceimpl implements StudentService {
	@Autowired
	private StudentDao dao;

	@Override
	public Student validatestudent(String email, String password) {
		
		return dao.validatestudent(email, password);
	}

}
