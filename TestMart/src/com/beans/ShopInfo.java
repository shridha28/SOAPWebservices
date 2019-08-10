package com.beans;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	
	@WebMethod
	public String getShopInfo(String property) {
		String response = "Invalid Property";
		if("shopName".equals(property))
			response = "TestMart";
		else if("since".equals(property)) {
			response = "since 2012";
		}
		return response;
	}

}
