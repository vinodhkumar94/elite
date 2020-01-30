package com.elite.beans;  
  
public class Emp {  
private int id;  
private String name;  
private int age;
private float salary;  
private String designation;  
private String gender;
private String location;
  
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
public float getSalary() {  
    return salary;  
}  
public void setSalary(float salary) {  
    this.salary = salary;  
}  
public String getDesignation() {  
    return designation;  
}  
public void setDesignation(String designation) {  
    this.designation = designation;  
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation
			+ ", gender=" + gender + ", location=" + location + "]";
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}  

  
}  