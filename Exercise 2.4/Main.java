package Exercise;

public class Main {

	public static void main(String[] args) {

		Amphibians salamander = new Amphibians(); //Create first new object 
		
		salamander.setName("Salamander");
		salamander.setColour("Black Yellow");
		salamander.setSpecial("Moist skin");
		salamander.setQuantity(2);
		salamander.setWeight(0.75);
		salamander.setPrice(1100);
		
		System.out.println("Amphibians name : " + salamander.getName());
		System.out.println("Colour : " + salamander.getColour());
		System.out.println("Specialty : " + salamander.getSpecial());
		System.out.println("Quantity : " + salamander.getQuantity());
		System.out.printf("Weight : %.2fkg",salamander.getWeight());
		System.out.printf("\nPrice : RM%.2f",salamander.getPrice());
		
		System.out.println();
		
		Amphibians frog = new Amphibians(); //Create second new object
		
		frog.setName("Tree Frog");
		frog.setColour("Green");
		frog.setSpecial("Special toe pads");
		frog.setQuantity(10);
		frog.setWeight(0.50);
		frog.setPrice(210);
		
		System.out.println("\nAmphibians name : " + frog.getName());
		System.out.println("Colour : " + frog.getColour());
		System.out.println("Specialty : " + frog.getSpecial());
		System.out.println("Quantity : " + frog.getQuantity());
		System.out.printf("Weight : %.2fkg",frog.getWeight());
		System.out.printf("\nPrice : RM%.2f",frog.getPrice());
		
	}
}
	
