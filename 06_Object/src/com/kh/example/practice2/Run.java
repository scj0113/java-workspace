package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		
		
		Circle c = new Circle();
		
		
        // 원의 넓이
		 double area = Circle.PI*(c.radius*c.radius);
		
		// 원의 둘레
		 double range =  2*Circle.PI*c.radius;
		
		
		
		

		System.out.println("원의 듈레 : "+2*Circle.PI*c.radius+"  "+"원의 넓이 : "+Circle.PI*(c.radius*c.radius));
				
		System.out.println();
		
		
		
		c.incrementRadius();
		System.out.println("원의 듈레 : "+2*Circle.PI*c.radius+"  "+"원의 넓이 : "+Circle.PI*(c.radius*c.radius));
		
	}

}
