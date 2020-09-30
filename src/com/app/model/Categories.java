package com.app.model;

import java.util.HashMap;

public class Categories {
	private int Id;
	private HashMap<String, HashMap<String , String>> prod;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public HashMap<String, HashMap<String, String>> getProd() {
		return prod;
	}
	public void setProd(HashMap<String, HashMap<String, String>> prod) {
		this.prod = prod;
	}
	@Override
	public String toString() {
		return "Categories [Id=" + Id + ", prod=" + prod + "]";
	}
	

}
