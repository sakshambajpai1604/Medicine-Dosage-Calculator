package com.saksham;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HospitalStaff[] team = {
                new Doctor("Sharma"), new Nurse("Priya"),
                new Receptionist("Raj"), new Doctor("Patel")
        };
        System.out.println("=== End of Shift Report ===");
        for (HospitalStaff m : team) m.shiftReport();
    }
}