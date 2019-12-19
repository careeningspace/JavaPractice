package com.elliottklug.JavaPractice;

public class Product implements Comparable<Product>  
{
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
}