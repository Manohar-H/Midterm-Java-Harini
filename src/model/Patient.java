package model;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private List<Medication> medications;
    private List<Prescription> prescriptions;

    public Patient(String id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber);
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    public List<Medication> getMedications() { return medications; }

    public List<Prescription> getPrescriptions() { return prescriptions; }

    public void addMedication(Medication medication) {
        medications.add(medication);
    }

    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    @Override
    public String toString() {
        return super.toString() + ", Medications: " + medications.size() + ", Prescriptions: " + prescriptions.size();
    }
}