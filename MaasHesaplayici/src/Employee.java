public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double bonus;
    int currentYear;
    double raiseSalary;

    // Employee sınıfının kurucusu
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonus = 0.0;
        this.currentYear = 2021;
        this.raiseSalary = 0.0;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (salary < 1000) {
            return 0.0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama metodu
    public double Bonus() {
        if (workHours >= 40) {
            double overtimeHours = workHours - 40;
            bonus = overtimeHours * 30;
        } else {
            bonus = 0.0;
        }
        return bonus;
    }

    // Maaş artışı hesaplama metodu
    public double RaiseSalary() {
        if (currentYear - hireYear < 10) {
            raiseSalary = salary * 0.05;
        } else if (currentYear - hireYear >= 10 && currentYear - hireYear < 20) {
            raiseSalary = salary * 0.10;
        } else {
            raiseSalary = salary * 0.15;
        }
        return raiseSalary;
    }

    // Toplam maaş hesaplama metodu
    public double TotalSalary() {
        double totalSalary = salary + Bonus() + RaiseSalary() - tax();
        return totalSalary;
    }

    // Çalışan bilgilerini string olarak döndüren metot
    public String toString() {
        return "=====ÇALIŞAN BİLGİLERİ=====" +
                "\nAdı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + Bonus() +
                "\nMaaş Artışı: " + RaiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (TotalSalary() - RaiseSalary()) +
                "\nToplam Maaş: " + TotalSalary();
    }
}
