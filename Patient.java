public class Patient{
	// created fields
	private String patientID;
	private String patientName;
	private int patientAge;
	private String patientGender;
	
	// created constructor
	public Patient(String patientID, String patientName, int patientAge, String patientGender){
		this.patientName= patientName;
		this.patientID= patientID;
		this.patientAge= patientAge;
		this.patientGender= patientGender;
	}
	
	// created getters for fields 
	public String getPatientID(){
		return patientID;
	}
	
	public String getPatientName(){
		return this.patientName;
	}
	
	public int getPatientAge(){
		return this.patientAge;
	}
	
	public String getPatientGender(){
		return this.patientGender;
	}
	
	@Override 
	public String toString(){
		return "ID: " + this.patientID + 
        "\nPatient Name: " + this.patientName + 
        "\nPatient Age: " + this.patientAge + 
        "\nPatient Gender " + this.patientGender;
	}
}