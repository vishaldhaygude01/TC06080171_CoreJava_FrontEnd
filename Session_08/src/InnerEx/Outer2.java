package InnerEx;

public class Outer2 {

	private int i = 100;
	private static int a = 1;
	static class Inner{
		
		int no = 111;
		public void get() {
			
			System.out.println("no " + no);
//			System.out.println("i" + i);
			System.out.println("a " + a);
		}
	}
	
	public static void main(String[] args) {
		Outer2.Inner i = new Outer2.Inner();
		i.get();
		
		
	}
}
