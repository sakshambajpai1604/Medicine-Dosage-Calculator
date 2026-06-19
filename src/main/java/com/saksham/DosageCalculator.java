package com.saksham;

public class DosageCalculator {

    double calculate(double weightKg) {
        double dose = weightKg * 10.0;
        System.out.println("Weight-based dose: " + dose + " mg");
        return dose;
    }

    double calculate(double weightKg, int age) {
        double dose = weightKg * 10.0;
        if (age < 12) dose *= 0.5;
        else if (age > 65) dose *= 0.75;
        System.out.println("Age-adjusted dose: " + dose + " mg");
        return dose;
    }

    double calculate(double weightKg, int age, int severity) {
        double dose = weightKg * 10.0;
        if (age < 12) dose *= 0.5;
        else if (age > 65) dose *= 0.75;
        dose *= severity;
        System.out.println("Severity-adjusted dose: " + dose + " mg");
        return dose;
    }
}

