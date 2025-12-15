public class course {

    // Private fields
    private String courseName;      // name of the course
    private String instructor;      // instructor name
    private Student[] students;     // array of Student objects

    // Constructor
    public course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    // Inserts student into array
    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = s;
        }
    }

    // Computes average GPA
    public double courseAverageGPA() {
        double sum = 0.0;
        int count = 0;

        for (Student s : students) {
            if (s != null) {
                sum += s.getGpa();
                count++;
            }
        }

        return count == 0 ? 0.0 : sum / count;
    }

    // Returns student with highest credits
    public Student highestCreditStudent() {
        Student max = null;

        for (Student s : students) {
            if (s != null) {
                if (max == null || s.getCredits() > max.getCredits()) {
                    max = s;
                }
            }
        }

        return max;
    }

    public String toString() {
        return "course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", students=" + students.length +
                '}';
    }
}