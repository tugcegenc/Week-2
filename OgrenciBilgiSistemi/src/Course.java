public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sNote;

    // Course sınıfının constructor metodu
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        double note = 0;
        double sNote = 0;
    }

    // Öğretmen atama metodu
    void addTeacher(Teacher teacher) {
        this.teacher = teacher;
        // Eğer öğretmenin branşı dersin prefix'ine uyuyorsa, öğretmen dersin öğretmeni olarak atanır
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor! ");
        }
    }

    // Öğretmen bilgilerini yazdıran metot
    void printTeacher() {
        this.teacher.print();
    }
}
