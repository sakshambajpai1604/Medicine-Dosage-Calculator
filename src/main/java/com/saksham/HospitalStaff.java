package com.saksham;

class HospitalStaff {
    protected String name;
    HospitalStaff(String n) { name = n; }
    void shiftReport() { System.out.println(name + ": General duties."); }
}

class Doctor extends HospitalStaff {
    Doctor(String n) { super(n); }
    @Override
    void shiftReport() { System.out.println("Dr. " + name + ": 15 patients, 2 surgeries."); }
}

class Nurse extends HospitalStaff {
    Nurse(String n) { super(n); }
    @Override
    void shiftReport() { System.out.println(name + ": Administered meds to 20 patients."); }
}

class Receptionist extends HospitalStaff {
    Receptionist(String n) { super(n); }
    @Override
    void shiftReport() { System.out.println(name + ": Registered 35 new patients."); }
}