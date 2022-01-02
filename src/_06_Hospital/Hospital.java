package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
ArrayList<Doctor> doctors=new ArrayList<Doctor>();
ArrayList<Patient> patients=new ArrayList<Patient>();

public void addDoctor(Doctor doctor) {
	doctors.add(doctor);
}
public void addPatient(Patient patient) {
	if(patients.size()<3) {
	patients.add(patient);
	}
}
public ArrayList<Doctor> getDoctors(){
	return doctors;
}
public ArrayList<Patient> getPatients(){
	return patients;
}
public void assignPatientsToDoctors() {
	for(Doctor i: doctors) {
		//COME UP WITH SOME WAY TO DISTRIBUTE THE PATIENTS EVENLY BETWEEN EACH DOCTOR
}
}
}
