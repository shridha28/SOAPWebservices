package com.beans;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServceImpl {
	
	List<String> movies = new ArrayList<String>();
	List<String> books = new ArrayList<String>();
	List<String> music = new ArrayList<String>();
	
	public ProductServceImpl() {
		movies.add("Titanic");
		movies.add("Chak De");
		movies.add("Avatar");
		
		books.add("Head First Java");
		books.add("Head First Servlets");
		books.add("Macman");
		
		
		music.add("Unforgettable");
		music.add("Capital Letters");
		music.add("Thunder");
	}
	
	
	public List<String> getProducts(String category){
		
		switch (category.toLowerCase()) {
		case "books":
			return books;
		case "movies":
			return movies;
		case "music":
			return music;
		}
		
		return null;
	}
	
	public List<String>getProductsCategories(){
		
		
		  List<String> list = new ArrayList<String>(); list.add("Laws");
		  list.add("Movies"); list.add("Music");
		  
		  return list;
		 
	}
	
	
public boolean addProduct(String category,String product){
		
		switch (category.toLowerCase()) {
		case "books":
			books.add(product);
			break;
		case "movies":
			 movies.add(product);
		case "music":
			music.add(product);
		default:
			return false;
		}
		
		return true;
	}



public List<Product> getProductsV2(String category){
	List<Product> prodList = new ArrayList<Product>();
	prodList.add(new Product("Java","sku",12));
	prodList.add(new Product("abcf","abcf",1293));
	prodList.add(new Product("Naee","e8jeje",57712));
	
	return prodList;
}

}
