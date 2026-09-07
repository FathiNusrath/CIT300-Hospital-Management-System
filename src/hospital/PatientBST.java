package hospital;

public class PatientBST {
    BSTNode root;

    public PatientBST() {
        root = null;
    }

    // ---------- INSERT ----------
    public void insert(Patient patient) {
        root = insertHelper(root, patient);
    }

    private BSTNode insertHelper(BSTNode node, Patient patient) {
        if (node == null) {
            return new BSTNode(patient);
        }

        if (patient.patientId < node.patient.patientId) {
            node.left = insertHelper(node.left, patient);
        } else if (patient.patientId > node.patient.patientId) {
            node.right = insertHelper(node.right, patient);
        } else {
            System.out.println("Patient ID " + patient.patientId + " already exists!");
        }

        return node;
    }

    // ---------- IN-ORDER TRAVERSAL ----------
    public void inorderTraversal() {
        System.out.println("---- Patient List (Ascending Patient ID) ----");
        inorderHelper(root);
    }

    private void inorderHelper(BSTNode node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.println(node.patient);
            inorderHelper(node.right);
        }
    }    // ---------- SEARCH ----------
    public Patient search(int patientId) {
        return searchHelper(root, patientId);
    }

    private Patient searchHelper(BSTNode node, int patientId) {
        if (node == null) {
            return null;
        }

        if (patientId == node.patient.patientId) {
            return node.patient;
        } else if (patientId < node.patient.patientId) {
            return searchHelper(node.left, patientId);
        } else {
            return searchHelper(node.right, patientId);
        }
    }

    // ---------- DELETE ----------
    public void delete(int patientId) {
        root = deleteHelper(root, patientId);
    }

    private BSTNode deleteHelper(BSTNode node, int patientId) {
        if (node == null) {
            System.out.println("Patient ID " + patientId + " not found!");
            return null;
        }

        if (patientId < node.patient.patientId) {
            node.left = deleteHelper(node.left, patientId);
        } else if (patientId > node.patient.patientId) {
            node.right = deleteHelper(node.right, patientId);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }

            BSTNode successor = findMin(node.right);
            node.patient = successor.patient;
            node.right = deleteHelper(node.right, successor.patient.patientId);
        }

        return node;
    }

    private BSTNode findMin(BSTNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
  