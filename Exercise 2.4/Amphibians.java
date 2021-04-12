package Exercise;


public class Amphibians {
	String name;
	String colour;
	String special;
	int quantity;
	double weight;
	double price;
	
	//Create setter method
	
	public void setName(String name) {
		this.name = name;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Create getter method
	
	public String getName() {
		return this.name;
	}
	public String getColour() {
		return this.colour;
	}
	public String getSpecial() {
		return this.special;
		
	}
	public Integer getQuantity() {
		return this.quantity;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getPrice() {
		return this.price;
	}
	


}
