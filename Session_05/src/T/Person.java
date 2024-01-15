package T;
import java.util.Scanner;
public class Person {
	int id;
	String name;
	protected Scanner s = new Scanner(System.in);
	
	public Person() {
		
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public void getData() {
		System.out.println("id = "+ id +", " + "name " + name );
	}

}
