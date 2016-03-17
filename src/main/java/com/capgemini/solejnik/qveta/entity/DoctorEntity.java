package com.capgemini.solejnik.qveta.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class DoctorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctor_id")
	private Set<PetTypeEntity> specialties = new HashSet<PetTypeEntity>();

	public DoctorEntity() {
	}

	public DoctorEntity(String firstName, String lastName, String email, String password,
			Set<PetTypeEntity> specialties) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.specialties = specialties;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<PetTypeEntity> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(Set<PetTypeEntity> specialties) {
		this.specialties = specialties;
	}

}
