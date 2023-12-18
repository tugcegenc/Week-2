public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    // Student sınıfının constructor metodu
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        // Ortalama ve geçme durumu varsayılan olarak sıfır ve false olarak atanıyor
        double avarage = 0.0;
        boolean isPass = false;
    }

    // Öğrencinin notlarını eklemek için kullanılan metot
    void addBulkExamNote(double note1, double note2, double note3, double sNote1, double sNote2, double sNote3) {
        // Verilen notları ilgili derslere atama
        if (note1 >= 0 && note1 <= 100)
            this.c1.note = note1;

        if (note2 >= 0 && note2 <= 100)
            this.c2.note = note2;

        if (note3 >= 0 && note3 <= 100)
            this.c3.note = note3;

        if (sNote1 >= 0 && sNote1 <= 100)
            this.c1.sNote = sNote1;

        if (sNote2 >= 0 && sNote2 <= 100)
            this.c2.sNote = sNote2;

        if (sNote3 >= 0 && sNote3 <= 100)
            this.c3.sNote = sNote3;
    }

    // Öğrencinin geçme durumunu kontrol eden metot
    void isPass() {
        System.out.println("--------------");
        System.out.println(name);

        // Her dersin not ortalamasını sözlü ve sınav notlarının ağırlıklı ortalaması ile hesapla
        double c1 = (this.c1.sNote * 0.20) + (this.c1.note * 0.80);
        double c2 = (this.c2.sNote * 0.20) + (this.c2.note * 0.80);
        double c3 = (this.c3.sNote * 0.20) + (this.c3.note * 0.80);
        this.avarage = (c1 + c2 + c3) / 3.0;

        printNote();

        // Ortalama 55'ten büyükse öğrenci sınıfı geçmiş sayılır
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçti. ");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldı. ");
            this.isPass = false;
        }
    }

    // Öğrencinin notlarını yazdıran metot
    void printNote() {
        System.out.println(this.c1.name + " Sınav Notu: " + this.c1.note + " Sözlü Notu: " + this.c1.sNote);
        System.out.println(this.c2.name + " Sınav Notu: " + this.c2.note + " Sözlü Notu: " + this.c2.sNote);
        System.out.println(this.c3.name + " Sınav Notu: " + this.c3.note + " Sözlü Notu: " + this.c3.sNote);
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
