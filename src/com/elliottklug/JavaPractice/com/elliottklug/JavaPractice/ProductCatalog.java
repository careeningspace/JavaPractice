package com.elliottklug.JavaPractice;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductCatalog implements Iterable<Product>
{
	// HasSets with content added to equals() 
	//private final Set<Product> products = new HashSet<>();
	
	//TreeSet() requires comparator recipe
	//private final SortedSet<Product> products = new TreeSet<>(Product.BY_NAME);
	private final SortedSet<Product> products = new TreeSet<>(Product.BY_WEIGHT);
	
	public void isSuppliedBy(Supplier supplier)
	{
		products.addAll(supplier.products());
	}
	@Override
	public Iterator<Product> iterator() 
	{
		// TODO Auto-generated method stub
		return products.iterator();
	}
	
	public Set<Product> lightVanProducts()
	{
		Product heaviestLightVanProduct = findHeaviestLightVanProduct();
		return products.headSet(heaviestLightVanProduct);
	}
	
	public Set<Product> heavyVanProducts()
	{
		Product heaviestLightVanProduct = findHeaviestLightVanProduct();
		return products.tailSet(heaviestLightVanProduct);
	}
	
	private Product findHeaviestLightVanProduct() {
		for (Product product: products) {
			if (product.getWeight() > 20)
			{
				return product;
			}
		}
		return products.last();
	}

}
