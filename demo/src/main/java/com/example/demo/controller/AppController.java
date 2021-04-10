package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.domain.Person;
import com.example.demo.validation.PersonValidator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Fujie Zhang
 *
 */
@Controller
@RequestMapping("/")
@Slf4j
public class AppController {

	@ModelAttribute
	public Person getPerson() {
		return new Person("Fujie", "Zhang");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setRequiredFields("firstName", "lastName");
		binder.addValidators(new PersonValidator());
	}

	/**
	 * @param request
	 * @return name of view page
	 */
	@RequestMapping(path = "hello", method = RequestMethod.GET)
	public String hello(HttpServletRequest request, @Valid @ModelAttribute Person person, BindingResult errors) {
		// log.error(person.getFirstName());
		/*
		 * Enumeration<String> attrs = request.getAttributeNames(); while
		 * (attrs.hasMoreElements()) { String attr = attrs.nextElement(); try {
		 * log.error("Attribute - {} value - {}", attr, request.getAttribute(attr)); }
		 * catch (Exception ex) {
		 * 
		 * } }
		 */
		String path = ServletUriComponentsBuilder.fromContextPath(request).path("/index").build().encode()
				.toUriString();
		log.info(path);
		return "home";
	}

	/**
	 * @param jsonp
	 * @param person
	 * @return person object in JSON format
	 */
	@ResponseBody
	@RequestMapping(path = "person", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person getPerson(@RequestParam(value = "jsonp", required = true) String jsonp,
			@ModelAttribute Person person) {
		return person;
	}
}
