package Assignment;
import java.util.*;
public class Test {

  public static void main(String[] args) {
    Student s[] = new Student[5];
    s[0] = new CollegeStudent(11, 89.34f, 5);
    s[1] = new CollegeStudent(12, 78.04f, 7);
    s[2] = new SchoolStudent(1, 98.83f, 10);
    s[3] = new SchoolStudent(2, 60.07f, 12);
    s[4] = new SchoolStudent(3, 74.68f, 10);
    for(int i=0; i<5; i++) {      
      s[i].show();
    }
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<5; i++) {
      if(s[i].getRollNo() == n) {
        s[i].show();
      }
    }
    sc.close();
    
    int AgradeStudents = 0;
    for(int i=0; i<5; i++) {
      if(s[i].percentage > 75) {
        AgradeStudents++;
      }
    }
    System.out.println("A grade Students are -> " + AgradeStudents);
  }

}