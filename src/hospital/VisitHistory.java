package hospital;

public class VisitHistory {
    private Visit head;

    public VisitHistory() {
        head = null;
    }

    // ---------- ADD VISIT ----------
    public void addVisit(Visit visit) {
        if (head == null) {
            head = visit;
        } else {
            Visit current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = visit;
        }
        System.out.println("Visit added: " + visit);
    }

    // ---------- REMOVE VISIT ----------
    public void removeVisit(int visitId) {
        if (head == null) {
            System.out.println("No visit history available.");
            return;
        }

        // If head itself needs to be removed
        if (head.visitId == visitId) {
            head = head.next;
            System.out.println("Visit ID " + visitId + " removed.");
            return;
        }

        Visit current = head;
        while (current.next != null) {
            if (current.next.visitId == visitId) {
                current.next = current.next.next;
                System.out.println("Visit ID " + visitId + " removed.");
                return;
            }
            current = current.next;
        }

        System.out.println("Visit ID " + visitId + " not found.");
    }

    // ---------- SEARCH VISIT ----------
    public Visit searchVisit(int visitId) {
        Visit current = head;
        while (current != null) {
            if (current.visitId == visitId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // ---------- DISPLAY ----------
    public void display() {
        if (head == null) {
            System.out.println("No visit history available.");
            return;
        }

        System.out.println("---- Patient Visit History ----");
        Visit current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
