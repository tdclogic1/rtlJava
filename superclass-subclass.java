public class Main {
// Superclass
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println("Studying...");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent(String name, int age, String major) {
        super(name, age); // Calling the superclass constructor
        this.major = major;
    }

    public void attendLectures() {
        System.out.println("Attending lectures...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the superclass method
        System.out.println("Major: " + major);
    }
}

// Usage example
public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        student.study();
        student.displayInfo();

        System.out.println("-----");

        UndergraduateStudent undergrad = new UndergraduateStudent("Jane", 19, "Computer Science");
        undergrad.study();
        undergrad.attendLectures();
        undergrad.displayInfo();
    }
}
    
}
