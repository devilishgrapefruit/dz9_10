package com.dz;

public class Manager extends Employee implements EmployeePosition{


    public Manager(String surname, String name, String position, double salary) {
        super(surname, name, position, salary);
    }

  /*  public Manager(String surname, String name, double salary) {
        this.surname = surname;
        this.name = name;
        this.position = "Manager";
        this.salary = this.salary + (double) Math.random() * (max + 1 - min) + min * 0.05;
    }*/

    @Override
    public String getJobTitle() {
        return super.getJobTitle();
    }

    @Override
    public double calcSalary() {
        return salary;
    }

}
