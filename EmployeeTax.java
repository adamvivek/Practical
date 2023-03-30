package com.cognizant.tax;

public class EmployeeTax {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator(25000, true);
        calculator.calculateTax();
        calculator.deductTax();
        calculator.validateSalary();

        calculator = new TaxCalculator(125000, true);
        calculator.calculateTax();
        calculator.deductTax();
        calculator.validateSalary();
    }
}
