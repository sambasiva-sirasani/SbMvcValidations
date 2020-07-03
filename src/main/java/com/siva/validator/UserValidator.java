package com.siva.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.siva.model.User;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User u=(User)target;
		if(u.getUserName()==null||u.getUserName().isBlank()) {
			errors.rejectValue("userName",null, "Please Enter username");
		}
		
		if(u.getUserPwd()==null||u.getUserPwd().isBlank()) {
			errors.rejectValue("userPwd",null, "Please Enter Password");
		}
		
		if(u.getUserGen()==null||u.getUserGen().isBlank()) {
			errors.rejectValue("userGen",null, "Please Enter Gender");
		}
		
		if(u.getUserCours()==null||u.getUserCours().isBlank()) {
			errors.rejectValue("userCours",null, "Please Enter Course");
		}
		
		if(u.getUserAddr()==null||u.getUserAddr().isBlank()) {
			errors.rejectValue("userAddr",null, "Please Enter Address");
		}
		
		if(u.getUserLang()==null||u.getUserLang().isEmpty()) {
			errors.rejectValue("userLang",null, "Please Enter Atleast one language");
		}
	}

}
