
# 🛠️ Development Documentation

## 📁 **Project Structure**

Midterm-Sprint-Java/
├── bin/                # Compiled class files
├── docs/               # Documentation files
├── src/                # Source code
│   ├── model/          # Entity classes (Person, Patient, Doctor, etc.)
│   ├── service/        # Core logic (MedicationTrackingSystem)
│   └── Main.java       # Entry point to test the system
└── README.md

## ⚙️ **Build Process**

1. **Compile the project:**
   ```bash
   javac -d bin src/model/*.java src/service/*.java src/Main.java

2.	**Run the application:**
    ```bash
    java -cp bin Main


# 📖 Javadocs Generation:

1.	**Generate Javadocs:**
    javadoc -d docs/javadoc src/model/*.java src/service/*.java

2.	**View Javadocs:**  
    Open docs/javadoc/index.html in your browser.

# 🗄️ Theoretical Database Design

While this project uses in-memory data structures (Maps), here’s a potential database schema:

*Entities:*
•	Patient (patient_id, name, age, phone_number)
•	Doctor (doctor_id, name, age, phone_number, specialization)
•	Medication (medication_id, name, dose, quantity_in_stock, expiry_date)
•	Prescription (prescription_id, doctor_id, patient_id, medication_id, issue_date, expiry_date)

*Entity Relationships:*
•	One Doctor can have many Patients (1:M).
•	One Patient can have multiple Prescriptions (1:M).
•	One Prescription links a Doctor, Patient, and Medication.

# 📄 Development Standards
•	Language: Java 17
•	OOP Principles: Inheritance, Composition, Encapsulation
•	Coding Style: Follows Java conventions (CamelCase, proper naming)
•	Version Control: Git/GitHub used for source management