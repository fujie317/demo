package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Person;

/**
 * @author Fujie Zhang
 * 
 * @since April 10, 2021
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
