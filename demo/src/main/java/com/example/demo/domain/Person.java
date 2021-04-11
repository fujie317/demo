package com.example.demo.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.demo.domain.support.Auditable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Fujie Zhang
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person extends Auditable<Person> {

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Default strategy. No need to explicitly specify
	@Column(name = "id", nullable = false)
	Long id;

	@NotNull
	@Column(name = "firstName")
	private String firstName;

	@NotNull
	@Column(name = "lastName")
	private String lastName;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "person_aliases", joinColumns = { @JoinColumn(name = "personId") })
	@Column(name = "aliases")
	private Set<String> aliases;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "personResidence", joinColumns = @JoinColumn(name = "personId"))
	@AttributeOverride(name = "street", column = @Column(name = "street_address"))
	private Set<Address> residences;

	@Embedded
	@AttributeOverride(name = "street", column = @Column(name = "street_address"))
	private Address work;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@PrePersist
	public void onPrePersistPerson() {
		this.aliases = new HashSet<String>();
		this.residences = new HashSet<Address>();
		this.work = new Address();
	}
}
