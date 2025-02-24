package model;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private String specialization;
    private List<Patient> patients;

    public Doctor(String id, String name, int age, String phoneNumber, String specialization) {
        super(id, name, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getSpecialization() { return specialization; }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients() { return patients; }

    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization + ", Patients: " + patients.size();
    }
}