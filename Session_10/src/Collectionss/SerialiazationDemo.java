package Collectionss;

import java.io.Serializable;

public class SerialiazationDemo implements Serializable{

	
	private int rollNo;
	private String name;
	private transient float fees;
	
	public SerialiazationDemo() {};
	
	public SerialiazationDemo(int rollNo, String name, float fees) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
}
