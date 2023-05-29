package com.kh.practice.model;


public class Circle extends Point{
	
	// 원 넓이 파이r제곱
	// 원 둘레 2파이r 

	private int radius;

	
	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public String draw() {
		
		return super.draw() + "반지름: "+this.radius+" / ";
	}
	
	
	
}
