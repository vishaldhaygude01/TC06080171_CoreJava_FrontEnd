package Interface_EX;

public class Calculations extends CompareCal implements StaticCal, Facorial{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@Override
	public int avg(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b)/2;
	}
	
	@Override
	public int fact(int n) {
		
		int f = 1;
		for(int i=1;i<=n;i++) {
			f *= i;
		}
		return f;
	}

	
}
