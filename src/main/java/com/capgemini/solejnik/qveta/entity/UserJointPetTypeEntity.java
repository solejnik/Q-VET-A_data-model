package com.capgemini.solejnik.qveta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserJointPetTypeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Long userId;
	@Column(nullable = false)
	private Long petTypeId;

	public UserJointPetTypeEntity() {
	}

	public UserJointPetTypeEntity(Long userId, Long petId) {
		this.userId = userId;
		this.petTypeId = petId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPetId() {
		return petTypeId;
	}

	public void setPetId(Long petId) {
		this.petTypeId = petId;
	}

}
