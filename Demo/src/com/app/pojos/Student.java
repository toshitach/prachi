package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
	private String name;
	private int rollno;
	private String city;
	private String phoneno;
	private String email;
	private int Id;
	
	
	public Student() {
		System.out.println("in pojo constr"+getClass().getName());
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}@Column(unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String name, int rollno, String city, String phoneno, String email, int id) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.city = city;
		this.phoneno = phoneno;
		this.email = email;
		this.Id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", city=" + city + ", phoneno=" + phoneno + ", email="
				+ email + ", Id=" + Id + "]";
	}
	
	

}
