package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	protected ArrayList<Patient> patients=new ArrayList<Patient>();
	public abstract boolean getPerformsSurgery();
	public abstract boolean getMakesHouseCalls();
	public  void assignPatient(Patient patient ) throws DoctorFullException{
	
			// TODO Auto-generated method stub
			if(patients.size()<3) {
			patients.add(patient);
			}
			else if(patients.size()>=3) {
				throw new DoctorFullException();
			}
		}
	
	public  ArrayList<Patient> getPatients(){
		
			// TODO Auto-generated method stub
			return patients;
		}
	
	public  void doMedicine() {
		
			// TODO Auto-generated method stub
			for(Patient e: patients) {
				e.checkPulse();
			}
		}
	
}
