public class Product {
	private final String productID;
	private final String name;
	private double price;
	private int quantity;

	private Product(ProductBuilder builder) {
		this.productID = builder.productID;
		this.name = builder.name;
		this.price = builder.price;
		this.quantity = builder.quantity;
	}
  
	public String getProdID() {
		return productID;
	}
	
	public String getProdName() {
		return this.name;
	}
	
	public double getProdPrice() {
		return price;
	}
	
	public int getProdQuantity() {
		return quantity;
	}
	
	public void changeQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void changePrice(double price) {
		this.price = price;
	}
	
public static class ProductBuilder {
    private final String productID;
	private final String name;
	private double price = 0.00;
	private int quantity = 0;

    public ProductBuilder(String productID, String name) {
      this.productID = productID;
      this.name = name;
    }

    public ProductBuilder price(double price) {
      this.price = price;
      return this;
    }

    public ProductBuilder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    public Product build() {
      return new Product(this);
    }
  }
  
}