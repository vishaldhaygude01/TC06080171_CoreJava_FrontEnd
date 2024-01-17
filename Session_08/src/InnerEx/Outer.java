package InnerEx;

public class Outer {

	private int no = 100;
	protected class Inner{
		int no = 1000;
		
		public void getNo() {
			int no = 10;
			System.out.println("No = "+no);
			System.out.println("Inner No = "+ this.no);
			System.out.println("Outer No = "+ Outer.this.no);
		}
	}
	
	public void get() {
		Inner i = new Inner();
		i.getNo();
	}
	public static void main(String[] args) {
		
		
		Outer o = new Outer();
//		Inner i = new Inner();
//		i.getNo();
		o.get();
		
		
		Inner i = new Outer().new Inner();
		i.getNo();
	}
} 
