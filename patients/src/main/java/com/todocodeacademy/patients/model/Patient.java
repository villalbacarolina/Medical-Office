package com.todocodeacademy.patients.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
	@Temporal(TemporalType.DATE)
	private LocalDate dateOfBirth;
	private String phoneNumber;
	
	public Patient() {
	}

	public Patient(Long idPatient, String nationalIDnumber, String firstName, String lastName, LocalDate dateOfBirth,
			String phoneNumber) {
		this.idPatient = idPatient;
		this.nationalIDnumber = nationalIDnumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}
	
}
