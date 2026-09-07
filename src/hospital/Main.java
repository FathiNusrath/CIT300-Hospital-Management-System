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
    }
}