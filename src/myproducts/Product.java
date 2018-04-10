package myproducts;

public class Product {

	private String name;
	private int price;
	private int key;
	
	public int getPriceWitkKey(){
		return price+(price*key/100);
		
	}
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", key=" + key
				+ "]";
	}
	public Product(String name, int price, int key) {
		super();
		this.name = name;
		this.price = price;
		this.key = key;
	}
	public void increasePrice(int percentage){
		
	}

}
