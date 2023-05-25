package com.kh.condition;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		ConditionPractice c = new ConditionPractice();
		
		
		//   1. num > 0이 공통적으로 조건식에 들어가기에 이 경우 중첩 if문으로 빼셔도 좋아요~
		//   3. 나머지가 0인지 아닌지만 판단해도 될거에요!
		//   4. 불합격입니다 출력하는 부분들 하나의 조건식으로 해결 할 수 있어요! 연산자에서 어떤 걸 사용하면 좋을지 고민!
		//   7. 공통적으로 들어가는 조건식은 바깥으로 중첩 if문으로 빼시는 것 추천!
		//   8.앞에 if문들에 의해서 걸러져서 마지막 else if 대신 else만 써도 괜찮아요!  
		
		
		
		
	//	c.practice1();      조건을 간결화하고 중첩으로 뺐습니다!
	//	c.practice2();      
	//	c.practice3();      불필요한 조건을 하나 뺏습니다! 
	//	c.practice4();      //논리 연산자를 사용하여 묶어보았습니다!
	//	c.practice5();     
	//	c.practice6();
	//	c.practice7();      피드백 받아서 해보았습니다!!
	//	c.practice8();      확인 감사드립니다! 변경 하였습니다.
	//	c.practice9();     
	//	c.practice10();
	//	c.practice11();    
	
	
		
	}

    /*
       키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
       짝수가 아니면 “홀수다“를 출력하세요.
       양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
    
       숫자를 한 개 입력하세요 : -8
       양수만 입력해주세요.
     */
    
	public void practice1() {
    	
    	
        System.out.print("정수 > ");
        int num=sc.nextInt();
       
        
        if(num > 0) {
        
       if(num%2 != 1 ) {
    	   System.out.println("짝수다");
       }else
    	   System.out.println("홀수다");
    		   
    	   }else { 
    		   System.out.println("양수만 입력해주세요."); 
    	   }
   
    	
    	
    	
    	
        
    }

    /*
        정수 num1과 num2가 매개변수로 주어진다. 두 수가 같으면 1 다르면 -1을 출력하세요.

        num1 : 2
        num2 : 3
        -1

        num1 : 11
        num2 : 11
        1
     */
    public void practice2() {
        
    	System.out.print("num1 : ");
    	int num1 = sc.nextInt();
    	
    	System.out.print("num2 : ");
    	int num2 = sc.nextInt();
    	
    	if(num1==num2) {
    		System.out.println("1");
    	}else {
    		System.out.println("-1");
    	}
   
    	
    }

    /*
        A 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라준다.
        피자 조각 수와 피자를 먹는 사람의 수를 입력받아 한 사람 당 최소 한 조각 이상 피자를 먹으려면 
        최소 몇 판의 피자를 시켜야 하는지 출력하세요.

        피자 조각 수 : 7
        피자 먹는 사람 수 : 10
        2

     */
    public void practice3() {
    	
    	
    	System.out.print("피자 조각 수 : ");
    	int pi = sc.nextInt();
    	System.out.print("피자를 먹는 사람의 수  : ");
    	int people = sc.nextInt();
    	
    	
    	int num = (people/pi);
    	int num1 = (people%pi);
    	
    	if( num1 <= 0 ) {
    		System.out.println(num);
    	} else
    		System.out.println(num+1);
    	}
    
    

    /*
        국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        불합격인 경우에는 “불합격입니다.”를 출력하세요.
    
        국어점수 : 88 
        수학점수 : 50 
        영어점수 : 40 
        불합격입니다.

        국어점수 : 88
        수학점수 : 50
        영어점수 : 45
        국어 : 88
        수학 : 50
        영어 : 45
        합계 : 183
        평균 : 61.0
        축하합니다, 합격입니다!
     */
    public void practice4() {
  
    	
    	
    	
    	System.out.print("국어점수 : ");
    	int ko = sc.nextInt();		
    	System.out.print("영어점수 : ");
    	int en = sc.nextInt();		
    	System.out.print("수학점수 : ");
    	int ma = sc.nextInt();	
    	
 
    	double aver = (ko+en+ma)/3;
    	
    	int to = (ko+en+ma);
    	
    	if(ko >= 40 && en >= 40 && ma >= 40 && aver >= 60) {
    	 	System.out.println("국어 : "+ko);	
        	System.out.println("수학 : "+ma);	
        	System.out.println("영어 : "+en);	
        	System.out.println("합계 : "+to);	
        	System.out.println("평균 : "+aver);	
        	System.out.println("축하합니다, 합격입니다!");	  		
    	} else {
    		System.out.println("불합격입니다.");
    		
    	}
    	
    	
    	
 
    }
    
   	
   

    /*
        B 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만원 이상 사면 20%를 할인해준다.
        구매한 옷의 가격을 입력했을 때, 지불해야 할 금액을 출력하세요.
        
        구매한 옷 가격 : 580,000
        464,000
     */
    public void practice5() {
    	
    	
    	
    	System.out.print("구매한 옷 가격 : " );
    	int price = sc.nextInt();
    	
    	
    	double five = price*0.05;
    	double ten =  price*0.1;
    	double tw = price*0.2;   
    	
    	int f = (int) five;
    	int tt = (int) ten;
    	int t = (int) tw;
    	
    	
    	
    	
    	if(price >= 500000) {
    		System.out.println(price-t);
    	}else if(price >= 300000) {
    		System.out.println(price-tt);
    	}else if(price >= 100000) {
    		System.out.println(price-f);
    	} else {
    		System.out.println(price);
    	}
    	
    	
    	
    	
    	

    }


    /*
        각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류한다.
        입력받은 각에 따라 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 출력하세요.
     */
    public void practice6() {

    	
    	
    	System.out.print("각 > :");
    	int angle = sc.nextInt();
    	
    	if(angle == 180) {
    		System.out.println("4");
    	}else if (angle > 90 && angle < 180) {
    		System.out.println("3");
    	}else if (angle == 90) {
    		System.out.println("2");
    	}else if (angle > 0 && angle < 90) {
    		System.out.print("1");
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    }


    /*
      아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
      로그인 성공 시 “로그인 성공”, 
      아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
      비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

      아이디 : happy
      비밀번호 : 1234
      로그인 성공!
 
      아이디 : happy
      비밀번호 : 23467
      비밀번호가 틀렸습니다.

      아이디 : happy222
      비밀번호 : 1234
      아이디가 틀렸습니다.
    */
    public void practice7() {
 
    	System.out.print("아이디 :");
    	String id = sc.nextLine();
    	System.out.print("비밀번호 :");
    	int pw = sc.nextInt();
    	
    
		if (pw == 1234) {
			if ("happy".equals(id)) {
				System.out.println("로그인 성공!");
			} else if (id != "happy") {
				System.out.println("아이디가 틀렸습니다.");
			}

		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
    	
    	
    	
    	
    	
    }

    /*
        키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
        저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
        BMI = 몸무게 / (키(m) * 키(m))
        BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
        BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
        BMI가 30이상일 경우 고도 비만

        키(m)를 입력해 주세요 : 1.62
        몸무게(kg)를 입력해 주세요 : 46
        BMI 지수 : 17.527815881725342
        저체중

     */
    public void practice8() {
    	
    	
    	System.out.print("키(m)를 입력해 주세요 : ");
    	double height = sc.nextDouble();
    	System.out.print("몸무게(kg)를 입력해 주세요 : ");
    	int kg = sc.nextInt();
    	
    	
    	
    	double bmi = kg/(height*height);
    	
    	System.out.println(bmi);
    	
    	if( bmi < 18.5) {
    		System.out.println("저체중");
    	} else if (bmi < 23 ) {
    		System.out.println("정상체중");
    	}else if( bmi < 25) {
    		System.out.println("과체중");
    	}else if ( bmi <30) {
    		System.out.println("비만");
    	}else   
    		System.out.println("고도비만");
    	}
    	
       
    

    /*
        키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
        (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
        “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)

        피연산자1 입력 : 15
        피연산자2 입력 : 4
        연산자를 입력(+,-,*,/,%) : /
        15 / 4 = 3

     */
    public void practice9() {
    	
    	String va = "";
    	
    	
    	
    	System.out.print("피연산자1 입력 : ");
    	int num1 = sc.nextInt();
    	System.out.print("피연산자2 입력 : ");
    	int num2 = sc.nextInt();
    	System.out.print("연산자를 입력(+,-,*,/,%) : ");
    	 va = sc.next();
  	 
    	int a =num1+num2;
    	int b = num1-num2;
    	int c = num1*num2;
    	int d = num1/num2;
    	int e = num1%num2;
    	 
    	if("+".equals(va)) { 
    	System.out.println(num1+" "+va+" "+num2+" = "+a);
    	} else if("-".equals(va)) {
    		System.out.println(num1+" "+va+" "+num2+" = "+b);	
    	} else if("*".equals(va)) {
    		System.out.println(num1+" "+va+" "+num2+" = "+c);	
    	} else if("/".equals(va)) {
    		System.out.println(num1+" "+va+" "+num2+" = "+d);
    	} else if("%".equals(va)) {
    		System.out.println(num1+" "+va+" "+num2+" = "+e);
    	}
    	
    	
    	
    	
    	
    	

    }

    /*
      아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
      종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요

        1. 입력
        2. 수정
        3. 조회
        4. 삭제
        9. 종료
        메뉴 번호를 입력하세요 : 3
        조회 메뉴입니다.
     */
    public void practice10() {
    	
    	
    	System.out.println("1. 입력");
    	System.out.println("2. 수정");
    	System.out.println("3. 조회");
    	System.out.println("4. 삭제");
    	System.out.println("9. 종료");
  	
    	System.out.print("메뉴 번호를 입력하세요 : ");
    	int num = sc.nextInt();
   	  	
    	switch(num) {
    	case 1: System.out.println("입력 메뉴입니다.");
    	break;
    	case 2: System.out.println("수정 메뉴입니다.");
    	break;
    	case 3: System.out.println("조회 메뉴입니다.");
    	break;
    	case 4: System.out.println("삭제 메뉴입니다.");
    	break;
    	case 9: System.out.println("프로그램이 종료됩니다.");
    	
    	}


    }

    /*
        중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
        총 점 100점 중 배점으로는 다음과 같다.
        중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)

        이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력

        총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
        아니면 Fail을 출력하세요.


        중간 고사 점수 : 80
        기말 고사 점수 : 90
        과제 점수 : 50
        출석 회수 : 15
        ===========결과==========
        중간 고사 점수(20) : 16.0
        기말 고사 점수(30) : 27.0
        과제 점수 (30) : 15.0
        출석 점수 (20) : 15.0
        총점 : 73.0
        PASS

        중간 고사 점수 : 80
        기말 고사 점수 : 30
        과제 점수 : 60
        출석 회수 : 18
        ===========결과==========
        FAIL [점수 미달] (총점 61.0)

        중간 고사 점수 : 90
        기말 고사 점수 : 100
        과제 점수 : 80
        출석 회수 : 13
        ===========결과==========
        FAIL [출석 횟수 부족] (13/20)

        중간 고사 점수 : 100
        기말 고사 점수 : 80
        과제 점수 : 40
        출석 회수 : 10
        ===========결과==========
        FAIL [출석 횟수 부족] (10/20)
        FAIL [점수 미달] (총점 66.0)

     */
    public void practice11() {
    	
    	
    	System.out.print("중간 고사 점수 : ");
    	int middle = sc.nextInt();
    	System.out.print("기말 고사 점수 : ");
    	int last = sc.nextInt();
    	System.out.print("과제 점수 : ");
    	int test = sc.nextInt();
    	System.out.print("출석 회수 : ");
    	int work = sc.nextInt();
    	System.out.println("===========결과==========");
    	
    	
    	double middle1 = middle*0.2;
    	double last1 = last*0.3;
    	double test1 = test*0.3;
    	
    	double to = (middle1+last1+test1+work);
    	
    	if(to>=70 && work >= 14) {
    		System.out.println("중간 고사 점수(20) : "+middle1);
    		System.out.println("기말 고사 점수(30) : "+last1);
    		System.out.println("과제 점수(30) : "+test1);
    		System.out.println("출석 점수(20) : "+(double)work);
    		System.out.println("총점 : "+to); 		
    		System.out.println("Pass");
    	}else if (work < 14 ){
    		System.out.println("FAIL [출석 횟수 부족] ("+work+"/20)");
    	}
    	 if (to<70) {
    		System.out.println("FAIL [점수 미달] (총점 "+to+")");
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        
    }
    
}
	