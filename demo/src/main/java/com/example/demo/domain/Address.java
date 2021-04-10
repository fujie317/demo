package com.example.demo.domain;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Address {
	private String street;
	private String city;
	private String province;
	private long zip;
}
