public class Teacher {
    String name;
    String branch;
    String mpno;

    // Teacher sınıfının constructor metodu
    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    // Öğretmen bilgilerini yazdıran metot
    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Bölümü: " + this.branch);
        System.out.println("Telefonu: " + this.mpno);
    }
}
