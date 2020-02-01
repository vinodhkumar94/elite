package com.elite.serializationclass;

public class Student
{
private int rollno;
private String name;
private long mobnum;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobnum() {
	return mobnum;
}
public void setMobnum(long mobnum) {
	this.mobnum = mobnum;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", mobnum=" + mobnum + "]";
}



}
