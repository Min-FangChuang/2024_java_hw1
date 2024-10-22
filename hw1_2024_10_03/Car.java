package hw1_2024_10_03;

public class Car {
	public Car(String model, String year, double price) {
		this.model = model;
		this.year = year;
		if(price>=0) {
			this.price = price;
		}
	}
	private String model;
	private String year;
	private double price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>=0) {
			this.price = price;
		}
	}
	
}
