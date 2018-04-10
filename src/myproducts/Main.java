package myproducts;

public class Main {

	
	public static void main(String[] args) {
		Product product = new Product("Kakao", 200 , 27);
		BreadCopy bread=new BreadCopy("rozs", 250, 10, 0.75);
		System.out.println(product+  " "+bread);
		Product product2=new BreadCopy("fehér", 200, 14, 1);
		System.out.println(product2);
		BreadCopy bread2=new BreadCopy("fini", 400 , 14, 1);
		if(BreadCopy.compareBreads((BreadCopy) product2, bread2)){
			System.out.println(product2);
		}
		else System.out.println(bread2);
	}

}
