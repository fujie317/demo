package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

import com.example.demo.domain.support.Auditable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE) // JPA requires a default constructor
public class AppUser extends Auditable<Date> implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	@JsonIgnore
	private Long id;

	@Column(name = "USER_NAME")
	@NotNull
	private String username;

	@Column(name = "PASSWORD")
	@NotNull
	private String password;

	@Column(name = "enabled")
	private boolean enabled = true;

	@Column(name = "account_non_expired")
	private boolean accountNonExpired = true;

	@Column(name = "credentils_non_expired")
	private boolean credentialsNonExpired = true;

	@Column(name = "account_non_locked")
	private boolean accountNonLocked = true;

	@CollectionTable(name = "ROLES", joinColumns = { @JoinColumn(name = "APPUSER_ID") })
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> roles = new HashSet<>();

	/**
	 * @param username account login
	 * @param password account password
	 * @param roles    appuser role names
	 */
	public AppUser(String username, String password, String... roles) {
		this.username = username;
		this.password = password;

		for (String role : roles)
			this.roles.add(role);
	}
}
