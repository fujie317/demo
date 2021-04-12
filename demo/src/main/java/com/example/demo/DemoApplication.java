package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.example.demo.repository.PersonRepository;

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

		PersonRepository repo = ctx.getBean(PersonRepository.class);

		// Person person = new Person("John", "Doe");
		var p = repo.findById(19L).get();

//		p.getWork().setCity("Shenzhen");
//		Thread.sleep(1000, 0);
//		repo.save(p);
//		repo.save(person);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.ctx = applicationContext;
	}

}
