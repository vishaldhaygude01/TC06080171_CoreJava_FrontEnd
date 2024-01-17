
public class Employee {
    
    private static int totalEmployees = 0;
    private static double totalSalary1 = 0;

    private int empNo;
    private double salary;
    private double totalSalary;

    public Employee(double salary) {
        
        this.empNo = ++totalEmployees;
        this.salary = salary;
        this.totalSalary1 = (totalSalary1 += salary);
    }
    

    static {
    	totalEmployees = 60;
    }
    
    public static void displayTotals() {
        
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary: " + totalSalary1);
    }

    
    public static void main(String[] args) {
        
        Employee e1 = new Employee(50000);
        Employee e2 = new Employee(60000);
        Employee e3 = new Employee(75000);

        
        Employee.displayTotals();
    }
}


/*

Create class Employee with(emoNo, salary, totalSalry) with following features
a) Only parametrized constructor
b) totalsalry should be auto incremented
c) empNo should be auto incremented
d) display total employess and totalsalary using class method



Create a class student with two maintain 

*/