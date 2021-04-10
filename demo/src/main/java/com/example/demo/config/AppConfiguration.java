package com.example.demo.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class AppConfiguration implements WebMvcConfigurer {

	@Bean
	public LocaleResolver localeResolver() {
		return new SessionLocaleResolver();
	}

	@Bean
	public HandlerInterceptor localeChangeInterceptor() {
		var localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		return localeChangeInterceptor;
	}

	@Bean
	public PersonFormatter personFormatter() {
		return new PersonFormatter();
	}

	@Bean
	public MessageSource messageSource() {
		var messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("messages");
		messageSource.setUseCodeAsDefaultMessage(true);
		return messageSource;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new PersonFormatter());
		registry.addFormatter(new DateFormatter());
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*");
	}
}
