package com.capgemini.solejnik.qveta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CabinetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, length = 255)
	private String name;
	@Column(nullable = false, length = 50)
	private ClientEntity city;

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

	public ClientEntity getCity() {
		return city;
	}

	public void setCity(ClientEntity city) {
		this.city = city;
	}

	public CabinetEntity() {
	}

	public CabinetEntity(Long id) {
		this.id = id;
	}

	public CabinetEntity(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public CabinetEntity(Long id, ClientEntity city) {
		this.id = id;
		this.city = city;
	}

	public CabinetEntity(String name, ClientEntity city) {
		this.name = name;
		this.city = city;
	}

	public CabinetEntity(Long id, String name, ClientEntity city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

}
