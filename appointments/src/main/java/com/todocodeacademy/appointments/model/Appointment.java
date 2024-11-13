package com.todocodeacademy.appointments.model;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Appointment {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAppointment;
    @Temporal (TemporalType.DATE)  
    private LocalDate date;
    private String treatment;
    private String fullNamePatient;
}
