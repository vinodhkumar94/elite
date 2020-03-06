package com.elite.pgms;

public class Student {
int id;
String name;

public Student() {
	super();
}

public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {
	
	Student std1 = new Student(1, "A");
	Student std2 =  new Student(2, "B");
	Student std3 = new Student(3, "A");
	System.out.println(std1);
	System.out.println(std1==std2);
	System.out.println(std1.equals(std3));
	System.out.println(std1==std3);
	System.out.println(std1.equals(std2)); 
}

}

