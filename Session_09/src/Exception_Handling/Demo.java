package Exception_Handling;

public class Demo {
	
	public static void getMsg() {
		msg();
	}
	public static float msg() {
		return (10/0);
	}
	public static void main(String[] args) {
//		System.out.println(Demo.msg());
		getMsg();
		
	}
}
