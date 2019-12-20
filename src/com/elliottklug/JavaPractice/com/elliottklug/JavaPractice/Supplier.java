package com.elliottklug.JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
	
	private String name;
	private final List<Product> products = new ArrayList<>();

	public Supplier(String name) 
	{
		this.setName(name);
	}

	public List<Product> products() 
	{
		return products;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

}
