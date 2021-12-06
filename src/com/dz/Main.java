package com.dz;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Company Mycompany = new Company();
        int fix_salary = 30000;
        Mycompany.hireAll("Operator", fix_salary, 180);
        Mycompany.hireAll("Manager", fix_salary, 80);
        Mycompany.hireAll("TopManager", fix_salary, 10);
        ArrayList<Employee> em = new ArrayList<Employee>(Mycompany.getTopSalaryStaff(10));
        System.out.println("Top Salary Staff:");
        for (Employee employee : em)
            System.out.println(Math.round(employee.calcSalary()) + " руб.");
        em = Mycompany.getLowestSalaryStaff(30);
        System.out.println("Lowest Salary Staff:");
        for (Employee employee : em)
            System.out.println(Math.round(employee.calcSalary()) + " руб.");
        for (int i = 0; i < Mycompany.getSize() / 2; i++)
            Mycompany.fire(i);
        em = Mycompany.getTopSalaryStaff(10);
        System.out.println("Top Salary Staff:");
        for (Employee employee : em)
            System.out.println(Math.round(employee.calcSalary()) + " руб.");
         em = Mycompany.getLowestSalaryStaff(30);
        System.out.println("Lowest Salary Staff:");
        for (Employee employee : em)
            System.out.println(Math.round(employee.calcSalary()) + " руб.");
    }
}
