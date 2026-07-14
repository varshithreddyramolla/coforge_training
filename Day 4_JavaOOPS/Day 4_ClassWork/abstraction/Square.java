package com.coforge.day4.abstraction;

public class Square extends Figure {
	public Square() {
		super(4);
	}
	
	@Override
	public void area() {
		int side = getSide();
		System.out.println(side*side);
	}
}
