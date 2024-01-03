package vendingMachine;

public class MenuClass {
	
	private String name;
	private double price;
	private int quantity;
	
	
	private MenuClass(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}

}
