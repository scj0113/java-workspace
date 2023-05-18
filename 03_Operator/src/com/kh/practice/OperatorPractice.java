package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
		
		OperatorPractice op = new OperatorPractice();
		
		
	//	op.method1();
	//	op.method2();
	//	op.method3();
	//	op.method4();
	//	op.method5();
		op.method6();
	
		
	}

	
	
	public void method1() {
    
		
		Scanner sc = new Scanner(System.in);		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		int num1 = sc.nextInt();
		
		
		System.out.println("1인당 연필 개수 : "+ (num1/num));
		
		System.out.println("남는 연필 개수 : "+ (num1%num));
		
		
		
	}
	
	
	
	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("양수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		int num1 = (num%100);
		
		System.out.println(num-num1);
	
	}
	
    public void method3() {
		
		Scanner sc = new Scanner(System.in);
	
		
		boolean result = false;
		
		
		System.out.print("입력1 : ");
		int num = sc.nextInt();
		System.out.print("입력2 : ");
		int num1 = sc.nextInt();
		System.out.print("입력3 : ");
		int num2 = sc.nextInt();
	
		 result = (num == num1) && (num1 == num2); //  피드백 감사합니다!!
		
	// String result = (num == num1) && (num1 == num2)  ? "true" : "false"; 
	
	System.out.println(result);
	
	    // 실제 삼항 연산자에서 true, false를 직접 사용하지 않는 편이에요!
		// 논리 연산자만으로도 결과를 낼 수 있는 부분이라! 꼭 고쳤으면 해요!!
	
	
	
}
    
    
    
    public void method4() {
     
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num %2 == 0) ? "짝수다." : "홀수다.";
		
		System.out.println(result);
		

}

    public void method5() {
    	
    Scanner sc = new Scanner(System.in);	
    	
    System.out.print("나이 : ");	
    int age = sc.nextInt();
    
    
    
    String result = (age <= 13) ? "어린이" :  (age <= 19) ? "청소년" : "성인"; 
    
    // String result = (age <= 13) ? "어린이" : ((age > 13 ) && (age <= 19)) ? "청소년" : "성인";  // 피드백 감사합니다!!
    	
    	
    System.out.println(result);	
 	
    
   // 내일 조건문을 배우시면 이 부분을 좀 더 이해가 될 텐데요!
   // 잠깐 간단하게 설명하자면 age > 13은 불필요한 코드가 돼요! 앞에서 age <= 13으로 인해 굳이 사용할 필요가 없어져요 :)
    
    
    
    
    }   



	
	public void method6() {
		
	Scanner sc = new Scanner(System.in);
	
	
	
	
	System.out.print("사과의 개수 : ");
	int num = sc.nextInt();
	
	System.out.print("바구니의 크기 : ");
	int num1 = sc.nextInt();
 	
	// int result = (num/num1) + ((num%num1)/(num%num1));  // 해결 하였습니다!
	
	
	int num2 = (num%num1);
	
	int num3 =  (num/num1);
	
	int result = (num2 == 0) ? num3 :num3+1;
	
	System.out.println("필요한 바구니의 수 : "+ result);
	
	
	// 만약 사과의 개수가 100이고, 바구니의 크기가 10일 때 해볼까요? 아마 에러가 뜰거에요~~ 이 부분 꼭 해결해주세요!
	
	
	
	
	
	
}
}























