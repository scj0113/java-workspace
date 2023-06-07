package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		
		Application app = new Application();
//		app.method1();
		app.method2();
	
	 
		
		
		// HashSet 또는 TreeSet 사용!
		// 로또 번호 : 1번만! 6개의 번호가 무작위
		// 내 번호 : 랜덤으로 6개 번호가 랜덤으로~ 계속~
		// 로또번호랑 일치할 때까지!
		
		
	}

	
	// TreeSet
	public void method1() {
		
		
		TreeSet<Integer> lotto = new TreeSet<>();
		
		for(int i =0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;		
			lotto.add(num);
		
		}
		
		
		
		int count = 0;
		while(true) {
			TreeSet<Integer> myLotto = new TreeSet();
			
			for(int i = 0; myLotto.size()<6; i++) {
				int num = (int)(Math.random()*45)+1;		
				myLotto.add(num);
			
				
				
				
			}
			if(lotto.equals(myLotto)) {
				System.out.println("로또 번호 : "+ lotto);
				System.out.println("내 번호 : "+ myLotto);
				System.out.println("횟수 : " + count);			
				break;
			}
			count++;
			System.out.println("로또 번호 : "+ lotto);
			System.out.println("내 번호 : "+ myLotto);
			
		}
	
	}


	

//HashSet
	public void method2() {
		HashSet<Integer> lotto = new HashSet<>();
		int count = 0;
		boolean check = true;

		for (int i = 0; lotto.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(num);
			
		}

		List lottoList = new ArrayList(lotto);
		Collections.sort(lottoList);

		// 내 번호는 반복문 안에 반복문
		while (check) {
			HashSet<Integer> myLotto = new HashSet<>();
			// 내 번호가 랜덤 6개 숫자 추출
			while (myLotto.size() < 6) {
				int choose = (int) (Math.random() * 45) + 1;
				myLotto.add(choose);
			}
			List myLottoList = new ArrayList(myLotto);
			Collections.sort(myLottoList);

			System.out.println("로또 번호: " + lottoList);
			System.out.println("내 번호 : " + myLottoList);
			count++;

			if (lottoList.equals(myLottoList)) {
				System.out.println("횟수 : " + count);
				break;
			}
		}
	}
}
