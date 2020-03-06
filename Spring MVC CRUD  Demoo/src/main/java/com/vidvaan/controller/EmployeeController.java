package com.vidvaan.controller;

import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.vidvaan.model.Employee;
import com.vidvaan.service.EmployeeSERVICE;
import com.vidvaan.validators.Emp_Reg_Validator;

@Controller
public class EmployeeController {
	      
	@Autowired
	private EmployeeSERVICE employeeService;
	@Autowired
	private Emp_Reg_Validator empval;
	
	@RequestMapping(value = "/success")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		return new ModelAndView("success", "listEmployee", listEmployee);
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView addemployee(ModelAndView model) {
		Employee employee = new Employee();
		
		return new ModelAndView("empReg", "employee", employee);
	}
	
	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("eid"));
		Employee employee = employeeService.getEmployee(employeeId);
		return new ModelAndView("empReg", "employee", employee);
	}
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee, BindingResult results) {
		final Logger logger = Logger.getLogger(EmployeeController.class);

			employeeService.addEmployee(employee);
			empval.validate(employee, results);
			if (results.hasErrors()) {
				logger.debug("EmployeeController:  Debug  Success");
			     logger.warn("EmployeeController:  Warning  Message, please use respected type of input, the filelds are requested");
			     logger.error("EmployeeController:  Error Message, use text?number in name field, email field and salary field must use numbers ");
			     logger.fatal("EmployeeController:  Fatal Message"); 
					return new ModelAndView("empReg", "employee", employee);

			} else {
				 logger.info("EmployeeController: Success Msg, Employee data inserted succesfully");
				return new ModelAndView("success", "employee", employee);

			}
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("eid"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/success");
	}



	
	}
