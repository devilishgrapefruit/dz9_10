package com.dz;

public class TopManager extends Employee implements EmployeePosition{

    public TopManager(String surname, String name, String position, double salary) {
        super(surname, name, position, salary);
    }

    @Override
    public String getJobTitle() {
        return super.getJobTitle();
    }

    @Override
    public double calcSalary() {
        return salary;
    }

}
