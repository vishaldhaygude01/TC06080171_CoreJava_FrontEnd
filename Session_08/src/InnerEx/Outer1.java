package InnerEx;

public class Outer1 {

	private int i = 10;
	public void get() {
		
		class Inner {
			
			int no = 111;
			
			public void get() {
				
				System.out.println("No = " + no);
			}
		}
		
		Inner i = new Inner();
		i.get();
	}
	
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.get();
	}
}

