package com.todocodeacademy.appointments.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todocodeacademy.appointments.model.Appointment;
import com.todocodeacademy.appointments.repository.IAppointmentRepository;

@Service
public class AppointmentService implements IAppointmentService{
    
    @Autowired
    private IAppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> get() {
        return appointmentRepository.findAll();
    }

    @Override
    public void save(LocalDate date, String treatment, String nationalIdNumber) {
    	//PENDING:
        //search patient in api
        //consume the patient's full name from the API
        
    	Appointment appointment = new Appointment();
    	appointment.setDate(date);
    	appointment.setTreatment(treatment);
        //appointment.setFullNamePatient();
        
    	appointmentRepository.save(appointment);        
    }

    @Override
    public void delete(Long id) {
    	appointmentRepository.deleteById(id);
    }

    @Override
    public Appointment find(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    @Override
    public void edit(Long id, Appointment newAppointment) {
  
    	Appointment appointment = this.find(id);
        
    	appointment.setDate(newAppointment.getDate());
    	appointment.setTreatment(newAppointment.getTreatment());
    	appointment.setFullNamePatient(newAppointment.getFullNamePatient());
        
    	appointmentRepository.save(appointment);
    }
    
    
    
    
    
}
