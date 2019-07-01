package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Student;
import com.app.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;

	public StudentController() {
		System.out.println("in constr of controller"+getClass().getName());
	}
	
	@GetMapping("/add")
	public String ShowForm()
	{
		return "/student/login";
	}
	@PostMapping("/add")
	public String Processlogin(Model map,@RequestParam String email,
			@RequestParam String password,HttpSession hs)
	{
		Student s=service.validatestudent(email, password);
		map.addAttribute("status","login successful");
		hs.setAttribute("student", s);
		return "/student/list";
		
	}

}
