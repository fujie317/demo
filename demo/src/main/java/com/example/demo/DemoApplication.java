package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.example.demo.domain.AppUser;
import com.example.demo.service.AppuserServices;

/**
 * @author Fujie Zhang
 *
 */
@SpringBootApplication
@EnableCaching
public class DemoApplication implements CommandLineRunner, ApplicationContextAware {
	private ApplicationContext ctx;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		AppuserServices appuserServices = ctx.getBean(AppuserServices.class);

		appuserServices.create(new AppUser("user1", "password1", "ROLE_USER", "ROLE_ADMIN"));
		appuserServices.create(new AppUser("user2", "password2", "ROLE_USER"));
		appuserServices.create(new AppUser("user3", "password3", "ROLE_USER"));
		appuserServices.create(new AppUser("user4", "password4", "ROLE_USER"));

//		p.getWork().setCity("Toronto");
//		Thread.sleep(1000, 0);
//		repo.save(p);
//		repo.save(person);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.ctx = applicationContext;
	}

}
