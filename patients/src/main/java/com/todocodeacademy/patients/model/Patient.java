package com.todocodeacademy.patients.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPatient;
	private String nationalIDnumber;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String phoneNumber;
	
	public Patient() {
	}

	public Patient(Long idPatient, String nationalIDnumber, String firstName, String lastName, Date dateOfBirth,
			String phoneNumber) {
		this.idPatient = idPatient;
		this.nationalIDnumber = nationalIDnumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}
	
}
