package service;

import model.*;

import java.util.*;
import java.util.stream.Collectors;

public class MedicationTrackingSystem {
    private Map<String, Patient> patients;
    private Map<String, Doctor> doctors;
    private Map<String, Medication> medications;
    private Map<String, Prescription> prescriptions;

    public MedicationTrackingSystem() {
        this.patients = new HashMap<>();
        this.doctors = new HashMap<>();
        this.medications = new HashMap<>();
        this.prescriptions = new HashMap<>();
    }

    // ----------------- CRUD Operations -----------------

    // Add Patient
    public void addPatient(Patient patient) {
        patients.put(patient.getId(), patient);
        System.out.println("Patient added: " + patient.getName());
    }

    // Add Doctor
    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.getId(), doctor);
        System.out.println("Doctor added: " + doctor.getName());
    }

    // Add Medication
    public void addMedication(Medication medication) {
        medications.put(medication.getId(), medication);
        System.out.println("Medication added: " + medication.getName());
    }

    // Delete Patient
    public void deletePatient(String patientId) {
        if (patients.remove(patientId) != null) {
            System.out.println("Patient removed.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    // Delete Doctor
    public void deleteDoctor(String doctorId) {
        if (doctors.remove(doctorId) != null) {
            System.out.println("Doctor removed.");
        } else {
            System.out.println("Doctor not found.");
        }
    }

    // Delete Medication
    public void deleteMedication(String medicationId) {
        if (medications.remove(medicationId) != null) {
            System.out.println("Medication removed.");
        } else {
            System.out.println("Medication not found.");
        }
    }

    // ----------------- Search Operations -----------------

    // Search Patients by Name
    public List<Patient> searchPatientsByName(String name) {
        return patients.values().stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Search Doctors by Name
    public List<Doctor> searchDoctorsByName(String name) {
        return doctors.values().stream()
                .filter(d -> d.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Search Medications by Name
    public List<Medication> searchMedicationsByName(String name) {
        return medications.values().stream()
                .filter(m -> m.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // ----------------- Prescription Management -----------------

    // Accept Prescription
    public void acceptPrescription(Prescription prescription) {
        prescriptions.put(prescription.getId(), prescription);
        prescription.getPatient().addPrescription(prescription);
        prescription.getPatient().addMedication(prescription.getMedication());
        System.out.println("Prescription accepted for patient: " + prescription.getPatient().getName());
    }

    // ----------------- Additional Functionalities -----------------

    // Assign Patient to Doctor
    public void addPatientToDoctor(String doctorId, String patientId) {
        Doctor doctor = doctors.get(doctorId);
        Patient patient = patients.get(patientId);

        if (doctor != null && patient != null) {
            doctor.addPatient(patient);
            System.out.println("Patient " + patient.getName() + " assigned to Dr. " + doctor.getName());
        } else {
            System.out.println("Doctor or Patient not found.");
        }
    }

    // Restock Medications
    public void restockMedication(String medicationId, int amount) {
        Medication medication = medications.get(medicationId);
        if (medication != null) {
            medication.restock(amount);
            System.out.println("Medication restocked: " + medication.getName() + " (+" + amount + ")");
        } else {
            System.out.println("Medication not found.");
        }
    }

    // ----------------- Reporting -----------------

    // Report: All System Data
    public void generateFullReport() {
        System.out.println("\n--- FULL SYSTEM REPORT ---");
        System.out.println("Patients:");
        patients.values().forEach(System.out::println);

        System.out.println("\nDoctors:");
        doctors.values().forEach(System.out::println);

        System.out.println("\nMedications:");
        medications.values().forEach(System.out::println);

        System.out.println("\nPrescriptions:");
        prescriptions.values().forEach(System.out::println);
    }

    // Report: Expired Medications
    public void reportExpiredMedications() {
        System.out.println("\n--- EXPIRED MEDICATIONS ---");
        medications.values().stream()
                .filter(m -> m.getExpiryDate().isBefore(java.time.LocalDate.now()))
                .forEach(System.out::println);
    }

    // Report: Prescriptions by Doctor
    public void reportPrescriptionsByDoctor(String doctorId) {
        Doctor doctor = doctors.get(doctorId);
        if (doctor != null) {
            System.out.println("\n--- PRESCRIPTIONS BY DR. " + doctor.getName() + " ---");
            prescriptions.values().stream()
                    .filter(p -> p.getDoctor().equals(doctor))
                    .forEach(System.out::println);
        } else {
            System.out.println("Doctor not found.");
        }
    }
}