package com.shop.model;

public class DetailBean {

	public String name,date;
	public float price;
	public int qty,id;
	
	public void setName(String name) {  
		this.name = name;  
	}  
	public String getName() {  
	      return name;
	}
	
	public void setPrice(float price) {  
		this.price = price;  
	}  
	public float getPrice() {  
	      return price;
	}
	
	public void setQty(int qty) {  
	    this.qty=qty;  
	}  
	public int getQty() {  
	    return qty;  
	}
	public void setDate(String date) {  
		this.date = date;  
	}  
	public String getDate() {  
	      return date;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public int getId() {  
	      return id;
	}

}
