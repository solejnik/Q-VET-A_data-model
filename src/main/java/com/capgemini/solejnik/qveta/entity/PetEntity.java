package com.capgemini.solejnik.qveta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private PetTypeEntity type;
	@ManyToOne
	private ClinicEntity owner;

	public PetEntity() {
	}

	public PetEntity(String name, PetTypeEntity type, ClinicEntity owner) {
		this.name = name;
		this.type = type;
		this.owner = owner;
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

	public PetTypeEntity getType() {
		return type;
	}

	public void setType(PetTypeEntity type) {
		this.type = type;
	}

	public ClinicEntity getOwner() {
		return owner;
	}

	public void setOwner(ClinicEntity owner) {
		this.owner = owner;
	}

}
