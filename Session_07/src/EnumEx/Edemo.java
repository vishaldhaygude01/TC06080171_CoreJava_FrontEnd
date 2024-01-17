package EnumEx;

public class Edemo {

	public enum Coffee{SMALL(45), MEDIUM(60), LARGE(90);
	
		int price;
		Coffee(int price){
			this.price = price;
		}
	
		public int getPrice() {
			return price;
		}
	};
	
	public static void main(String[] args) {
		Coffee c = Coffee.MEDIUM;
		System.out.println(c + " Rs. "+ c.getPrice());
	}
	
}
