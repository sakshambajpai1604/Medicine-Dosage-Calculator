# Medicine Dosage Calculator
## Overloading Practice
Create a DosageCalculator class with three overloaded calculate() methods: (1) weight only, (2) weight + age, (3) weight + age + severity. Each version adjusts the dosage formula accordingly.

# Staff Shift Report
## Overriding + Dynamic Binding Practice
Create a HospitalStaff base class with a shiftReport() method. Override it in Doctor, Nurse, and Receptionist. Use an array of parent references to call each version polymorphically.

# Upcasting & Downcasting
## instanceof + Explicit Cast Practice
Store Doctor and Nurse objects in HospitalStaff references (upcasting). Then use instanceof and explicit downcasting to call the child-specific methods prescribe() and checkVitals().
