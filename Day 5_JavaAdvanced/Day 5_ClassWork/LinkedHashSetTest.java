package com.coforge.day5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {


		Set<Integer> set = new LinkedHashSet<>(); 

		set.add(10); 
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(20);
		System.out.println(set);

		set.remove(20);
		System.out.println(set);

		// Traverse without index - enhanced for loop
		for (Integer i : set)
			System.out.println(i + " ");

		// Traverse using iterator
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
