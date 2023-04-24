package if_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
/*
if, else if 또는 else 중 하나만 실행된다.
if(조건식){
	종속문장
}
else if(조건식){
	종속문장
}
else if(조건식){
	종속문장
}
else{
	종속문장
}
*/
//		int num;
//		System.out.println("수 입력");
//		num = scan.nextInt();
//		
//		if(num>100) {
//			System.out.println("100보다 크다");
//		}
//		else if(num>50) {
//			System.out.println("50보다 크다");
//		}
//		else if(num>30) {
//			System.out.println("30보다 크다");
//		}
//		else {
//			System.out.println("30과 같거나 작은 수");
//		}System.out.println("다음실행");
	
		//커피의 개당 가격은 2000원이다 10개 초과하면 초과하는 양에대해서만 개당 1500원씩받는다
		int num_c, pl = 0, price=0; //num_c = 커피개수, pl = 10개를 초과했을 때 초과한 개수, price = 총 가격
		final int c_price = 2000, pl_price = 1500; //c_price = 기본커피가격, pl_price = 10초과 했을 때 초과한 개수의 개당 커피가격
		
		System.out.println("커피 몇 잔? "); 
		num_c = scan.nextInt();
		 
		if(num_c > 10)pl=num_c-10;
		
		price = c_price*(num_c-pl)+pl_price*pl;
		System.out.println("커피 "+num_c+"잔의 가격은 "+price+"원 입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
