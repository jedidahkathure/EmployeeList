
    public class Student {
        // Define the Student class
        String name;
        String studentId;
        String major;

        // Constructor
        public Student(String name, String studentId, String major) {
            this.name = name;
            this.studentId = studentId;
            this.major = major;
        }

        // Display student information
        public void display() {
            System.out.println("Name: " + name + ", ID: " + studentId + ", Major: " + major);
        }
    }

    class StudentDemo {
        public static void main(String[] args) {
            // Initialize the array of Student objects
            Student[] students = new Student[3];

            // Add students to the array
            students[0] = new Student("Emily White", "S001", "Computer Science");
            students[1] = new Student("David Lee", "S002", "Mathematics");
            students[2] = new Student("Sophia Garcia", "S003", "Physics");

            // Access and update student information
            students[2].major = "Astrophysics"; // Update major

            // Display student information
            for (Student student : students) {
                student.display();
            }
        }
    }

