package com.example.demo.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Fujie Zhang
 *
 */
@Controller
@RequestMapping("/")
@Slf4j
public class AppController {

	/**
	 * @param request
	 * @return name of view page
	 */
	@RequestMapping(path = "hello", method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {
		Enumeration<String> attrs = request.getAttributeNames();
		while (attrs.hasMoreElements()) {
			String attr = attrs.nextElement();
			try {
				log.error("Attribute - {} value - {}", attr, request.getAttribute(attr));
			} catch (Exception ex) {

			}
		}
		String path = ServletUriComponentsBuilder.fromContextPath(request).path("/index").build().encode()
				.toUriString();
		log.info(path);
		return "home";
	}
}
