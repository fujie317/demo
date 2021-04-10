package com.example.demo.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.demo.domain.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "firstName", "person.firstName", new Object[] { "firstName" });
		var person = (Person) target;
		var firstName = person.getFirstName();
		if (firstName.length() < 5) {
			errors.rejectValue("firstName", "firstName.tooshort", null, "First name too short");
		}

		if (errors.hasErrors()) {
			for (ObjectError error : errors.getAllErrors())
				log.info(error.getCode());
		}
	}
}
