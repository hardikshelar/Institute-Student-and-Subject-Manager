package edu.jsp.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	 @ManyToMany (cascade = CascadeType.ALL)
	 @JoinTable(joinColumns = @JoinColumn(name = "my_student_id" ), inverseJoinColumns = @JoinColumn(name="my_subject_id"))
	 private List<Subject> subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	public Student(int id, String name, List<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	public Student() {
		super();
	}
	
		

}
