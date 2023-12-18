public class Main {
    public static void main(String[] args) {
        // Öğretmenler oluşturuluyor
        Teacher t1 = new Teacher("Mahmut", "TRH", "555");
        Teacher t2 = new Teacher("Ayşe", "FZK", "0000");
        Teacher t3 = new Teacher("Fatma", "BIO", "1111");

        // Dersler oluşturuluyor ve her dersin öğretmeni atanıyor
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);
        //biyo.printTeacher();

        // Öğrenciler oluşturuluyor, her bir öğrenciye üç ders atanıyor ve notları giriliyor

        Student s1 = new Student("Ezgi", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(40, 40, 40, 80, 80, 80); // Sınav ve sözlü notları giriliyor
        s1.isPass(); // Geçme durumu kontrol ediliyor

        Student s2 = new Student("Tuğçe", "444", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(100, 100, 100, 50, 50, 50); // Sınav ve sözlü notları giriliyor
        s2.isPass(); // Geçme durumu kontrol ediliyor
    }
}
