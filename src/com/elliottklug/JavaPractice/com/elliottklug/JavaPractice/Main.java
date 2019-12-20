package com.elliottklug.JavaPractice;

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
		
		HelpDesk helpDesk = new HelpDesk();
		helpDesk.enquire(Customer.MARY, Category.PRINTER);
		helpDesk.enquire(Customer.JACK, Category.PHONE);
		helpDesk.enquire(Customer.JILL, Category.PRINTER);
		helpDesk.enquire(Customer.MARY, Category.COMPUTER);
		helpDesk.enquire(Customer.JACK, Category.PRINTER);

		
//		helpDesk.processAllEnquires();

		helpDesk.processPrinterEnquiry();
		helpDesk.processPrinterEnquiry();
		helpDesk.processGeneralEnquiry();
		helpDesk.processPrinterEnquiry();
    }
    

}