public class Main {

    public static void main(String[] args) {


        Student s1 = new Student("Alice Brown", "S001", "CS");
        Student s2 = new Student("Bob Smith", "S002", "IT");
        Student s3 = new Student("Charlie Green", "S003", "Math");
        Student s4 = new Student("Diana White", "S004", "CS");
        Student s5 = new Student("Evan Black", "S005", "Physics");


        s1.updateGPA(3.9); s1.addCredits(60);
        s2.updateGPA(3.2); s2.addCredits(45);
        s3.updateGPA(3.6); s3.addCredits(70);
        s4.updateGPA(2.9); s4.addCredits(30);
        s5.updateGPA(3.8); s5.addCredits(80);


        Student[] students = {s1, s2, s3, s4, s5};
        for (Student s : students) {
            System.out.println(s);
        }


        course course = new course("Object-Oriented Programming", "Dr. Smith", 5);
        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }

        System.out.println("\nCourse Info:");
        System.out.println(course);
        System.out.println("Highest credit student: " + course.highestCreditStudent());


        System.out.println("\nArray Processing:");
        System.out.println("Top GPA student: " + getTopStudent(students));
        System.out.println("Honors students count: " + countHonors(students));
        System.out.println("Total credits: " + totalCredits(students));
    }


    public static Student getTopStudent(Student[] arr) {
        Student top = null;
        for (Student s : arr) {
            if (top == null || s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int sum = 0;
        for (Student s : arr) {
            sum += s.getCredits();
        }
        return sum;
    }
}