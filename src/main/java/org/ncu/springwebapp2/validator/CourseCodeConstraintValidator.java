package org.ncu.springwebapp2.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	private String coursePrefix1;
	
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result = value.toUpperCase().startsWith(coursePrefix);
		boolean result1 = value.toUpperCase().startsWith(coursePrefix1);
		return(result||result1);
	}

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		/* ConstraintValidator.super.initialize(constraintAnnotation); */
		coursePrefix = constraintAnnotation.value();
		coursePrefix1 = constraintAnnotation.value1();
	}

}
