package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	
	
	public static void main(String[] agrs) {	
		
		CastingPractice sc = new CastingPractice();
		
		//sc.method1();
          sc.method2();     
	}
		
		public void method1() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		char ch = sc.nextLine().charAt(0);
					
	    int num1 =  ch;
		
	    System.out.println("A unicode : "+ (int) ch  );
	    
	    System.out.println("B unicode : " + ((int)ch+1));
	    
	    
	    
		}
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 : ");
			int ko =  sc.nextInt();	
			
			System.out.print("영어 : ");
			int en =  sc.nextInt();	
			
			System.out.print("수학 : ");
			int ma =  sc.nextInt();	
			
			
			int to = (ko+en+ma);
			
			
			System.out.println("총점 : " + to );
		
		    System.out.printf("평균 : " + (double) to/3); 
		    
		    
		    


		
			
			
			
		}
		
}