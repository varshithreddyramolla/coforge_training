package com.coforge.day6.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15);

		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		long x = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(x);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);

		List<String> names = Arrays.asList("Mercury", "Venus", "Pluto", "Jupiter", "Mars");

		names.stream().filter(n -> n.contains("a")).map(n -> n.length()).forEach(System.out::println);
		
		Date date = new Date();
		System.out.println(date);
		
		LocalDate dat = LocalDate.now();
		System.out.println(dat);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		Map<Integer, String> m = names.stream().collect(Collectors.toMap(n -> n.length(), n -> n));
		System.out.println(m);
	}

}
