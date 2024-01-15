package Exception_Handling;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		double d = a.div(5, 2);
		
		
		if(d < 1) {
			try {
				
				throw new MyException();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("d  = " + d  );
		}
	}
}
