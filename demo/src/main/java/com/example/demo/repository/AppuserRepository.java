package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.AppUser;

public interface AppuserRepository extends CrudRepository<AppUser, Long> {
	AppUser findByUsername(String username);
}
