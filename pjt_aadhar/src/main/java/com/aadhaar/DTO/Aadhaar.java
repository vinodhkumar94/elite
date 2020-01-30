package com.aadhaar.DTO;
import java.sql.Date;
import java.util.Comparator;
public class Aadhaar implements Comparable<Aadhaar>
{
private int aid;
private String name;
private int age;
private String gender;
private long Phone_num;
private String email_id;
private String m_status;
private String State;

					public int getAid() {
						return aid;
					}
					public void setAid(int aid) {
						this.aid = aid;
					}
					public String getName() {
						return name;
					}
					public void setName(String name) {
						this.name = name;
					}
					public int getAge() {
						return age;
					}
					public void setAge(int age) {
						this.age = age;
					}
					public String getGender() {
						return gender;
					}
					public void setGender(String gender) {
						this.gender = gender;
					}
					public long getPhone_num() {
						return Phone_num;
					}
					public void setPhone_num(long phone_num) {
						Phone_num = phone_num;
					}
					public String getEmail_id() {
						return email_id;
					}
					public void setEmail_id(String email_id) {
						this.email_id = email_id;
					}
					
					public String getM_status() {
						return m_status;
					}
					public void setM_status(String m_status) {
						this.m_status = m_status;
					}
					public String getState() {
						return State;
					}
					public void setState(String state) {
						State = state;
					}
				

@Override
public String toString() {
	return "Aadhaar [aid=" + aid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", Phone_num=" + Phone_num
			+ ", email_id=" + email_id + ", m_status=" + m_status + ", State=" + State + ", getAid()=" + getAid()
			+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
			+ ", getPhone_num()=" + getPhone_num() + ", getEmail_id()=" + getEmail_id() + ", getM_status()="
			+ getM_status() + ", getState()=" + getState() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
public int compareTo(Aadhaar arg0) {
	// TODO Auto-generated method stub
	return 0;
}
}
