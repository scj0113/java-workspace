package com.kh.loop;

import java.util.Scanner;

public class C_For {

	Scanner sc = new Scanner(System.in);
	
	
	
	/*
	 * For문
	 * 
	 * [표기법]
	 * 
	 * for(초기식; 조건식; 증감식){
	 *     ... 실행 코드...
	 * }
	 * 
	 * - 주어진 횟수만큼 코드를 반복 실행하는 구문
	 * 
	 * - 초기식은 반복문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * 
	 * - 조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문을 빠져나간다.
	 * 
	 * - 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 * 
	 * */
	
	
	
	// 1~5 출력
	
	public void method1() {

		
		
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println();

		
		for(int i=1; i<=5; i++) {			
			System.out.println(i);
			
		}
	 
		System.out.println();
		
		for(int i =0; i<5; i++) {
			System.out.println(i+1);
		}
	}
	
	
	/*
	 * 1~5 반대로 출력
	 * 
	 * 5
	 * 4
	 * 3
	 * 2
	 * 1
	 * 
	 * 
	 * */
	
	
	
	public void method2() {
		
		
		for(int i = 5; i>=1; i--) {
			System.out.println(i);
		}
		
			
	}
	/*
	 *  1~10 사이의 홀수만 출력
	 * 
	 * 
	 * */

	public void method3() {
		
		
		for(int i = 1; i <= 10; i+=2) {

			System.out.println(i);
		}
		
		
		
//		for(int i = 0; i < 10; i++) {   
//			if(i%2 == 0) {                 // if문 사용하는 방법
//			System.out.println(i+1);
//		}
//		}
//		
	}
	
	
	
	
	/*
	 *   continue문
	 * 
	 * - continue문은 반복문 안에서 사용
	 * - 반복문 안에서 continue문을 만나게 되면 " 현재 구문"을 종료
	 * - 반복문을 벗어나는 건 아님! 다음 반복을 계속 수행
	 * 
	 * */
	
	
	
	
	// 1~10 사이의 짝수만 출력
	
	
	public void method4() {
		
		
//		for(int i = 2; i<=10; i+=2) {
//			System.out.println(i);
		
		for(int i =1; i<=10; i++) {
			if(i%2!=0) continue;
			System.out.println(i);
		
		}
		
	
	}
	
	
	
	// 1~10까지의 합계
	
	public void method5() {
		
		
		int sum2 = 0;
		
		
		
		for(int i =1; i<=10; i++) {
			sum2 += i;
			System.out.println("1부터 "+i+"까지의 합계 : "+sum2);
			// 1+2+3+4+5+6+7+8+9+10
	
			
		}
		System.out.println(sum2);
		
	}
	
	// 1부터 사용자가 입력한 수까지의 합계
	
	public void method6() {
		
		
		
		
		
		System.out.print("숫자 입력 >  ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++ ) {
			sum += i; 
	
		}
		
		System.out.println("1부터 "+num+ "까지의 합계 : "+sum);
		
	}
	
	// 1부터 랜덤값까지의 합계
	
	/*
	 * jave.lang.Math 클래스에서 제공하는 random() 메소드 호출해서 
	 * 매번 다른 랜덤값을 얻어 낼 수 있음!
	 * 
	 * double ramdom = Math.random();
	 * */
	
	
	
	
	
	public void method7() {
		
//		int sum = 0;
//		
//		double random = Math.random();
//		System.out.println(random);     // 0.0 <= random < 1.0 
//		
//		random = Math.random()*10;
//		System.out.println(random); // 0.0 <= random < 10.0
//		
//		random = Math.random()*10+1;
//		System.out.println(random); // 1.0 <= random < 11.0
//		
//		
//		int num = (int) random;
//		System.out.println(num);
				
        int sum = 0;
        
		double random = Math.random();	
		
		random = Math.random()*10+1;	
		
		int num = (int)random;	
		
		for(int i=1; i <=num; i++) {			
			sum+=i;
		}		
		System.out.println("1부터 "+num+"까지의 합계 : "+sum);
	}
	
