
public class B {
	B get() {
		return this;
	}
	
	public void msg() {
		System.out.println("Hello World..");
	}
	
	public static void main(String[] args) {
		new B().get().msg();
	}

}
