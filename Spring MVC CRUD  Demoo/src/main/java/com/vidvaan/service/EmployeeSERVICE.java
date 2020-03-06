package com.vidvaan.service;

import java.util.List;

import com.vidvaan.model.Employee;

public interface EmployeeSERVICE {

	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployee(int employeeid);

	public Employee updateEmployee(Employee employee);
}
