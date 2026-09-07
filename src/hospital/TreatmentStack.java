package hospital;

public class TreatmentStack {
    private StackNode top;
    private int size;

    // Node class for the stack (linked list based)
    private class StackNode {
        Treatment treatment;
        StackNode next;

        StackNode(Treatment treatment) {
            this.treatment = treatment;
            this.next = null;
        }
    }

    public TreatmentStack() {
        top = null;
        size = 0;
    }

    // ---------- PUSH ----------
    public void push(Treatment treatment) {
        StackNode newNode = new StackNode(treatment);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Treatment record added: " + treatment);
    }

    // ---------- POP ----------
    public Treatment pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No treatment records.");
            return null;
        }

        Treatment removedTreatment = top.treatment;
        top = top.next;
        size--;
        return removedTreatment;
    }

    // ---------- DISPLAY ----------
    public void display() {
        if (isEmpty()) {
            System.out.println("No treatment records available.");
            return;
        }

        System.out.println("---- Treatment History (Most Recent First) ----");
        StackNode current = top;
        while (current != null) {
            System.out.println(current.treatment);
            current = current.next;
        }
    }

    // ---------- EMPTY CHECK ----------
    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }
}