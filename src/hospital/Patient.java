package hospital;

public class Patient {
    int patientId;
    String name;
    int age;
    String contactNumber;
    String medicalCondition;

    // Constructor
    public Patient(int patientId, String name, int age, String contactNumber, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
    }

    // For printing patient details easily
    public String toString() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age +
               ", Contact: " + contactNumber + ", Condition: " + medicalCondition;
    }
}
