package com.elliottklug.JavaPractice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        WebsiteClass websiteClass = new WebsiteClass();
*        websiteClass.printURLs();
*/        
        Shipment shipment = new Shipment();
//        List<Product> lightShipment;
//    	List<Product> heavyShipment;

		shipment.add(ProductFixtures.door);
		shipment.add(ProductFixtures.window);
		shipment.add(ProductFixtures.floorPanel);
		shipment.add(ProductFixtures.door);
		shipment.add(ProductFixtures.window);
		shipment.add(ProductFixtures.floorPanel);
//		for (Product product : shipment)
//			System.out.println(product.toString());
		shipment.prepare();
		for (Product product : shipment)
			System.out.println(product.toString());
//		System.out.println(shipment.getHeavyVanProducts());
		System.out.println(shipment.getHeavyVanProducts().size());
		System.out.println();
		for (Product product : shipment.getHeavyVanProducts())
			System.out.println(product.toString());
		System.out.println();
//		heavyShipment = shipment.getHeavyVanProducts();
//		lightShipment = shipment.getLightVanProducts();

		System.out.println(shipment.getLightVanProducts().size());
		System.out.println();
		for (Product product : shipment.getLightVanProducts())
			System.out.println(product.toString());
    }
    
	
	static void AddItems() 
	{
	}

}