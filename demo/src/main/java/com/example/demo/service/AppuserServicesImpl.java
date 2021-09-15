package com.example.demo.service;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.domain.AppUser;
import com.example.demo.repository.AppuserRepository;

/**
 * @author Fujie Zhang
 *
 * @since Apr 18, 2021
 */
@Service
public class AppuserServicesImpl implements AppuserServices {
	private AppuserRepository appuserRepository;
	private PasswordEncoder passwordEncoder;

	/**
	 * @param appuserRepository inject repository bean for appuser
	 * @param passwordEncoder   inject password encoder bean
	 */
	@Autowired
	public AppuserServicesImpl(AppuserRepository appuserRepository, PasswordEncoder passwordEncoder) {
		this.appuserRepository = appuserRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public AppUser create(AppUser appUser) {
		String password;

		if (appUser != null && appuserRepository.findByUsername(appUser.getUsername()) == null) {
			password = passwordEncoder.encode(appUser.getPassword());
			appUser.setPassword(password);
			return appuserRepository.save(appUser);
		}

		return null;
	}

	@Override
	public AppUser get(Long id) throws AccountNotFoundException {

		try {
			if (appuserRepository.findById(id).isEmpty())
				throw new AccountNotFoundException("No appuser with id = " + id);
		} catch (IllegalArgumentException ex) {
			throw new AccountNotFoundException("Appuser id cannot be null");
		}
		return appuserRepository.findById(id).get();
	}

	@Override
	@PreAuthorize("@AppuserRepository.findByUsername(#username)?.username == authentication?.name")
	public AppUser get(@Param("username") String username) throws UsernameNotFoundException {
		if (username == null || username.isBlank())
			throw new UsernameNotFoundException("username cannot be null or blank");

		AppUser user = appuserRepository.findByUsername(username);

		if (user == null)
			throw new UsernameNotFoundException("No appuser with username = " + username);

		return user;
	}

	@Override
	public AppUser update(AppUser appUser) throws AccountNotFoundException {
		AppUser user = null;

		if (appUser.getId() == null)
			return create(appUser);
		else {
			try {
				if (appuserRepository.findById(appUser.getId()).isEmpty())
					throw new AccountNotFoundException("No such appUser: " + appUser);

				user = appuserRepository.save(appUser);
			} catch (IllegalArgumentException ex) {
				throw new AccountNotFoundException("No such appUser: " + appUser);
			}
		}

		return user;
	}

	@Override
	public void delete(Long id) throws AccountNotFoundException {
		try {
			if (appuserRepository.findById(id).isEmpty())
				throw new AccountNotFoundException("No appuser with id = " + id);

			appuserRepository.deleteById(id);
		} catch (IllegalArgumentException ex) {
			throw new AccountNotFoundException("Appuser id cannot be null");
		}
	}

}
