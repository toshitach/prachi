package com.app.dao;

import com.app.pojos.Student;

public interface StudentDao {
	
	Student validatestudent(String email,String password);

}
