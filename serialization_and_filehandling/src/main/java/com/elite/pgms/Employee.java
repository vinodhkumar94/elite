package com.elite.pgms;

import java.util.HashSet;
import java.util.Set;

public class Employee {
private String ename,location;

	public Employee(String ename, String location) {
	super();
	this.ename = ename;
	this.location = location;
}
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Employee)) return false;
		Employee emp = (Employee) o;
		
		return ename.equals(emp.ename) && location.equals(emp.location);
	}
	
	@Override
	public int hashCode()
	{
		return 11 *ename.hashCode() + location.hashCode();
	}
	
	public static void main(String[] args) {

		Set<Employee> emp = new HashSet<Employee>();
		emp.add(new Employee("A", "Hyd"));
		emp.add(new Employee("B", "Che"));
		emp.add(new Employee("D", "Che"));
		emp.add(new Employee("A", "Hyd"));
		System.out.println(emp.contains(new Employee("A", "Hyd")));
		System.out.println(emp.contains(new Employee("D", "Hyd")));
		System.out.println(emp.contains(new Employee("C", "Hyd")));
		System.out.println(emp.contains(new Employee("B", "Che")));
		System.out.println(emp.contains(new Employee("D", "Che")));
		

	}

}
