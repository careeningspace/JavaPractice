package com.elliottklug.JavaPractice;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>  
{
	public static final Comparator<Product> BY_NAME = Comparator.comparing(Product::getName);
	public static final Comparator<Product> BY_WEIGHT = Comparator.comparing(Product::getWeight);
	
	private final String name;
	private final int weight;
	
	public Product(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() { return name; }
	
	public int getWeight() {return weight;}
	
	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", weight= " + weight + '}'; 
	}

	@Override
	public int compareTo(Product o) 
	{
		return this.weight - o.weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && weight == other.weight;
	}
	
	
}