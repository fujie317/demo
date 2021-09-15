package com.example.demo.service;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.domain.AppUser;

public interface AppuserServices {
	AppUser create(AppUser appUser);

	AppUser get(Long id) throws AccountNotFoundException;

	AppUser get(String userName) throws UsernameNotFoundException;

	AppUser update(AppUser appUser) throws AccountNotFoundException;

	void delete(Long id) throws AccountNotFoundException;
}