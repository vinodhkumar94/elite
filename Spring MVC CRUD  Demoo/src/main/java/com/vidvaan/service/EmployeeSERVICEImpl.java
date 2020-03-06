package com.vidvaan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vidvaan.dao.EmployeeDAO;
import com.vidvaan.model.Employee;
@Service
@Transactional
public class EmployeeSERVICEImpl implements EmployeeSERVICE {

	@Autowired
	private EmployeeDAO empdao;
	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		empdao.addEmployee(employee);
		
	}
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return 	empdao.getAllEmployees();

	}
	@Override
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		empdao.deleteEmployee(employeeId);
	}
	@Override
	@Transactional
	public Employee getEmployee(int employeeid) {
		return empdao.getEmployee(employeeid);
	}
	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		return empdao.updateEmployee(employee);
	}
	public void setEmployeeDAO(EmployeeDAO empdao) {
		this.empdao = empdao;
	}
}
