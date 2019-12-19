package com.elliottklug.JavaPractice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        WebsiteClass websiteClass = new WebsiteClass();
*        websiteClass.printURLs();
*/        
        Shipment shipment = new Shipment();
        List<Product> lightShipment;
    	List<Product> heavyShipment;

		shipment.add(ProductFixtures.door);
		shipment.add(ProductFixtures.window);
		shipment.add(ProductFixtures.floorPanel);
		shipment.add(ProductFixtures.door);
		shipment.add(ProductFixtures.window);
		shipment.add(ProductFixtures.floorPanel);
//		for (Product product : shipment)
//			System.out.println(product.toString());
		shipment.prepare();
//		for (Product product : shipment)
//			System.out.println(product.toString());
		System.out.println(shipment.getHeavyVanProducts());
		System.out.println();
		for (Product product : shipment.getHeavyVanProducts())
			System.out.println(product.toString());
		
		heavyShipment = shipment.getHeavyVanProducts();
		lightShipment = shipment.getLightVanProducts();
		System.out.println(heavyShipment.size());
		System.out.println(lightShipment.size());

		for (Product product : heavyShipment)
			System.out.println(product.toString());
    }
    
	
	static void AddItems() 
	{
	}

}