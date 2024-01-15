
public class Employee {
	
	private int empId;
	private String empName;
	
	public Employee() {
		
	}
	
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if ((this.empId == e.empId) && (this.empName.equals(e.empName)))
				return true;
		else
		return false;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(111, "abc");
		Employee e2 = new Employee(111, "abc");
		
		if(e1.equals(e2)) {
			System.out.println("Are equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		
		System.out.println("e1 = "+ e1.hashCode());
		System.out.println("e2 = "+ e2.hashCode());
	}
}
