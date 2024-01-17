package Shapes_EX;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14f * radius * radius;
	}

}
