# 📖 User Documentation

## 💊 Pharmacy Management System

This Java application is designed to manage a pharmacy system. It allows adding and managing **Patients**, **Doctors**, **Medications**, and **Prescriptions**. The system also supports reporting on expired medications, restocking, and linking patients to doctors.

---

### 🏗️ **Class Overview**

- **Person (abstract)**: Base class with `id`, `name`, `age`, and `phoneNumber`.
  - **Patient**: Extends Person. Contains lists of medications and prescriptions.
  - **Doctor**: Extends Person. Includes specialization and list of patients.

- **Medication**: Represents a drug with fields for `id`, `name`, `dose`, `quantityInStock`, and `expiryDate`.

- **Prescription**: Connects `Doctor`, `Patient`, and `Medication`. Includes `issueDate` and `expiryDate`.

- **MedicationTrackingSystem**: Main class that manages all entities and supports CRUD operations, searches, and reports.

---

### 🚀 **How to Run the Program**

1. **Compile the code:**
   ```bash
   javac -d bin src/model/*.java src/service/*.java src/Main.java

2.	**Run the program:**
    ```bash
    java -cp bin Main

The console will display outputs showing added entities, prescriptions, and reports.

                 +----------------+
                 |    Person      |
                 +----------------+
                 | - id           |
                 | - name         |
                 | - age          |
                 | - phoneNumber  |
                 +----------------+
                       /_\
                        |
          +---------------------------+
          |                           |
  +----------------+         +-----------------+
  |    Patient     |         |    Doctor       |
  +----------------+         +-----------------+
  | - medications  |         | - specialization|
  | - prescriptions|         | - patients      |
  +----------------+         +-----------------+

  +----------------+      +-----------------+
  |  Medication    |      |  Prescription   |
  +----------------+      +-----------------+
  | - id           |<---->| - doctor        |
  | - name         |      | - patient       |
  | - dose         |      | - medication    |
  | - quantity     |      | - issueDate     |
  | - expiryDate   |      | - expiryDate    |
  +----------------+      +-----------------+

  +-------------------------------------------+
  |        MedicationTrackingSystem           |
  +-------------------------------------------+
  | - patients: Map<String, Patient>          |
  | - doctors: Map<String, Doctor>            |
  | - medications: Map<String, Medication>    |
  | - prescriptions: Map<String, Prescription>|
  +-------------------------------------------+