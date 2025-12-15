public class Student {

    // Private fields
    private String name;      // full name
    private String id;        // student ID
    private String major;     // academic program
    private double gpa;       // current GPA
    private int credits;      // total earned credits

    // Constructor
    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Required methods
    public void addCredits(int c) {
        credits += c;
    }

    public void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    public boolean isHonors() {
        return gpa >= 3.5;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", credits=" + credits +
                '}';
    }
}
