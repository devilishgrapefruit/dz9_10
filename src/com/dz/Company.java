package com.dz;
import java.util.ArrayList;
import java.util.Objects;

public class Company {
    public static final int min = 115000;
    public static final int max = 140000;
    protected ArrayList<Employee> allEmployees = new ArrayList<>();

    public Company() {
    }

    public Company(ArrayList<Employee> allEmployees) {
        this.allEmployees = allEmployees;
    }

    public int getSize() {
        return allEmployees.size();
    }

    public void hire(String position, double fix_salary) {
        switch (position) {
            case "Operator" -> {
                Operator person = new Operator("Иванович", "Иван", "Operator", fix_salary);
                person.company = this;
                allEmployees.add(person);
                break;
            }
            case "Manager" -> {
                double salary = fix_salary + (double) Math.random() * (max + 1 - min) + min * 0.05;
                Manager person = new Manager("Сидоров", "Сергей", "Manager", salary);
                person.company = this;
                allEmployees.add(person);
                break;
            }
            case "TopManager" -> {
                double S = 0, salary = fix_salary;
                for (int i = 0; i < this.getSize(); i++)
                    if (!Objects.equals(this.allEmployees.get(i).getPosition(), "TopManager"))
                        S += this.allEmployees.get(i).calcSalary();
                if (S > 10000000)
                    salary = salary + 1.5 * salary;
                TopManager person = new TopManager("Попов", "Алексей", "TopManager", salary);
                person.company = this;
                allEmployees.add(person);
                break;
            }
        }

    }
    public void hireAll(String position, double fix_salary, int c){
        for (int i = 0; i < c; i++) {
            hire(position, fix_salary);
        }
    }

    public void fire(int i){
        allEmployees.remove(allEmployees.get(i));
    }

    public double getIncome() {
        double Income = 0;
        for (Employee person : allEmployees)
            Income = Income + person.calcSalary();
        return Income;
    }
    ArrayList<Employee> getTopSalaryStaff(int count) {
        if (count <= 0)
            return null;
        if (count > allEmployees.size())
            count = allEmployees.size();
        ArrayList<Employee> TopSalaryStaff = new ArrayList<Employee>(count);
        TopSalaryStaff.addAll(allEmployees);
        boolean isSorted = false;
        Employee tp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < TopSalaryStaff.size() - 1; i++)
                if (TopSalaryStaff.get(i).calcSalary() < TopSalaryStaff.get(i + 1).calcSalary()) {
                    isSorted = false;
                    tp = TopSalaryStaff.get(i);
                    TopSalaryStaff.set(i, TopSalaryStaff.get(i + 1));
                    TopSalaryStaff.set(i + 1, tp);
                }
        }
        ArrayList <Employee> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++)
            result.add(TopSalaryStaff.get(i));
        return result;
    }

    ArrayList<Employee> getLowestSalaryStaff(int count) {
        if (count <= 0)
            return null;
        if (count > allEmployees.size())
            count = allEmployees.size();
        ArrayList<Employee> LowestSalaryStaff = new ArrayList<Employee>(allEmployees.size());
        LowestSalaryStaff.addAll(allEmployees);
        boolean isSorted = false;
        Employee tp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < LowestSalaryStaff.size() - 1; i++)
                if (LowestSalaryStaff.get(i).calcSalary() > LowestSalaryStaff.get(i + 1).calcSalary()) {
                    isSorted = false;
                    tp = LowestSalaryStaff.get(i);
                    LowestSalaryStaff.set(i, LowestSalaryStaff.get(i + 1));
                    LowestSalaryStaff.set(i + 1, tp);
                }
        }
        ArrayList <Employee> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++)
            result.add(LowestSalaryStaff.get(i));
        return result;
    }
}