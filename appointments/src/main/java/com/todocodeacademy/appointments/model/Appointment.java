package com.todocodeacademy.appointments.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAppointment;
    @Temporal (TemporalType.DATE)  
    private LocalDate date;
    private String treatment;
    private String fullNamePatient;
}
