package com.todocodeacademy.patients.controller;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.todocodeacademy.patients.model.Patient;
//import com.todocodeacademy.patients.service.ICrudService;

@RestController
public class PatientController {

//	@SuppressWarnings("rawtypes")
//	@Autowired
//	private ICrudService patientService;
//	
//	@SuppressWarnings("unchecked")
//	@PostMapping("/patients/create")
//	public String createPatient(@RequestBody Patient pat) {
//		patientService.save(pat);
//		return "Patient saved successfully.";
//	}
//	
//	@SuppressWarnings("unchecked")
//	@GetMapping("/patients/get")
//	public List<Patient> getPatients(){
//		return patientService.get();
//	}
//	
//	@DeleteMapping("/patients/delete/{id}")
//	public String deletePatient(@PathVariable Long id) {
//		Patient patient = patientService.find(id);
//		if(patient!=null) {
//			patientService.delete(id);
//		}
//			
//		return "Patient deleted successfully.";
//	}
//	
//	@PutMapping("/patients/edit/{idOriginalPatient}")
//	public ResponseEntity<Patient> editPatient(@PathVariable Long idOriginalPatient,
//	                                           @RequestBody Patient newPatient) {
//	    boolean isEdited = patientService.edit(idOriginalPatient, newPatient);
//	    if (!isEdited)
//	        return ResponseEntity.notFound().build();
//	    Patient editedPatient = (Patient) patientService.find(idOriginalPatient);
//	    return ResponseEntity.ok(editedPatient);
//	}

}

