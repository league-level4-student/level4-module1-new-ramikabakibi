package _06_Hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor {

	@Override
	public boolean getPerformsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getMakesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void assignPatient(Patient patient) throws DoctorFullException{
		// TODO Auto-generated method stub
		if(patients.size()<3) {
		patients.add(patient);
		}
		if(patients.size()>3) {
			throw new DoctorFullException();
		}
	}

	@Override
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient e: patients) {
			e.checkPulse();
		}
	}

}
