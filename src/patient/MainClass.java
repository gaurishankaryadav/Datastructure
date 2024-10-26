package patient;

public class MainClass {
	
	public static void main(String[] args) {
		
		PatientMonitor patient = new PatientMonitor();
		
		patient.addPatient("Gauri", 29, "Male", "H Pilory", "A+", 75, 95);
		patient.addPatient("shankar", 18, "Male", "Maleria", "AB+", 60, 56);
		patient.addPatient("lalit", 45, "Male", "Indigestion", "A-", 59, 89);
		patient.addPatient("Prakash", 31, "Male", "Typhide", "A+", 96, 101);
		patient.addPatient("monilika", 24, "Male", "Fever", "O-", 78, 70);
		patient.addPatient("sunder", 28, "Male", "Cough", "O+", 63, 81);
		
		
		System.out.println("***************************************");
		
		
		patient.analyzeHeartRate();
		
		System.out.println("***************************************");
		
		patient.analyzeGluecoseLevel();
		
	}

}