public class Appointment{
	// created fields 
	private String appointmentID;
	private String appointmentDate;
	private Doctor doctor;
	private Patient patient;
	
	// created constructor
	public Appointment(String appointmentID, Doctor doctor, Patient patient, String appointmentDate){
		this.appointmentID= appointmentID;
		this.appointmentDate= appointmentDate;
		this.doctor= doctor;
		this.patient= patient;
	}
	
	// created getters 
	public String getAppointmentID(){
		return this.appointmentID;
	}
	
	public String getAppointmentDate(){
		return this.appointmentDate;
	}
	
	public Doctor getDoctor(){
		return this.doctor;
	}
	
	public Patient getPatient(){
		return this.patient;
	}
	
	// created setters 
	public void setAppointmentID(String appointmentID){
		this.appointmentID= appointmentID;
	}
	
	public void setAppointmentDate(String appointmentDate){
		this.appointmentDate= appointmentDate;
	}
	
	public void setDoctor(Doctor doctor){
		this.doctor= doctor;
	}
	
	public void setPatient(Patient patient){
		this.patient= patient;
	}
	
	@Override 
	public String toString(){
		return "Appointment ID: " + this.appointmentID + 
		"\nAppointment Date: " + this.appointmentDate +
		"\n----Doctor Details-----\n" +
		doctor.toString() + 
		"\n----Patient Details-----\n" +
		patient.toString() + "\n";
	}
}