package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	protected ArrayList<Patient> patients=new ArrayList<Patient>();
	public abstract boolean getPerformsSurgery();
	public abstract boolean getMakesHouseCalls();
	public abstract void assignPatient(Patient patient ) throws DoctorFullException;
	public abstract ArrayList<Patient> getPatients();
	public abstract void doMedicine();
}
