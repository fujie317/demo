package com.example.demo.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Person {

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

	@ElementCollection
	@CollectionTable(name = "person_aliases", joinColumns = { @JoinColumn(name = "personId") })
	@Column(name = "aliases")
	private Set<String> aliases;

	@ElementCollection
	@CollectionTable(name = "personResidence", joinColumns = @JoinColumn(name = "personId"))
	@AttributeOverride(name = "street", column = @Column(name = "street_address"))
	private Set<Address> residences;

	@Embedded
	@AttributeOverride(name = "street", column = @Column(name = "street_address"))
	private Address work;

	@Temporal(value = TemporalType.DATE)
	@CreationTimestamp
	@JsonFormat(pattern = "dd MMM yyyy")
	@Column(name = "createdOn", nullable = false)
	private Date createdOn;

	@Column(name = "lastModified")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date lastModified;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@PrePersist
	public void prePersist() {
		this.createdOn = new Date();
	}

	@PreUpdate
	public void preUpdate() {
		this.lastModified = new Date();
	}
}
