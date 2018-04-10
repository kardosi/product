package myproducts;

public class BreadCopy extends Product {

	
	private double volume;
	
	public BreadCopy(String name, int price, int key, double volume) {
		super(name, price, key);
		this.volume=volume;
		// TODO Auto-generated constructor stub
	}

	

	public float getVolume() {
		return volume;
	}
	public String toString() {
		return "BreadCopy [volume=" + volume + ", toString()="+ super.toString() + "]";
	}
	public int getWeightedPrice(){
		return (int) (getPriceWitkKey()/volume);
	}
	public double getSize(){
		return volume;
	}
	
	public static boolean isBiggerInVolume(BreadCopy breadCopy1, BreadCopy breadCopy2){
		if(breadCopy1.getWeightedPrice()>breadCopy2.getWeightedPrice()){
			return true;
			
		}
		else return false;
	}

}
