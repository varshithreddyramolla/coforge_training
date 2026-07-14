package com.coforge.day4.abstraction;

public class Triangle extends Figure {
	public Triangle() {
		super(4l,5l);
	}
	
	@Override
	public void area() {
		long area = (getBase() * getHeight()) / 2;
		System.out.println(area);
	}
}
