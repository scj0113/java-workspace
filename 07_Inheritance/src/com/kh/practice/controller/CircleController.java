package com.kh.practice.controller;

import com.kh.practice.model.Circle;

public class CircleController {
	
	
	private Circle circle = new Circle();
	
   
	
	public String  calcArea (int x, int y, int radius){
		
		
		
		circle.setX(x);
		circle.setY(y);		
		circle.setRadius(radius);
		
		
		return circle.draw()+Math.PI*(radius*radius);		
	}
	
   public String calcCircum (int x, int y, int radius ) {
	   
	    circle.setX(x);
		circle.setY(y);
		circle.setRadius(radius);
		
		return circle.draw()+2*Math.PI*radius;
	   
   }
	
   
	
	
	
	
	
}
