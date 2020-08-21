package com.ct.springdemo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StartsWithConstraintValidator implements ConstraintValidator<StartsWith, String>{
	
	private String prefix;
	
	@Override
	public void initialize(StartsWith data) {
		this.prefix = data.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value!=null )
			return value.startsWith(prefix);
		else 
			return true;
	}
}
