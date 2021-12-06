package com.dz;

public abstract class Employee implements EmployeePosition{
    protected String surname;
    protected String name;
    protected String position;
    protected double salary;
    protected Company company;

    public Employee() {
    }

    public Employee(String surname, String name, String position, double salary) {
        this.surname = surname;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary() {
        return salary;
    }

}
