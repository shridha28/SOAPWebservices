package com.beans;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalog {
	
	ProductServceImpl prod= new ProductServceImpl();
	
	@WebMethod
	public List<String>getProductsCategories(){
	
		return prod.getProductsCategories();
	}
	
	
	
	@WebMethod
	public List<String>getProducts(String category){
	
		return prod.getProducts(category);
	}
	
	
	@WebMethod
	public boolean addProduct(String category,String product){
	
		return prod.addProduct(category, product);
	}
}
