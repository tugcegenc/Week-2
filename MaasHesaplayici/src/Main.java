public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kemal", 2000, 45, 1985);

        e1.Bonus();
        double totalSalary = e1.salary + e1.bonus - e1.tax(); // Vergi ve bonuslarla birlikte toplam maaş

        e1.raiseSalary();
        double totalSalary1 = e1.salary + e1.bonus + e1.raiseSalary - e1.tax(); // Vergi, bonuslar ve zam miktarıyla birlikte toplam maaş

        System.out.println(e1.toString()); // Çalışan bilgilerini yazdır
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalary);
        System.out.println("Toplam Maaş: " + totalSalary1);
    }
}
