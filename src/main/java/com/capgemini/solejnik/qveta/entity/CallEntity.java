package com.capgemini.solejnik.qveta.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CallEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Date timeFrom;
	@Column(nullable = false)
	private Date timeTo;
	@Column(nullable = false)
	private UserEntity doctor;
	@Column(nullable = false)
	private CityEntity city;//turtaj md4
	@Column(nullable = false)
	private CabinetEntity cabinet;

	public CallEntity() {
	}

	public CallEntity(Date timeFrom, Date timeTo, UserEntity doctor, CityEntity city, CabinetEntity cabinet) {
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
		this.doctor = doctor;
		this.city = city;
		this.cabinet = cabinet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(Date timeFrom) {
		this.timeFrom = timeFrom;
	}

	public Date getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(Date timeTo) {
		this.timeTo = timeTo;
	}

	public UserEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(UserEntity doctor) {
		this.doctor = doctor;
	}

	public CityEntity getCity() {
		return city;
	}

	public void setCity(CityEntity city) {
		this.city = city;
	}

	public CabinetEntity getCabinet() {
		return cabinet;
	}

	public void setCabinet(CabinetEntity cabinet) {
		this.cabinet = cabinet;
	}

}
