package com.todocodeacademy.appointments.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	private Long idPatient;
    private String nationalIdNumber;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String phoneNumber;	
}
