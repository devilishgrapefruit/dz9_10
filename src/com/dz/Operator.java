package com.dz;

public class Operator extends Employee implements EmployeePosition{

    public Operator(String surname, String name, String position, double salary) {
        super(surname, name, position, salary);
    }

    @Override
    public String getJobTitle() {
        return super.getJobTitle();
    }

    @Override
    public double calcSalary() {
        return super.calcSalary();
    }

}
