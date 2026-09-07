# CIT300 - Mini Hospital Emergency Management System

## Overview
This project is a **Mini Hospital Emergency Management System** built in Java as part of the CIT300 - Data Structures and Algorithms individual mid assignment. It simulates hospital patient management using four core data structures.

## Data Structures Implemented

### 1. Binary Search Tree (BST) - Patient Records
- Stores patient records using Patient ID as the key
- Supports insert, search, delete, and in-order traversal (ascending order display)
- Files: `Patient.java`, `BSTNode.java`, `PatientBST.java`

### 2. Queue - Emergency Patient Queue
- Manages patients waiting for emergency treatment
- FIFO (First-In, First-Out) principle
- Supports enqueue, dequeue, display, and empty check
- Files: `EmergencyQueue.java`

### 3. Stack - Treatment History
- Stores completed treatment records
- LIFO (Last-In, First-Out) principle
- Supports push, pop, display, and empty check
- Files: `Treatment.java`, `TreatmentStack.java`

### 4. Singly Linked List - Patient Visit History
- Stores each patient's previous hospital visits
- Supports adding, removing, searching, and displaying visits
- Files: `Visit.java`, `VisitHistory.java`

## How to Run
1. Clone this repository
2. Open the project in Eclipse (or any Java IDE)
3. Run `Main.java` to see all data structures in action

## Project Structure
src/hospital/
├── Patient.java
├── BSTNode.java
├── PatientBST.java
├── EmergencyQueue.java
├── Treatment.java
├── TreatmentStack.java
├── Visit.java
├── VisitHistory.java
└── Main.java

## Author
Fathima Nusrath - CIT300 Individual Mid Assignment
