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
	private DoctorEntity doctor;
	@Column(nullable = false)
	private CityEntity city;
	@Column(nullable = false)
	private ClinicEntity clinic;

	public CallEntity() {
	}

	public CallEntity(Long id, Date timeFrom, Date timeTo, DoctorEntity doctor, CityEntity city, ClinicEntity clinic) {
		this.id = id;
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
		this.doctor = doctor;
		this.city = city;
		this.clinic = clinic;
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

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public CityEntity getCity() {
		return city;
	}

	public void setCity(CityEntity city) {
		this.city = city;
	}

	public ClinicEntity getClinic() {
		return clinic;
	}

	public void setClinic(ClinicEntity clinic) {
		this.clinic = clinic;
	}

}
