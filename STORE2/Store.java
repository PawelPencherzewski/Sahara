import java.util.*;
public class Store {
								// Creates the Store and its contents.
	String name;
	ArrayList<Product> catalogList = new ArrayList<Product>();
	
	public Store(String name) {
		this.name = name;
	}
	
	public void addProduct(Product p) {
		catalogList.add(p);
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Product> getCatalog() {
		return catalogList;
	}
}