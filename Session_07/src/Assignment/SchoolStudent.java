package Assignment;

public class SchoolStudent extends Student{
  int className;
  
  public SchoolStudent() {
    
  }
  
  public SchoolStudent(int rollNo, float percentage, int className) {
    super(rollNo, percentage);
    this.className = className;
  }
  
  
  @Override
  public void show() {
    System.out.println("Roll No " + rollNo + " Percentage is " + percentage + " Class is " + className);
  }
}


public static void main(String)