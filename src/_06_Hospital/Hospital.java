package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public void addPatient(Patient patient) {
		
			patients.add(patient);
		}
	

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		if (patients.size() > 0) {
			System.out.println(doctors.size());
			System.out.println(patients.size());
			for (Doctor i : doctors) {
				System.out.println("a doctor");
				boolean full=false;
				while (!full) {

					try {

						i.assignPatient(patients.get(0));
						patients.remove(0);
						if (patients.size() == 0) {
							return;
						}
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						full=true;
					}

				}
			}
		}
	}
}