	/*
	 * H
	 * e
	 * l
	 * l
	 * o
	 * */
	
	
	
	
	public void method8() {
		
		
		String str = "Hello";
		
		/*
		 * H => str.charAt(0)
		 * e => str.charAt(1)
		 * l => str.charAt(2)
		 * l => str.charAt(3)
		 * o => str.charAt(4)
		 * */
		
		for(int i = 0; i<=4; i++) {
			System.out.println(str.charAt(i));			
		}
	
		
	}
	
	// 사용자한테 입력받은 문자열 출력
	
	
	public void method9() {
		
		int num = 0;
		
		
		
		System.out.print("사용자 입력 > ");
		String str = sc.nextLine();
		
		/*
		 * kiwi : 4글자
		 * 0123
		 * 
		 * banana : 6글자
		 * 012345
		 * 
		 * */
		
		
		 num = str.length();    //     length : 문자열 길이를 확인시켜주는 메소드
		
		for(int i = 0; i < num; i++) {
			System.out.println(str.charAt(i));
		
		
		
		}
		
	}
	
	/*
	 *  구구단 - 2단 출력
	 *  2 X 1 = 2
	 *  2 X 2 = 4
	 *  ...
	 *  2 X 9 = 18 
	 *   
	 * */
	
	
	
	
	public void method10() {
		
		for(int i = 1; i <= 9; i++) {	
			
			int b = i*2;			
			
			System.out.println("2 X "+i+" = "+b);
			
		}
		
	}
	
	
	/*
	 * 사용자가 입력한 단을 출력
	 * 단 수(2~9)를 입력 > 3
	 * 
	 * 3 X 1 = 3
	 * 
	 * 
	 * 
	 * 단을 잘못 입력하게되면 잘못 입력하셨습니다. 출력
	 * 
	 * */

	
	public void method11() {

		System.out.print("단 수(2~9)를 입력 > ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				int b = dan * i;

				System.out.println(dan + " X " + i + " = " + b);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");

		}

	}
	
	
	// 2 ~ 9단 출력
	
	public void method12() {

		
		
		for( int j=2; j<10; j++) {
			for(int i=1; i<10; i++) {
				System.out.println(j+" X "+i+" = "+j*i);
			}			
			System.out.println();
		}
		
	}
	
	
	/*
	 * 
	 *  *****
	 *  *****
	 *  *****
	 *  *****
	 *  
	 *  
	 * */
	
	
	public void method13() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print("*");
			}

			System.out.println();

		}

	}
	
	/*
	 * 1*** : i = 0, j = 0
	 * *2** : i = 1, j = 1
	 * **3* : i = 2, j = 2  
	 * ***4 : i = 3, j = 3
	 * 
	 * */
	
	
	public void method14() {

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print(i + 1);
				} else {
					System.out.print("*");

				}
			}
			System.out.println();
		}

	}
	
	
	/*
	 * *        i = 0 , j = 0
	 * **       i = 1 , j = 0 , j = 1
	 * ***      i = 2 , j = 0 , j = 1 , j = 2
	 * ****     i = 3 , j = 0 , j = 1 , j = 2 , j = 3 
	 * *****    i = 4 , j = 0 , j = 1 , j = 2 , j = 3 , j = 4
	 * */
	
	
	
	
	
	public void method15() {
		
//		for (int i = 0; i < 5; i++) {
//
//			for (int j = 0; j < 5; j++) {
//				if (i >= j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//
//	}

	for (int i = 0; i < 5; i++) {

		for (int j = 0; j <= i; j++) {
			System.out.print("*");
			if(i==j) System.out.println();
		}
	}
	
	}
	
	
	/*
	 *        *          i = 1  , j = 5
	 *       **          i = 2  , j = 4,5
	 *      ***          i = 3  , j = 3,4,5
	 *     ****
	 *    *****
	 * */

	
	public void method16() {
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
		
	
		
		
//		for(int i = 1; i < 6; i++){
//			for(int j = 5; j > 0; j--){
//				if(i < j){
//					System.out.print(" ");
//				}else{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}	
		

	
	
	public static void main(String[] args) {
		C_For c = new C_For();
	//	c.method1();
	//	c.method2();
	//	c.method3();
	//	c.method4();
	//	c.method5();
	//	c.method6();
	//	c.method7();
	//	c.method8();
	//	c.method9();
	//	c.method10();
	//	c.method11();
	//	c.method12();
	//	c.method13();
	//	c.method14();
	//	c.method15();
	//	c.method16();
 
	}

}









