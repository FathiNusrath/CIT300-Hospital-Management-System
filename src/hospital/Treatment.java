package hospital;

public class Treatment {
    int patientId;
    String patientName;
    String treatmentDetails;
    String dateCompleted;

    public Treatment(int patientId, String patientName, String treatmentDetails, String dateCompleted) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.treatmentDetails = treatmentDetails;
        this.dateCompleted = dateCompleted;
    }

    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + patientName +
               ", Treatment: " + treatmentDetails + ", Date: " + dateCompleted;
    }
}
