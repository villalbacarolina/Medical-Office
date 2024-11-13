package com.todocodeacademy.appointments.service;

import java.time.LocalDate;
import java.util.List;

import com.todocodeacademy.appointments.model.Appointment;

public interface IAppointmentService {
	
	public List<Appointment> get();

    public void save(LocalDate date, String treatment, String nationalIdNumber);

    public void delete(Long id);

    public Appointment find(Long id);

    public void edit(Long id, Appointment appointment);
}
