package com.example.demo.config;

import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.demo.domain.Person;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
public class PersonFormatter implements Formatter<Person> {

	@Override
	public Person parse(String source, Locale locale) {
		String parts[] = source.split(" ");

		return new Person(parts[0], parts[1]);
	}

	@Override
	public String print(Person object, Locale locale) {
		
		return object.getFirstName() + " " + object.getLastName();
	}

}
