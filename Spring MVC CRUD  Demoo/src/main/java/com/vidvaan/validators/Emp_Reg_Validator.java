package com.vidvaan.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.vidvaan.model.Employee;
@Component
public class Emp_Reg_Validator implements Validator {

	@Override
	public boolean supports(Class<?> paramClass) {
		return Employee.class.equals(paramClass);
	}

	@Override
	public void validate(Object object, Errors errors) {

		 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ename", "employee.ename");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "employee.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "esal", "employee.esal");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "esal", "employee.esal", "Please Enter Numbers only");

	}

	

}
