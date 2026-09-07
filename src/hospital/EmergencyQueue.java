package hospital;

public class EmergencyQueue {
    private QueueNode front;
    private QueueNode rear;
    private int size;

    // Node class for the queue (linked list based)
    private class QueueNode {
        Patient patient;
        QueueNode next;

        QueueNode(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    public EmergencyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // ---------- ENQUEUE ----------
    public void enqueue(Patient patient) {
        QueueNode newNode = new QueueNode(patient);

        if (rear == null) {
            // Queue is empty
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Patient added to queue: " + patient.name);
    }

    // ---------- DEQUEUE ----------
    public Patient dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No patients waiting.");
            return null;
        }

        Patient removedPatient = front.patient;
        front = front.next;

        if (front == null) {
            // Queue became empty
            rear = null;
        }

        size--;
        return removedPatient;
    }

    // ---------- DISPLAY ----------
    public void display() {
        if (isEmpty()) {
            System.out.println("No patients waiting in queue.");
            return;
        }

        System.out.println("---- Patients Waiting ----");
        QueueNode current = front;
        while (current != null) {
            System.out.println(current.patient);
            current = current.next;
        }
    }

    // ---------- EMPTY CHECK ----------
    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }
}
