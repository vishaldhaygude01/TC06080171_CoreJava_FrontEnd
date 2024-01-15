package T;

public class HOD extends Person{
	String branch;
	
	public HOD() {
		
	}

	public HOD(int id, String name, String branch) {
		super(id, name);
		this.branch = branch;
	}
	
	public void getData() {
		System.out.println("Branch = " + branch);
	}
	
}
