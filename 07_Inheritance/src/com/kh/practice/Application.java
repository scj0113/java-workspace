package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;


public class Application {
	
	
	
	private Scanner sc = new Scanner(System.in);

	private CircleController circlecontroller = new CircleController();
	
	private RectangleController rectanglecontroller = new RectangleController();
	
	
	
	public static void main(String[] args) {
		
		Application app = new Application();				
		app.mainMenu();
	
		
		}

	public void mainMenu() {
		
		
	
		
		boolean check = true;
		while(check) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
		
			
		
		switch(Integer.parseInt(sc.nextLine())) {
		case 1 : circleMenu();
		break;
		case 2 : retangleMenu();
		break;
		case 9 : 
			check = false;
			System.out.println("종료합니다");
		break;
		}
		
		}	
	}
	
	
	
	public void circleMenu(){
		
	
		
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		
		
		
		switch(Integer.parseInt(sc.nextLine())) {
		case 1 : calcCircum();
		break;
		case 2 : calcCircleArea();
		break;
		case 9 : 
		
		}
		
		
		
		
		
	}
	
	public void retangleMenu() {
		
	
		
		
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("3. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		switch(Integer.parseInt(sc.nextLine())) {
		case 1 : calcPerimeter();
		break;
		case 2 : calcArea();
		break;
		case 3 : 
		
		}
		
		
		
		
	}
	
	public void calcCircum(){
		
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());	
		
		System.out.println(circlecontroller.calcCircum(x, y, radius));
		
		
	}
	
	public void calcCircleArea(){
		
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(circlecontroller.calcArea(x, y, radius));
		
		
	}
	
	public void calcPerimeter(){
		
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		
		System.out.println(rectanglecontroller.calcPerimeter(x, y, height, width));
		
		
		
	}

	public void calcArea(){
		
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rectanglecontroller.calcArea(x, y, height, width));
	}
	
	

	
	
	
}



























