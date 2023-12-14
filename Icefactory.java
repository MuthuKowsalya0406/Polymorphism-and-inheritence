package ABSTRACTION;

abstract class IceCream {
	int quantity;
	String icecreamName;
	double price;
	  public abstract void makeIceCream();{
		  
	  }
	  public void addToppings() {
	        System.out.println("Adding toppings to the ice cream.");
	    }

	  public void displayDetails() {
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Price: $" + price);
	    }
	}

public class Icefactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}



