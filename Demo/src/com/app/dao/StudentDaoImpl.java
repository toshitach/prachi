package com.app.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.pojos.Student;
import org.hibernate.SessionFactory;


@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sf;
	
	public Student validatestudent(String email, String password) {
		
		 String jpql= "select s from Student where s.email=:em and s.password=:pa";
		return sf.getCurrentSession().createQuery(jpql,Student.class).
				setParameter("em",email).setParameter("pa",password).getSingleResult();
		 
	}

}
