package com.kh.practice.controller;


import com.kh.practice.model.Rectangle;

public class RectangleController {

	
	private Rectangle rectangle = new Rectangle();
	

	
	public String  calcArea (int x, int y, int height, int width){
		
		
		
		rectangle.setX(x);
		rectangle.setY(y);		
		rectangle.setHeight(height);
		rectangle.setWidth(width);
		
		
		return rectangle.draw()+ 2 * (width + height);		
	}
	
	
     public String calcPerimeter (int x, int y, int height, int width ) {
	   
	   rectangle.setX(x);
	   rectangle.setY(y);
	   rectangle.setHeight(height);
	   rectangle.setWidth(width);
		
	   
	   
	   return rectangle.draw()+width * height;
	   
   }
	
	
	
	
	
}
