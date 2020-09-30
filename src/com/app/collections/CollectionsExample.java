package com.app.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionsExample {

	public static void main(String[] args) {
		Map<String, String> prod= new HashMap<String, String>();
		prod.put("1", "One");
		prod.put("2", "Two");
		prod.put("3", "Three");
		prod.put("4", "Four");
		
		Map<String, Map<String, String>> Category= new HashMap<String, Map<String,String>>();
		Category.put("0", prod);
		
		System.out.println("=========");
		System.out.println(Category.get("0").get("1"));
		System.out.println("=========");
		
		
		
	}
}
