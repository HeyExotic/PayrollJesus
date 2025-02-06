package org.example;

public class CalcChecker {
    public double grossPay(double hoursworked){
        return hoursworked*16.78;
    }

    public double Taxes(double dependents){
        return dependents*3;
    }
    public double netPay(double hoursworked, double taxes){
        return hoursworked - taxes;
    }
}
