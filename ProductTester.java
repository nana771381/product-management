package productManagementSystem;
import java.util.*;

public class ProductTester {
	
	static void menu() {
		System.out.println("1 - Display Products ");
		System.out.println("2 - Add Product ");
		System.out.println("3 - Delete Product");
		System.out.println("4 - Discontinue Products");
		System.out.println("5 - Add Stocks");
		System.out.println("6 - Delete Stocks");
		System.out.println("0 - Exit");
	}
	
	public static void main(String[] args) {
		int choice;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> shopList = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setProductNum(0);
		p1.setProductName("Nike");
		p1.setPrice(99.99);
		p1.setQuantity(2);
		
		shopList.add(p1);
		
		do {
			
			Product p = new Product();
			menu();
			choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				p.displayItems(shopList);
				if (shopList.size()== 0) {
					System.out.println("Empty");
				}
			    break;
				
			case 2:
				
						
				System.out.println("Enter Product no: ");
				p.setProductNum(sc.nextInt());
				
				System.out.println("Enter Product Name");
				sc = new Scanner(System.in);
				String t = sc.next();
				p.setProductName(t);
				
				System.out.println("Enter Item price");
				p.setPrice(sc.nextDouble());
				
				
				System.out.println("Enter Product Quantity");
				p.setQuantity(sc.nextInt());
				
				p.addNewItem(p);
				shopList.add(p);
				
				break;
			    
			    
			case 3:
				// delete product here
				System.out.println("Which Product would you like to delete?");
				
				try {
					int i = sc.nextInt();
				Product r = shopList.get(i);
				shopList.remove(r);
					if(i>shopList.size())
						throw new Exception ("Index " + i + " out of bounds");
				}
				catch(Exception e) {
					System.out.println("Product does not exist");
				}
				break;
			case 4: 
				//discontinue here
				System.out.println("Which Product would you like to discontinue?");
				
				try {
					int j = sc.nextInt();
					Product a = shopList.get(j);
				a.setActive(false);
				
					if(j>shopList.size())
						throw new Exception ("Index " + j + " out of bounds");
				}
				catch(Exception e) {
					System.out.println("Product does not exist");
				}
				
				break;
				
			case 5: 
				
				System.out.println("Which Product would you like to add stocks?");
				Product b = shopList.get(sc.nextInt());
				
				System.out.println("How much stocks would you like to add?");
				int add = sc.nextInt();
				b.setQuantity(b.getQuantity() + add);
				
				
				break;
				
			case 6: 
				
				System.out.println("Which Product would you like to delete stocks?");
				Product c = shopList.get(sc.nextInt());
				
				System.out.println("How much stocks would you like to delete?");
				int dlt = sc.nextInt();
			
				break;
			
			}
		}while (choice!= 0);
		System.out.println("Bye bye!");
	}

}
