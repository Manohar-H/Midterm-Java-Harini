package model;

import java.time.LocalDate;

public class Prescription {
    private String id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate issueDate;
    private LocalDate expiryDate;

    public Prescription(String id, Doctor doctor, Patient patient, Medication medication) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.issueDate = LocalDate.now();
        this.expiryDate = issueDate.plusYears(1);  // Default expiry is one year
    }

    public String getId() { return id; }
    public Doctor getDoctor() { return doctor; }
    public Patient getPatient() { return patient; }
    public Medication getMedication() { return medication; }
    public LocalDate getIssueDate() { return issueDate; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return "Prescription ID: " + id + ", Doctor: " + doctor.getName() + ", Patient: " + patient.getName() +
               ", Medication: " + medication.getName() + ", Issue Date: " + issueDate + ", Expiry Date: " + expiryDate;
    }
}