package com.todocodeacademy.patients.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todocodeacademy.patients.model.Patient;
import com.todocodeacademy.patients.service.IPatientService;

@RestController
public class PatientController {

	@Autowired
	private IPatientService patientService;
	
	@PostMapping("/patients/create")
	public String createPatient(@RequestBody Patient pat) {
		patientService.save(pat);
		return "Patient saved successfully.";
	}
	
	@GetMapping("/patients/get")
	public List<Patient> getPatients(){
		return patientService.get();
	}
	
	@GetMapping("/patients/get/{id}")
	public Patient getPatient(Long id) {
	    return patientService.find(id);
	}
	
	@PutMapping("/patients/edit/{idOriginalPatient}")
	public String editPatient(@PathVariable Long idOriginalPatient,
	                                           @RequestBody Patient newPatient) {
	    if(patientExists(idOriginalPatient)) {
	    	patientService.edit(idOriginalPatient, newPatient);
			return "Patient edited successfully.";
		}
		return "The patient does not exist and therefore cannot be edited.";
	}
	
	@DeleteMapping("/patients/delete/{id}")
	public String deletePatient(@PathVariable Long id) {
		if(patientExists(id)) {
			patientService.delete(id);
			return "Patient deleted successfully.";
		}
		return "The patient does not exist and therefore cannot be deleted.";
	}
	
	//auxiliary
	
	private boolean patientExists(Long id) {
	    return patientService.find(id) != null;
	}


}

