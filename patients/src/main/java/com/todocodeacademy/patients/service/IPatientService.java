package com.todocodeacademy.patients.service;

import java.util.List;
import com.todocodeacademy.patients.model.Patient;

public interface IPatientService {

	public List<Patient> get();
	public void save(Patient pat);
	public void delete(Long id);
	public Patient find(Long id);
	public void edit(Long id, Patient pat);
	public Patient findByNationalIdNumber(String nationalIdNumber);
	
}
