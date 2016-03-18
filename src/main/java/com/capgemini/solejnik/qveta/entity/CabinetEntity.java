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
	private ClinicEntity clinic;

	public CabinetEntity() {
	}

	public CabinetEntity(String name, ClinicEntity clinic) {
		this.name = name;
		this.clinic = clinic;
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

	public ClinicEntity getClinic() {
		return clinic;
	}

	public void setClinic(ClinicEntity clinic) {
		this.clinic = clinic;
	}

}
