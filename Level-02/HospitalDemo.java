import java.util.ArrayList;
import java.util.List;

// Doctor class
class Doctor {
    String name;
    List<Patient> patients;

    Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Method for communication between Doctor and Patient (Consultation)
    void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting with " + patient.name + ".");
        patient.addConsultation(this); // Add this consultation to the patient's history
    }

    // Add patient to the doctor's list of patients
    void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    void displayPatients() {
        System.out.println("Dr. " + name + " has the following patients:");
        for (Patient patient : patients) {
            System.out.println("  " + patient.name);
        }
    }
}

// Patient class
class Patient {
    String name;
    List<Doctor> doctors;

    Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Method for the patient to consult with a doctor
    void addConsultation(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    void displayDoctors() {
        System.out.println("Patient " + name + " has consulted the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  Dr. " + doctor.name);
        }
    }
}

// Hospital class
class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Add a patient to the hospital
    void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Display all doctors and patients in the hospital
    void displayHospital() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            doctor.displayPatients();
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            patient.displayDoctors();
        }
    }
}

// Main class
public class HospitalDemo {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City General");

        // Create doctors
        Doctor doctor1 = new Doctor("Simran");
        Doctor doctor2 = new Doctor("Kritika");

        // Create patients
        Patient patient1 = new Patient("Aditi");
        Patient patient2 = new Patient("Ritu");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Add consultations (Doctor and Patient interactions)
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display hospital details (doctors, patients, and consultations)
        hospital.displayHospital();
    }
}
