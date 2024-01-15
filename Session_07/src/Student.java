class Student {
    int rollno;
    double percentage;

    public Student() {
        // Default constructor
    }

    public Student(int rollno, double percentage) {
        this.rollno = rollno;
        this.percentage = percentage;
    }

    public void show() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Percentage: " + percentage + "%");
    }
}

class CollegeStudent extends Student {
    int semester;

    public CollegeStudent() {
        // Default constructor
    }

    public CollegeStudent(int rollno, double percentage, int semester) {
        super(rollno, percentage);
        this.semester = semester;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Semester: " + semester);
    }
}

class SchoolStudent extends Student {
    String classname;

    public SchoolStudent() {
        // Default constructor
    }

    public SchoolStudent(int rollno, double percentage, String classname) {
        super(rollno, percentage);
        this.classname = classname;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Class: " + classname);
    }
}

public class XYZ {
    public static void main(String[] args) {
        // Create an array to store objects of any class (Student, CollegeStudent, SchoolStudent)
        Student[] students = new Student[5];

        // Create CollegeStudent objects
        students[0] = new CollegeStudent(101, 80.5, 3);
        students[1] = new CollegeStudent(102, 68.9, 5);

        // Create SchoolStudent objects
        students[2] = new SchoolStudent(201, 95.2, "12th");
        students[3] = new SchoolStudent(202, 70.5, "10th");
        students[4] = new SchoolStudent(203, 82.0, "11th");

        // Display all records from the array
        System.out.println("All Student Records:");
        for (Student student : students) {
            student.show();
            System.out.println();
        }

        // Search for a record based on roll number
        int searchRollNo = 202;
        for (Student student : students) {
            if (student.rollno == searchRollNo) {
                System.out.println("Record found for Roll Number " + searchRollNo + ":");
                student.show();
                if (student instanceof SchoolStudent) {
                    System.out.println("This is a School Student.");
                } else if (student instanceof CollegeStudent) {
                    System.out.println("This is a College Student.");
                }
                break;
            }
        }

        // Count the number of students with A grade (percentage > 75)
        int countAGradeStudents = 0;
        for (Student student : students) {
            if (student.percentage > 75) {
                countAGradeStudents++;
            }
        }
        System.out.println("Number of students with A grade (percentage > 75): " + countAGradeStudents);
    }
}