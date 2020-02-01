package com.elite.serializationclass;

import java.util.*;

public class College
{
private List<Student> students;

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}

@Override
public String toString() {
	return "College [students=" + students + "]";
}




}
