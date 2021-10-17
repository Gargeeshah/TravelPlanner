package com.travelplanner.util;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements 
ConstraintValidator<DateConstraint, Date>{

	@Override
	public void initialize(DateConstraint constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		LocalDate datenow = LocalDate.now();
		Date todaydate = Date.valueOf(datenow);
		
		int result = value.compareTo(todaydate);
		if(result >= 0)
			return true;
		else
			return false;
	}

	
}
