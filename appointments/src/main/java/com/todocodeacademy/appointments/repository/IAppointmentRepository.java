package com.todocodeacademy.appointments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todocodeacademy.appointments.model.Appointment;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Long>{
}