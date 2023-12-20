public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double bonus;
    int currentYear;
    double raiseSalary;

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
    void Bonus() {
        if (workHours >= 40) {
            double overtimeHours = workHours - 40;
            bonus = overtimeHours * 30;

        } else {
           return;
        }
    }

    // Zam hesaplama metodu
    void raiseSalary() {
        if (currentYear - hireYear < 10) {
            double raise = salary * 0.05;
            raiseSalary = raise; // 10 yıldan az çalışanlara %5 zam
        }
        if (currentYear - hireYear >= 10 && currentYear - hireYear < 20) {
            double raise = salary * 0.10;
            raiseSalary = raise; // 10-20 yıl arası çalışanlara %10 zam
        }
        if (currentYear - hireYear >= 20) {
            double raise = salary * 0.15;
            raiseSalary = raise; // 20 yıldan fazla çalışanlara %15 zam
        }
    }

    // Çalışan bilgilerini yazdırma metodu
    public String toString() {

        System.out.println("=====ÇALIŞAN BİLGİLERİ=====");

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raiseSalary;
    }
}
