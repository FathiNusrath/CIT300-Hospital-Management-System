package hospital;

public class Main {
    public static void main(String[] args) {
        PatientBST bst = new PatientBST();

        // Insert some patients
        bst.insert(new Patient(105, "Kamal Perera", 45, "0771234567", "Fever"));
        bst.insert(new Patient(102, "Nimal Silva", 30, "0777654321", "Fracture"));
        bst.insert(new Patient(108, "Saman Kumara", 60, "0712345678", "Heart Issue"));
        bst.insert(new Patient(101, "Amara Fernando", 25, "0765432198", "Asthma"));

        // Display all patients (should show in ascending ID order)
        bst.inorderTraversal();

        // Search test
        System.out.println("\n--- Search Test ---");
        Patient found = bst.search(102);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Patient not found.");
        }

        // Delete test
        System.out.println("\n--- Delete Test ---");
        bst.delete(105);
        bst.inorderTraversal();
     // ================= QUEUE TEST =================
    System.out.println("\n\n==== EMERGENCY QUEUE TEST ====");
    EmergencyQueue queue = new EmergencyQueue();

    queue.enqueue(new Patient(201, "Ruwan Jayasuriya", 28, "0711112222", "Chest Pain"));
    queue.enqueue(new Patient(202, "Dilani Perera", 34, "0722223333", "Broken Arm"));
    queue.enqueue(new Patient(203, "Chathura Bandara", 50, "0733334444", "High Fever"));

    System.out.println("\n--- Current Queue ---");
    queue.display();

    System.out.println("\n--- Dequeue (treat next patient) ---");
    Patient treated = queue.dequeue();
    System.out.println("Treating: " + treated);

    System.out.println("\n--- Queue after dequeue ---");
    queue.display();
    // ================= STACK TEST =================
    System.out.println("\n\n==== TREATMENT HISTORY STACK TEST ====");
    TreatmentStack stack = new TreatmentStack();

    stack.push(new Treatment(201, "Ruwan Jayasuriya", "Chest X-Ray and medication", "2026-09-07"));
    stack.push(new Treatment(202, "Dilani Perera", "Arm cast applied", "2026-09-07"));
    stack.push(new Treatment(203, "Chathura Bandara", "Fever medication given", "2026-09-07"));

    System.out.println("\n--- Current Treatment History ---");
    stack.display();

    System.out.println("\n--- Pop (undo last treatment record) ---");
    Treatment removed = stack.pop();
    System.out.println("Removed: " + removed);

    System.out.println("\n--- Treatment History after pop ---");
    stack.display();
    
    // ================= VISIT HISTORY TEST =================
    System.out.println("\n\n==== PATIENT VISIT HISTORY TEST ====");
    VisitHistory history = new VisitHistory();

    history.addVisit(new Visit(1, "2026-01-15", "Dr. Fernando", "Common Cold", "Rest and fluids"));
    history.addVisit(new Visit(2, "2026-03-22", "Dr. Silva", "Sprained Ankle", "Bandage and rest"));
    history.addVisit(new Visit(3, "2026-06-10", "Dr. Perera", "Migraine", "Pain relief medication"));

    System.out.println("\n--- Current Visit History ---");
    history.display();

    System.out.println("\n--- Search Visit ID 2 ---");
    Visit visitFound = history.searchVisit(2);
    if (visitFound != null) {
        System.out.println("Found: " + visitFound);
    } else {
        System.out.println("Visit not found.");
    }

    System.out.println("\n--- Remove Visit ID 2 ---");
    history.removeVisit(2);
    history.display();
}
}