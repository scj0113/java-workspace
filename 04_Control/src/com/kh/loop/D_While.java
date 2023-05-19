package com.kh.loop;

import java.util.Scanner;

public class D_While {

	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 
	 * While문
	 * 
	 * [표현법]
	 * 
	 * while(조건식){
	 *      .. 실행 코드 ..
	 * }
	 * */
	public void method1() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println();

		int i = 1;

		while (i <= 5) {
			System.out.println(i);
			i++;
		}

	}
	
	
	/*
	 * break문
	 * - switch, 반복문의 실행을 중지하고 빠져나갈 때 사용
	 * - 반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만 빠져나간다.
	 * 
	 * */
	
	
	
	
	
	
	// for문 무한루프
	
	public void method2() {
		
		
		for(int i=1; i<=5;) {
			System.out.println();
			i++;
		}
		
		
		
		for(int i=1; ;) {
			if(i<=5) {
			System.out.println(i);
			i++;
		}else {
			break;
		}
		
		}
		
		int i=1;
		for(;;) {
			if(i<=5) {
				System.out.println(i);
				
			}else {
				break;
			}
			i++;
		}
		
		
	}
	
	
	// while문 무한루프
	public void method3() {
		int input = 0;
		while(true) {
			System.out.print("숫자 입력> ");
			input=sc.nextInt();
			System.out.println(input);
		}
	
	}

	/*
	 * do-while문
	 * 
	 * [표현법]
	 * 
	 * do{
	 *     .. 실행 코드..
	 * } while(조건식);
	 * 
	 * - 조건과 상관없이 무조건 한 번은 실행
	 * 
	 * */
	
	
	
	
	public void method4() {
		
	int number = 1;
	
	while(number == 0) {
		System.out.println("while문");
	}
	
	
	do {
		System.out.println("do-while문");
	}while(number == 0);
	
	}
	
	// 반복문 + 조건문
	
	
	/*
	 * 숫자 맞히기 게임!
	 * 1과 10 사이의 값을 입력해서 임의로 지정한(Random) 값을 맞히면 게임 끝 !
	 * 
	 * 게임이 끝나면 몇 번만에 숫자를 맞혔는지 출력!
	 * 
	 * (예 : 57)
	 * 
	 * 1과 100 사이의 값 입력 > 35
	 * 더 큰 수를 입력하세요.
	 * 
	 * 1과 100 사이의 값 입력 > 70
	 * 더 작은 수를 입력하세요.
	 * 
	 * 1과 100 사이의 값 입력 > 57
	 * 3번 만에 맞췄습니다.
	 * 
	 * */
	
	
	
	public void method5() {
		
		int number = 0;

		double random = Math.random();

		random = Math.random() * 100 + 1;

		int quiz = (int) random;

		int count = 0;

		while (quiz != number) {                                   // 랜덤된 숫자와 입력한 숫자가 맞지않으면 반복실행
			System.out.print("1과 100 사이의 값 입력 > ");             // 숫자 입력을 위한 출력
			number = sc.nextInt();                                 // 입력한 숫자 number 생성
			if (number > quiz) {                                   // if문 활용 입력한숫자(number) > 랜덤된 숫자(quiz) 보다 작을시 
				System.out.println("더 작은 수를 입력하세요.");          // 출력되는 문구 생성
			} else if (number < quiz) {                            // 입력한숫자(number) > 랜덤된 숫자(quiz) 보다 클시 
				System.out.println("더 큰 수를 입력하세요.");           // 출력되는 문구 생성

			}

			count++;                                               //  횟수 찾는방법은 랜덤된 숫자와 입력한 숫자가 맞지않으면 반복실행되므로 
		}                                                          // count라는 변수 생성하여 증감연산자 사용 (반복실행마다 count변수 숫자 증감)

		System.out.println(count + "번 만에 맞췄습니다. 정답은 : "+ quiz+"입니다."); // 정답시 while문에서 나오면서 증감되었던 count변수 숫자가 횟수가 됨

	}
	
	
	
	
	public static void main(String[] args) {
		
		D_While d = new D_While();
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
		d.method5();
		
	}

}
