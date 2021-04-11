package com.example.demo.domain.support;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@MappedSuperclass
public abstract class Auditable<T> {

	@Temporal(value = TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "dd MMM yyyy hh mm ss")
	@Column(name = "createdDate", nullable = false)
	private Date createdDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "lastModifiedDate")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

	@Column(name = "lastModifiedBy")
	private String lastModifiedBy;

	@Transient
	private Date lastAccessedDate;

	@Transient
	private String lastAccessedBy;

	@Transient
	private String username = "Fujie";

	// SecurityContextHolder().getAuthentication().getName();

	@PrePersist
	public void onPrePersist() {
		this.createdDate = new Date();
		this.createdBy = this.username;
	}

	@PreUpdate
	public void onPreUpdate() {
		this.lastModifiedDate = new Date();
		this.lastModifiedBy = this.username;
	}

	@PostLoad
	public void onPostLoad() {
		log.info("Access by {}", this.username);
	}

}
