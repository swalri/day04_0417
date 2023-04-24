package if_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
/*
if(조건신){ //if의 조건이 참인 경우 실행
	종속문장
}else{ //if의 조건이 거짓인 경우 실행
	종속문장
}
 if문은 단독으로 사용가능하지만 else문은 if문 다음에 와야한다.
 결과적으로 if 또는 else 둘 중 하나만 실행된다.
*/
		
//		int num;
//		System.out.println("수 입력");
//		num = scan.nextInt();
//		
//		if(num%3==0) {
//			System.out.println("3의 배수");
//		}else {
//			System.out.println("3의 배수 아님");
//		}System.out.println("다음");
		
		//수를 입력 받아 0보다 크고 100보다 작으면 정상 아니면 비정상 출력
		int num1;
		System.out.println("수 입력");
		num1 = scan.nextInt();
		if(num1>0 && num1<100) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
//		(num1>0 && num1<100)?System.out.println("정상");:System.out.println("비정상");;
		
		
		
	}
}
