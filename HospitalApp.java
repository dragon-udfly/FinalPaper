public class HospitalApp {
    public static void main(String[] args){
		// patient objects 
		Patient p1= new Patient("P1001", "John Doe", 30, "Male");
		Patient p2= new Patient("P1002", "vdkkd", 33, "Female");
		Patient p3= new Patient("P1003", "3ikdle", 29, "Male");
		Patient p4= new Patient("P1004", "3kdkelaa", 45, "Male");
		
		// doctor objects 
		Doctor d1= new Doctor("D2001", "dldld", "Cardi");
		Doctor d2= new Doctor("D2002", "dmdkdk", "Pedia");
		Doctor d3= new Doctor("D2003", "djjdwie", "Dermato");
		
		// appointment objects
		Appointment a1= new Appointment("A3001", d1, p2, "8393938");
		Appointment a2= new Appointment("A3002", d2, p3, "111111");
		Appointment a3= new Appointment("A3003", d3, p2, "8393938");
		Appointment a4= new Appointment("A3004", d1, p1, "11111");
		Appointment a5= new Appointment("A3005", d2, p4, "8393938");
		
		// to array 
		Appointment apArray[]= {a1, a2, a3, a4, a5};
		
		// set date 
		a4.setAppointmentDate("000000000");
		
		// list appointments
		String checkDate= "8393938";
		for(int i= 0; i < apArray.length; i++){
			String date= apArray[i].getAppointmentDate();
			if(checkDate.equals(date)){
				System.out.println(apArray[i].toString());
			}
		}
		
		// patients below 20
		int pAge= 20;
		for(int i= 0; i < apArray.length; i++){
			int age= apArray[i].getPatient().getPatientAge();
			if(pAge == age){
				System.out.println(apArray[i].getPatient().toString());
			}
        }
	}
}
