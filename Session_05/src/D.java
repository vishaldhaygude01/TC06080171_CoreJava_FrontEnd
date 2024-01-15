
public class D extends C{
	
	public D() {
		System.out.println("Child Default");
	}
	
	public D(int a) {
		super(10);
		System.out.println("Child Parameterized");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D(10);
	}

}
					