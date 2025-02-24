import model.*;
import service.MedicationTrackingSystem;

public class Main {
    public static void main(String[] args) {
        MedicationTrackingSystem system = new MedicationTrackingSystem();

        // Create Doctors
        Doctor doc1 = new Doctor("D1", "Dr. Smith", 45, "123-456-7890", "Cardiology");
        Doctor doc2 = new Doctor("D2", "Dr. Adams", 50, "987-654-3210", "Neurology");
        system.addDoctor(doc1);
        system.addDoctor(doc2);

        // Create Patients
        Patient pat1 = new Patient("P1", "Alice", 30, "111-222-3333");
        Patient pat2 = new Patient("P2", "Bob", 40, "444-555-6666");
        system.addPatient(pat1);
        system.addPatient(pat2);

        // Create Medications
        Medication med1 = new Medication("M1", "Aspirin", "500mg", 20);
        Medication med2 = new Medication("M2", "Paracetamol", "250mg", 50);
        system.addMedication(med1);
        system.addMedication(med2);

        // Assign Patient to Doctor
        system.addPatientToDoctor("D1", "P1");

        // Accept Prescription
        Prescription pres1 = new Prescription("PR1", doc1, pat1, med1);
        system.acceptPrescription(pres1);

        // Restock Medication
        system.restockMedication("M1", 30);

        // Generate Reports
        system.generateFullReport();
        system.reportExpiredMedications();
        system.reportPrescriptionsByDoctor("D1");
    }
}