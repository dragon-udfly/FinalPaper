public class Doctor{
	// created fields
	private String doctorID;
	private String doctorName;
	private String specialization;
	
	// created constructor 
	public Doctor(String doctorID, String doctorName, String specialization){
		this.doctorID= doctorID;
		this.doctorName= doctorName;
		this.specialization= specialization;
	}
	
	// created getters 
	public String getDoctorID(){
		return this.doctorID;
	}
	
	public String getDoctorName(){
		return this.doctorName;
	}
	
	public String getSpecialization(){
		return this.specialization;
	}
	
	// created setters 
	public void setDoctorID(String doctorID){
		this.doctorID= doctorID;
	}
	
	@Override 
	public String toString(){
		return "Doctor ID: " + this.doctorID + 
		"\nDoctor Name: " + this.doctorName + 
		"\nDoctor Specialization: " + this.specialization;
	}
}