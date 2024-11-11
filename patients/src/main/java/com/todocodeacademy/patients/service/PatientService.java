package com.todocodeacademy.patients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todocodeacademy.patients.model.Patient;
import com.todocodeacademy.patients.repository.IPatientRepository;

@Service
public class PatientService implements ICrudService<Patient>{

	@Autowired 
	private IPatientRepository patientRepository;
	
	@Override
	public List<Patient> get() {
		return patientRepository.findAll();
	}

	@Override
	public void save(Patient pat) {
		patientRepository.save(pat);
	}

	@Override
	public void delete(Long patientId) {
		patientRepository.deleteById(patientId);
	}

	@Override
	public Patient find(Long patientId) {
		return patientRepository.findById(patientId).orElse(null);
	}

	@Override
	public void edit(Patient pat) {
		this.save(pat);
	}

}
