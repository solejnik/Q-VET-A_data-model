package com.capgemini.solejnik.qveta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClinicEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// adres
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private CityEntity city;
	@Column(nullable = false)
	private String address;

	public ClinicEntity() {
	}

	public ClinicEntity(String name, CityEntity city, String address) {
		this.name = name;
		this.city = city;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CityEntity getCity() {
		return city;
	}

	public void setCity(CityEntity city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
