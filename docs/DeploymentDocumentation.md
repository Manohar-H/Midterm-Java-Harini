# 🚀 Deployment Documentation

## 💊 Pharmacy Management System

This guide explains how to set up and run the Pharmacy Management System.


### 💻 **System Requirements**

- **Java JDK:** 17 or newer  
- **IDE:** VS Code or any Java-supported IDE  
- **Git:** Installed for cloning the repository


### 📂 **Project Setup**

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Manohar-H/Midterm-Java-Harini.git
   cd Midterm-Java-Harini

2.	**Compile the Code:**
    ```bash
    javac -d bin src/model/*.java src/service/*.java src/Main.java

3.	**Run the Application:**
    ```bash
    java -cp bin Main

⚡ Running Javadocs
1.	**Generate Documentation:**
    ```bash
    javadoc -d docs/javadoc src/model/*.java src/service/*.java

2.	Open docs/javadoc/index.html in your browser to view class documentation.

📁 File Structure After Setup
Midterm-Java-Harini/
├── bin/               # Compiled classes
├── docs/              # Documentation (User, Development, Deployment, Javadocs)
├── src/               # Source code
└── README.md

🎉 You’re ready to go! Enjoy using the Pharmacy Management System.