package productManagementSystem;

import java.util.ArrayList;

public class Product {
	//declaration
	private int productNum;
	private String productName;
	private int quantity;
	private double price;
	private double inventory;
	boolean active=true;
	
	//default constructor for initialization of the variables
	public Product () {
		productNum = 0;
		productName = "";
		quantity = 0;
		price = 0.0;		
		
	}
	
	
	//getters and setters
	public Product ( int n, String name, int qty, double p) {
		productNum = n;
		productName = name;
		quantity = qty;
		price = p;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getInventory(double price, int quantity) {
		inventory = price *quantity;
		return inventory;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	public void addNewItem(Product p) {
		this.productName = p.productName ;
		this.productNum = p.productNum ;
		this.price = p.price ;
	}
	
	
	
	
	public void displayItems(ArrayList<Product> arr) {
		
		for (Product shop : arr) {
			String status = shop.getActive() == true?"Active":"Discontinued";
			System.out.println("---------------------------");
			System.out.println("Item Number: " + shop.getProductNum() + "\n" +
					"Product Name: " + shop.getProductName () + "\n" +
					"Quantity in Stock: " + shop.getQuantity() + "\n" +
					"Product Price: " + shop.getPrice() + "\n" +
					"Status: " + status + "\n" +
					"Stock in value: " + shop.getInventory(shop.getPrice(), shop.getQuantity()));
			System.out.println("--------------------------- ");
		}
		
	}
	
	
}
