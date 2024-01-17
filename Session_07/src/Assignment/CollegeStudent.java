package Assignment;

public class CollegeStudent extends Student {
  int semester;
  
  public CollegeStudent() {
    
  }
  
  public CollegeStudent(int rollNo, float percentage, int semester) {
    super(rollNo, percentage);
    this.semester = semester;
  }
  
  @Override
  public void show() {
    System.out.println("Roll No " + rollNo + " Percentage is " + percentage + " Semester is " + semester);
  }
}