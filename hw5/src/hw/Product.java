package hw;

/**
 * A product with a price and description.
 */
public class Product implements LineItem {
	private int quantity;

	/**
	 * Constructs a product.
	 * 
	 * @param description
	 *            the description
	 * @param price
	 *            the price
	 */
	public Product(String description, double price) {
		this.description = description;
		this.price = price;
		this.quantity = 1;

	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return description;
	}

	private String description;
	private double price;
	
	
	public int getQuantity() 
	{
		
		return this.quantity;
	}

	
	public void increaseQuantity() 
	{
		
		this.quantity += 1;
	}
}
