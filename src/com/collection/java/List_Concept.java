package com.collection.java;

import java.util.ArrayList;
import java.util.List;

public class List_Concept {

	
	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		
		l.add("name");
		l.add(null);
		l.add(17.05);
		l.add(true);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		
	}
}
