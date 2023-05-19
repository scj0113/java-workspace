package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	
	
	public static void main(String[] agrs) {	
		
		CastingPractice sc = new CastingPractice();
		
		//  sc.method1();
        //  sc.method2();     
	}
		
		public void method1() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		char ch = sc.nextLine().charAt(0);
						
	    System.out.println( (char) ch +" unicode : "+ (int) ch  );    // A 부분 char <-> 형변환 사용해보세요!
	    
	    System.out.println((char) (ch+1) +" unicode : " + ((int)ch+1));  // B 부분도!
	    
	    // 형변환 해봤습니다!
	    
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
		
		    System.out.printf("평균 : %.2f" , (double) to/3); 
		    
		    
		    


		
			
			
			
		}
		
}