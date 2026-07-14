package com.coforge.day5;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedListTest2 {

	public static void main(String[] args) {


		List<Integer> list = new LinkedList<>(); // <> - generics, to store integer object

		list.add(new Integer(10)); // Boxing
		list.add(20); // Auto-Boxing
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		System.out.println(list);

		System.out.println(list.get(1));

		list.remove(2);
		System.out.println(list);

		list.set(0, 100);
		System.out.println(list);

		// traverse
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Traverse without index - enhanced for loop
		for(Integer i : list)
			System.out.println
			(i + " ");
		
		//Traverse using iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
