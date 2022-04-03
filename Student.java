package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Roshini");
	}
	public void studentDept() {
		System.out.println("EEE");
	
}
	public void studentId() {
		System.out.println("1055687");
	}


public static void main(String[] args) {
	Student stud = new Student();
	stud.collegeCode();
	stud.collegeName();
	stud.collegeRank();
	stud.deptName();
	stud.studentDept();
	stud.studentName();
	stud.studentId();
}
}