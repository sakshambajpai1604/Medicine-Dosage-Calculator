package com.saksham;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HospitalStaff[] staff = {
                new Doctor("Sharma"), // Upcast
                new Nurse("Priya") // Upcast
        };

        for (HospitalStaff person : staff) {
            person.work(); // Dynamic binding
            if (person instanceof Doctor) {
                Doctor doc = (Doctor) person; // Downcast
                doc.prescribe();
            } else if (person instanceof Nurse) {
                Nurse nur = (Nurse) person;
                nur.checkVitals();
            }
            System.out.println();
        }
    }
}