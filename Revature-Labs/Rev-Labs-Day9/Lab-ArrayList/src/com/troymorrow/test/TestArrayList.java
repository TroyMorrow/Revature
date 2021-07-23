package com.troymorrow.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.troymorrow.model.Item;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		
		items.add(new Item(1,"This item is 1"));
		items.add(new Item(2,"This item is 2"));
		items.add(new Item(3,"This item is 3"));
		items.add(new Item(4,"This item is 4"));
		items.add(new Item(5,"This item is 5"));
		
		System.out.println(items.get(2));
		
		Item removed =items.remove(items.size()-1);
		System.out.println(removed);
		
		Iterator<Item> iter = items.iterator();
		
		while (iter.hasNext()) {
			Item item = iter.next();
			System.out.println("removing item: " + item);
			iter.remove();
			items.add(new Item(6, "This is a new item"));
		}
		
		System.out.println(items.size());
		
//		System.out.println(".....printing list.....");
//		
//		for (int i = 0; i<items.size(); i++) {
//			System.out.println(items.get(i));
//			items.remove(i);
//		}
		
	}
}
