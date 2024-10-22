package hw1_2024_10_03;

public class CarApplication {

	public static void main(String[] args) {
		Car Car1 = new Car("abcd", "1997", 300.75);
		Car Car2 = new Car("efgh", "1989", 525.25);
		System.out.printf("%s: %f%n", Car1.getModel(), Car1.getPrice());
		System.out.printf("%s: %f%n", Car2.getModel(), Car2.getPrice());
		
		System.out.printf("%n--discount--%n%n");
		Car1.setPrice(Car1.getPrice()* 0.95);
		Car2.setPrice(Car2.getPrice()* 0.93);
		
		System.out.printf("%s: %f%n", Car1.getModel(), Car1.getPrice());
		System.out.printf("%s: %f%n", Car2.getModel(), Car2.getPrice());
	}

}
