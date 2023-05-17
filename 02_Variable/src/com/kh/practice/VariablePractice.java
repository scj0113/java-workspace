package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	
	public static void main(String[] agrs) {	
		
		VariablePractice vp = new VariablePractice();
		
	//	vp.method1();
	//	vp.method2();
	//	vp.method3();
	//	vp.method4();
	}
		
		public void method1() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+ (num1 + num2));
	    System.out.println("빼기 결과 : "+ (num1 - num2));		
	    System.out.println("곱하기 결과 : "+ (num1 * num2));		
	    System.out.println("나누기 몫 결과 : "+ (num1 / num2));
		
		
		
		}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
	
		int adult = 10000;
		int student = 7000;
		
		int sum = (int) (adult*2);
		int sum2 = (int) (student*3);
		
		System.out.println("성인 2명 : " + sum);
		System.out.println("청소년 3명 : " + sum2);
		System.out.println();
		System.out.println("총 금액 : "+(sum+sum2));
	
	}
		
		
		public void method3() {
			
			int x = 5;
			int y = 7;
			int z = 9;
			
			x = 7;
			y = 9;
			z = 5;
			
			
			System.out.println("x="+ x);
			System.out.println("y="+ y);
			System.out.println("z="+ z);
			
			
			
			
			
			
			
			
		}
		
		
		
		public void method4() {
			
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("문자열을 입력하세요 : ");
		String num1 = sc.nextLine();
	System.out.println("첫번째 문자 : " + num1.charAt(0));
	char first = num1.charAt(0);
	System.out.println("두번째 문자 : " + num1.charAt(7));
	char last = num1.charAt(7);		
			
		}
		
		
		
		
	}